package com.example.springbootswagger2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
//@RequestMapping(value = "/helloworld")
public class HelloWorld {
    
    //private ActivityBl planBl;
    //private TransactionBl transactionBl;

    /*
    @Autowired
    public HelloWorldApi(ActivityBl planBl, TransactionBl transactionBl){
        this.planBl = planBl;
        this.transactionBl=transactionBl;
    }*/

    @RequestMapping(value = "/hola", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloworld() {
        return "Hola mundo";
    }
    
}
