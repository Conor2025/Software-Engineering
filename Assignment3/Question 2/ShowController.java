package com.example.demo.tvShowController;

import com.example.demo.tvModel.Show;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.Arrays;

@Controller
public class ShowController {
    @GetMapping("/")
    public String index(Model model) {
        List<Show> shows = Arrays.asList(
            new Show("Breaking Bad", "Ozymandias", 10.0),
            new Show("Attack on Titan", "Hero", 9.9)
        );
        model.addAttribute("shows", shows);
        return "shows"; 
    }
    
}
