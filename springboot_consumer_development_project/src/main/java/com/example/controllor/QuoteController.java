package com.example.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.example.quote.QuoteResponse;

@Controller
public class QuoteController {

	
	 @Autowired
	    private RestTemplate restTemplate;

	    @GetMapping("/quotes")
	    public String getQuotes(Model model) {
	        String url = "https://dummyjson.com/quotes";
	        ResponseEntity<QuoteResponse> response = restTemplate.getForEntity(url, QuoteResponse.class);

	        if (response.getBody() != null) {
	            model.addAttribute("quotes", response.getBody().getQuotes());
	        }
	        return "quotes";
	    }
}
