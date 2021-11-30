package com.sapient.weather.controller;

import com.sapient.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    public WeatherService weatherService;

    @GetMapping("/{city}")
    public Object getWeatherInfo(@PathVariable("city") String city) {



        return weatherService.getWeather(city);
    }
}
