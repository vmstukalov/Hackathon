package ru.hackathon.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"ru.hackathon.config", "ru.hackathon.entities", "ru.hackathon.impl", "ru.hackathon.services", "ru.hackathon.controllers", "ru.hackathon.services.repo"})
public class SpringRootConfig {
}
