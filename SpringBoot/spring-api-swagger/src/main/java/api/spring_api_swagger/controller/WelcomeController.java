package api.spring_api_swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//suporta rqeuisições http
@RequestMapping("hi")//define a url a ser chamada para esse controler
public class WelcomeController {

    //GET expondo algo pro user nossa que delicia o primeiro code
    @GetMapping
    public String welcome(){
        return "Welcome budy, to my first springboot controller";
    }
}
