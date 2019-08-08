package br.com.doubt.point.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/confama")
public class ComfamController {


    @GetMapping
    public String confama(){

        return "comfama";
    }

}
