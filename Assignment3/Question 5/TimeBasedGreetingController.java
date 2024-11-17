package com.example.demo.timeBasedController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TimeBasedGreetingController {
    @GetMapping("/")
    public String displayGreeting(Model model) {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();

        String timeOfDay;
        if (hour >= 5 && hour < 12) {
            timeOfDay = "Morning";
        } else if (hour >= 12 && hour < 17) {
            timeOfDay = "Afternoon";
        } else {
            timeOfDay = "Evening";
        }

        model.addAttribute("timeOfDay", timeOfDay);
        return "timeBasedGreeting";

    }
    
}
