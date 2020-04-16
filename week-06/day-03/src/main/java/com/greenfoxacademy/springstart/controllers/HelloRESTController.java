package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  private AtomicLong counter = new AtomicLong();

  /*@RequestMapping(value="/greeting", method = RequestMethod.GET)
  public Greeting greeting(){
    return new Greeting(1, "Hello World");
  }*/

  @RequestMapping(value="/greeting", method = RequestMethod.GET)
  public Greeting greeting(@RequestParam(value = "name") String name){
    return new Greeting(counter.incrementAndGet(), "Hello " + name);
  }
}
