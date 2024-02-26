package com.skypro.coursework2.service.impl;

import com.skypro.coursework2.model.Question;
import com.skypro.coursework2.service.QuestionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static com.skypro.coursework2.ServiceConstants.QUESTIONS;
import static com.skypro.coursework2.ServiceConstants.QUESTION_2;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    @Mock
    private QuestionService javaQuestionService;
    private ExaminerServiceImpl out;


    @BeforeEach
    public void create() {
        when(javaQuestionService.getAll()).thenReturn(QUESTIONS);
        when(javaQuestionService.getRandomQuestion()).thenReturn(QUESTION_2);
        out = new ExaminerServiceImpl(javaQuestionService);
    }

    @Test
    void shouldGetAllQuestions() {
        Set<Question> expected = Set.of(QUESTION_2);
        Set<Question> result = (Set<Question>) out.getQuestions(1);
        assertIterableEquals(expected, result);
    }
}
