package com.jap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SiteController {
    @RequestMapping(value = {"/","index"}, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "Добро пожаловать");
        return "index";
    }

    @RequestMapping(value = {"/game"}, method = RequestMethod.GET)
    public String game(Model model){
        model.addAttribute("message", "зззззз");
        return "index";
    }

}
