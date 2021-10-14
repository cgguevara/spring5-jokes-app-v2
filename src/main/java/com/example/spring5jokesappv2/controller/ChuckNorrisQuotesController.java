package com.example.spring5jokesappv2.controller;

import com.example.spring5jokesappv2.services.ChuckNorrisQuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisQuotesController {

    @Autowired
    ChuckNorrisQuotesService chuckNorrisQuotesService;

    public ChuckNorrisQuotesController(ChuckNorrisQuotesService chuckNorrisQuotesService) {
        this.chuckNorrisQuotesService = chuckNorrisQuotesService;
    }

    @RequestMapping({"/", ""})
    public String getQuote(Model model){
        model.addAttribute("joke", chuckNorrisQuotesService.getQuote());
        return "index";
    }

}
