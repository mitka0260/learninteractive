package edu.learninteractive.learninteractive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class CheckingController {

    int i;

    @Autowired
    MainController mainController;

    @GetMapping("/symbolsMeTest/check")
    public Integer symbolsMeCheck(
            @RequestParam("questionMe") String question,
            @RequestParam("answerMe") String answer
    ) {

        if (isAlpha(answer)) {
            for (int j = 0; j < mainController.meSymbolsArray.length; j++) {
                if (question.equals(mainController.meSymbolsArray[j][1])) {
                    if (answer.equals(mainController.meSymbolsArray[j][0])) {
                        return 1;
                    }
                }
            }
        } else {
            return 0;
        }

        return 0;

    }

    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

    @GetMapping("/symbolsMeTest/newQuestion")
    public String symbolsMeNewQuestion() {
        i = (int) (Math.random() * 12);
        return mainController.meSymbolsArray[i][1];
    }

}
