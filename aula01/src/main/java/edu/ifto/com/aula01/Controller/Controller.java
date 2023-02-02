package edu.ifto.com.aula01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @GetMapping("/hello")
  public String hello(@RequestParam(value = "name" , defaultValue = "Word") String name) {
        return String.format("Hello %s!", name);
  }
  
}
