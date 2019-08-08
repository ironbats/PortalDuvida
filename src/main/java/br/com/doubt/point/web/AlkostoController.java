package br.com.doubt.point.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alkosto")
public class AlkostoController {


    @GetMapping
    public String alkosto()
    {
        return "alkosto";
    }
}
