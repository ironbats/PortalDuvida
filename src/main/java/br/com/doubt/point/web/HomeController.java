package br.com.doubt.point.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {


    @GetMapping
    public String home()
    {
        return "home";
    }


    @PostMapping("/carrefour-page")
    private String carrefour()
    {
        return "redirect:carrefour";
    }
}
