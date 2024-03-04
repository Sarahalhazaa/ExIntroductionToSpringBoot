package com.example.exintroductiontospringboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;


@RestController
public class welcomeController {

    @GetMapping(path= "/name")
    public String name(){
        return  "My name is Sara";
    }

    @GetMapping(path = "/age")
    public String age(){
        return "My age is 23";
    }

    @GetMapping(path = "/status")
    public String status(){
        return "Everything OK";
    }

    @GetMapping(path = "/health")
    public String health(){
        return "Server health is up and running";
    }

    @GetMapping(path = "/names")
    public ArrayList names(){
        ArrayList<String> N = new ArrayList<>();
        N.add("SARA");
        N.add("NADA");
        N.add("MAJD");
        N.add("MAHA");
        N.add("YARA");
        return N;
    }

}
