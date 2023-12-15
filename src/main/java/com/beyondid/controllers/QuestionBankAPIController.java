package com.beyondid.controllers;

import com.beyondid.data.Category;
import com.beyondid.data.QuestionAnswers;
import com.beyondid.service.QuestionBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuestionBankAPIController {
    @Autowired
    private QuestionBankService questionBankService;

    @RequestMapping("/questions")
    List<QuestionAnswers> fetchAllQuestionsAndAnswers() {
        return questionBankService.fetchAllQuestionsAndAnswers();
    }

    @RequestMapping("/categories")
    List<Category> fetchAllCategories() {
        return questionBankService.fetchAllCategories();
    }
}
