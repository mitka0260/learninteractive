package edu.learninteractive.learninteractive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

    public String[][] meSymbolsArray = new String[3][2];

    @GetMapping("/")
    public String homepage(Model model) {
        model.addAttribute("title", "Learn Interactive");
        return "home";
    }

    @GetMapping("/contact")
    public String contactpage(Model model) {
        model.addAttribute("title", "Написать");
        return "contact";
    }

    @GetMapping("/symbols")
    public String symbolsMe() {
        return "symbols";
    }

    @GetMapping("/symbolsMeTest")
    public String symbolsMeTest() {
        meSymbolsArray = new String[][]{{"Na", "Натрий"}, {"K", "Калий"}, {"Mg", "Магний"}};
        System.out.println(meSymbolsArray[0][0]);//Na
        System.out.println(meSymbolsArray[0][1]);//натрий
        System.out.println(meSymbolsArray[1][0]);//K
        System.out.println(meSymbolsArray[1][1]);//калий
        System.out.println(meSymbolsArray[2][0]);//Mg
        System.out.println(meSymbolsArray[2][1]);//магний
        return "symbolsMeTest";
    }

    @GetMapping("/symbolsNonMeTest")
    public String symbolsNonMeTest() {
        return "symbolsNonMeTest";
    }

}
