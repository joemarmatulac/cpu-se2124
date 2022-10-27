package edu.cpu.se4.se2124.rest;

import edu.cpu.se4.se2124.model.SampleMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //http://localhost:8080/api
public class HelloWebService {

    @GetMapping(path = "sayhello") //http://localhost:8080/api/sayhello
    public String sayHelloSe(){
        SampleMessage sm = new SampleMessage();
        sm.setMessage("Hello students");
        sm.setSender("Sir Ma");
        return sm.getMessage() + " from " + sm.getSender();
    }
}
