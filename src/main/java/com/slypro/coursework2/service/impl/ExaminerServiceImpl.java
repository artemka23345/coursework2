package com.slypro.coursework2.service.impl;

import com.slypro.coursework2.exceptions.QuestionInvalidAmountException;
import com.slypro.coursework2.model.Question;
import com.slypro.coursework2.service.ExaminerService;
import com.slypro.coursework2.service.QuestionService;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService service;

    public ExaminerServiceImpl(QuestionService service) {
        this.service = service;
    }


    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> questions = new HashSet<>();
        if (amount <= 0 || amount > service.getAll().size()) {
            throw new QuestionInvalidAmountException();
        }
        while (questions.size() != amount) {
            questions.add(service.getRandomQuestion());
        }

        return questions;
    }
}
