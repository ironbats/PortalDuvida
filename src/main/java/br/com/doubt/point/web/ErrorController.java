package br.com.doubt.point.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController  implements org.springframework.boot.web.servlet.error.ErrorController {

private static final String PATH  = "/error";


  @GetMapping
  public String error()
  {
     return "errorPage";
  }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
