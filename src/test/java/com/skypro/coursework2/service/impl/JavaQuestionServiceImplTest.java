package com.skypro.coursework2.service.impl;

import com.skypro.coursework2.exceptions.QuestionIsNotExistException;
import com.skypro.coursework2.model.Question;
import org.junit.jupiter.api.Test;
import com.skypro.coursework2.service.QuestionService;

import static com.skypro.coursework2.ServiceConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JavaQuestionServiceImplTest {
    private final QuestionService out = new JavaQuestionServiceImpl();


    @Test
    void shouldAddByParams() {
        Question result = out.add(QUESTION_1.getQuestion(), QUESTION_1.getAnswer());
        assertEquals(QUESTION_1, result);
    }

    @Test
    void shouldAddWithoutParams() {
        Question result = out.add(QUESTION_1);
        assertEquals(QUESTION_1, result);
    }

    @Test
    void shouldReturnQuestionForRemove() {
        Question result = out.remove(QUESTION_2);
        assertEquals(QUESTION_2, result);
    }

    @Test
    void shouldThrowQuestionNotFoundExceptionForRemoveMethod() {
        assertThrows(QuestionIsNotExistException.class,
                () -> out.remove(QUESTION_1));
    }

    @Test
    void shouldGetAll() {
        assertEquals(QUESTIONS, out.getAll());
    }
}
