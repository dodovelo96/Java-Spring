/**
 * 
 */
package com.example.helloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author anhmi
 *
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/hello-world")
    public String helloWorld(Model model) {
        model.addAttribute("hello", "Hello Spring MVC!");
        return "helloWorld";
    }
}
