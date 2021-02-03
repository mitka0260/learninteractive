package edu.learninteractive.learninteractive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckingController {

    @Autowired
    MainController mainController;

    @GetMapping("/symbolsMeTest/check/{answer}")
    public String symbolsMeTest(@PathVariable("answer") String answer) {
        if(answer.equals(mainController.meSymbolsArray[0][0]))
            return "right";
        else
            return "not right";
    }

}
