package com.slypro.coursework2.service;

import com.slypro.coursework2.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}