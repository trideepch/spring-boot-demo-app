package com.trideep.springbootdemoapp.service;

import com.trideep.springbootdemoapp.pojo.GOTQuote;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuotesService {
    ResponseEntity<GOTQuote> randomGOTQuote();
    ResponseEntity<List> randomGOTQuotes();
}
