package com.trideep.springbootdemoapp.controller;

import com.trideep.springbootdemoapp.pojo.GOTQuote;
import com.trideep.springbootdemoapp.service.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GOTQuotesController {

    @Autowired
    QuotesService quotesService;

    @GetMapping("/quote")
    public ResponseEntity<GOTQuote> randomGOTQuote() {
        return quotesService.randomGOTQuote();
    }

    @GetMapping("/quotes")
    public ResponseEntity<List> randomGOTQuotes() {
        return quotesService.randomGOTQuotes();
    }
}
