package edu.learninteractive.learninteractive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    public static String[][] meSymbolsArray = new String[][]{
            {"Au", "Gold"},
            {"Ag", "Silver"},
            {"Hg", "Mercury"},
            {"Fe", "Iron"},
            {"Cu", "Copper"},
            {"Sn", "Tin"},
            {"Pb", "Lead"},
            {"Zn", "Zinc"},
            {"Al", "Aluminium"},
            {"Na", "Sodium"},
            {"K", "Potassium"},
            {"Mg", "Magnesium"}
    };
    int i;

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
        meSymbolsArray = new String[][]{
                {"Au", "Gold"},
                {"Ag", "Silver"},
                {"Hg", "Mercury"},
                {"Fe", "Iron"},
                {"Cu", "Copper"},
                {"Sn", "Tin"},
                {"Pb", "Lead"},
                {"Zn", "Zinc"},
                {"Al", "Aluminium"},
                {"Na", "Sodium"},
                {"K", "Potassium"},
                {"Mg", "Magnesium"}
        };

        return "symbolsMeTest";

    }

    @GetMapping("/symbolsNonMeTest")
    public String symbolsNonMeTest() {
        return "symbolsNonMeTest";
    }

}
