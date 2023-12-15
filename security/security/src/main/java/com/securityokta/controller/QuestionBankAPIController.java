package com.securityokta.controller;

import com.securityokta.data.Category;
import com.securityokta.data.QuestionAnswers;
import com.securityokta.service.QuestionBankService;
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
