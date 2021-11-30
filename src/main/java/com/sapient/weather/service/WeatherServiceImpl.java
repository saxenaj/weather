package com.sapient.weather.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService{

    @Value("${weather.app.hotincelcius}")
    private String hotincelcius;

    @Value("${weather.app.windinmph}")
    private String windinmph;

    @Value("weather.app.endpoint.api")
    private String endpoint;

    @Override
    public Object getWeather(String city) {
        System.out.println("hotincelcius-->>" + hotincelcius);
        System.out.println("windinmph-->>" + windinmph);
        return null;
    }


}
