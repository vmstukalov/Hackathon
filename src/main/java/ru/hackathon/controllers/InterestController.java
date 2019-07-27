package ru.hackathon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.hackathon.entities.Interest;
import ru.hackathon.services.InterestService;

import java.util.List;

@Controller
@RequestMapping("interest")
public class InterestController {

    private InterestService interestService;

    @CrossOrigin
    @GetMapping(value = "all", produces = "application/json")
    @ResponseBody
    public List<Interest> getAllInterests() {

        return interestService.getAllInterests();
    }

    @Autowired
    public void setInterestService(InterestService interestService) {
        this.interestService = interestService;
    }
}
