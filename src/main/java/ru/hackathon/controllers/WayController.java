package ru.hackathon.controllers;

import com.sun.jdi.LongValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.hackathon.entities.Interest;
import ru.hackathon.entities.Track;
import ru.hackathon.entities.Way;
import ru.hackathon.json.JsonWay;
import ru.hackathon.services.CourseService;
import ru.hackathon.services.InterestService;
import ru.hackathon.services.TrackService;
import ru.hackathon.services.WayService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("way")
public class WayController {

    private WayService wayService;
    private InterestService interestService;
    private TrackService trackService;
    private CourseService courseService;

    @CrossOrigin
    @GetMapping(value = "byInterests", produces = "application/json")
    @ResponseBody
    public List<JsonWay> getWaysByInterest(@RequestParam("interests") String interests) {

        List<Long> longs = new ArrayList<Long>();

        String[] interestsArray = interests
                .replace("[", "")
                .replace("]", "")
                .split(",");


        List<Way> result = new ArrayList<Way>();
        List<JsonWay> jsonResult = new ArrayList<JsonWay>();


        Interest interest;

        Set<Long> u = new HashSet<Long>();


        for (String id : interestsArray) {
            interest = interestService.getById(Long.parseLong(id));

            for (Way way : interest.getWays()) {
                if (u.add(way.getId())) {
                    //result.add(way);

                    List<Track> tracks = trackService.getByWay(way);

                    JsonWay j = new JsonWay();
                    j.setId(way.getId());
                    j.setName(way.getName());
                    j.setInterests(way.getInterests());
                    j.setTracks(tracks);

                    j.setSize(way.getTracks().size());
                    jsonResult.add(j);
                }
            }


        }

        /*

        for (Way way : result) {
            JsonWay j = new JsonWay();
            j.setId(way.getId());
            j.setName(way.getName());
            j.setInterests(way.getInterests());
            j.setTracks(way.getTracks());

            j.setSize(way.getTracks().size());
            jsonResult.add(j);

        }
        */

        return jsonResult;
    }

    @Autowired
    public void setWayService(WayService wayService) {
        this.wayService = wayService;
    }

    @Autowired
    public void setInterestService(InterestService interestService) {
        this.interestService = interestService;
    }

    @Autowired
    public void setTrackService(TrackService trackService) {
        this.trackService = trackService;
    }

    @Autowired
    public CourseService getCourseService() {
        return courseService;
    }

    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }
}
