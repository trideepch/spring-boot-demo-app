package com.trideep.springbootdemoapp.service;

import com.trideep.springbootdemoapp.pojo.GOTQuote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuotesServiceImpl implements QuotesService {
    private static final Logger log = LoggerFactory.getLogger(QuotesService.class);

    @Autowired
    RestTemplate restTemplate;

    @Override
    public ResponseEntity<GOTQuote> randomGOTQuote() {
        return restTemplate.getForEntity("https://api.gameofthronesquotes.xyz/v1/random", GOTQuote.class);
    }

    @Override
    public ResponseEntity<List> randomGOTQuotes() {
        return restTemplate.getForEntity("https://api.gameofthronesquotes.xyz/v1/random/5", List.class);
    }
}
