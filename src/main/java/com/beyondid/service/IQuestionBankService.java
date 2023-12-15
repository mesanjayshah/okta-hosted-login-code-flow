package com.beyondid.service;



import com.beyondid.data.Category;
import com.beyondid.data.QuestionAnswers;

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
