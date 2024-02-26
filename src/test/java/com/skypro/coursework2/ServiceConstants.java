package com.skypro.coursework2;

import com.skypro.coursework2.model.Question;

import java.util.HashSet;
import java.util.Set;

public class ServiceConstants {
    public static final Question QUESTION_1 = new Question("Вопрос1", "Ответ1");
    public static final Question QUESTION_2 = new Question("Вопрос2", "Ответ2");

    public static final Set<Question> QUESTIONS = new HashSet<>(Set.of(
            new Question("Вопрос", "Ответ"),
            new Question("Вопрос2", "Ответ2"),
            new Question("Вопрос3", "Ответ3"),
            new Question("Вопрос4", "Ответ4")
    ));

}
