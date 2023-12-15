package com.securityokta.service;


import com.securityokta.data.Category;
import com.securityokta.data.QuestionAnswers;

import java.util.List;

public interface IQuestionBankService {
    List<Category> fetchAllCategories();
    List<QuestionAnswers>  fetchAllQuestionsAndAnswers();
    void saveCategory(Category category);
    void saveQuestion(QuestionAnswers question);
    void deleteQuestion(String questionId);
    void deleteCategory(String categoryId);
    Category fetchCategory(String categoryId);
    QuestionAnswers fetchQuestionAnswer(String questionId);
}
