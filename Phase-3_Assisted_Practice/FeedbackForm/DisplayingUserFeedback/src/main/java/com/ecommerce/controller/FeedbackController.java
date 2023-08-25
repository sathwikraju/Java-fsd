package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.crud.FeedbackRepository;
import com.ecommerce.entity.Feedback;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    private final FeedbackRepository feedbackRepository;

    @Autowired
    public FeedbackController(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @PostMapping
    public String saveFeedback(@RequestParam String username, @RequestParam String message) {
        Feedback feedback = new Feedback();
        feedback.setUsername(username);
        feedback.setMessage(message);
        feedbackRepository.save(feedback);
        return "Feedback saved successfully!";
    }
}
