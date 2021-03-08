package edu.learninteractive.learninteractive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.SecureRandom;

@RestController
public class CheckingController {

    int i;
    int randomCheck = -1;


    // ХУЁГО ТАК
    // TODO make service
    @Autowired
    MainController mainController;

    @GetMapping("/symbolsMeTest/check")
    public Integer symbolsMeCheck(
            @RequestParam("questionMe") String question,
            @RequestParam("answerMe") String answer
    ) {

        if (!isAlpha(answer)) {
            return 0;
        }

        for (int j = 0; j < mainController.meSymbolsArray.length; j++) {
            if (question.equals(mainController.meSymbolsArray[j][1])) {
                if (answer.equals(mainController.meSymbolsArray[j][0])) {
                    return 1;
                }
            }
        }

        return 0;

    }

    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

    @GetMapping("/symbolsMeTest/newQuestion")
    public String symbolsMeNewQuestion() {
        return mainController.meSymbolsArray[genRnd()][1];
    }

    // TODO lastQuestionNr
    // TODO 12 -> array.length
    private int genRnd() {
        int random = (new SecureRandom().nextInt(12));
        if(random != randomCheck) {
            randomCheck = random;
            return random;
        } else {
            genRnd();
        }
        return 0;
    }

}
