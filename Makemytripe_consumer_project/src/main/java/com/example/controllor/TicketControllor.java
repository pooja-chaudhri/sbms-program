package com.example.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.Ticket;

public class TicketControllor {

	
	 @Autowired
	    private WebClient.Builder webClientBuilder;

	    private static final String IRCTC_API_BASE_URL = "https://www.classes.ashokit.in/api/tickets";


	    @GetMapping("/book-ticket")
	    public String bookTicketForm(Model model) {
	        model.addAttribute("ticket", new Ticket());
	        return "book-ticket";
	    }
}


	    

	   

