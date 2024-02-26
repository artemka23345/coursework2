package com.slypro.coursework2.service.impl;

import com.slypro.coursework2.exceptions.QuestionIsNotExistException;
import com.slypro.coursework2.model.Question;
import com.slypro.coursework2.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionServiceImpl implements QuestionService {
    private final Random random = new Random();
    private final Set<Question> questions;

    public JavaQuestionServiceImpl() {
        this.questions = new HashSet<>(Set.of(
                new Question("Вопрос",
                        "Ответ"),
                new Question("Вопрос2",
                        "Ответ2"),
                new Question("Вопрос3",
                        "Ответ3"),
                new Question("Вопрос4",
                        "Ответ4")
        ));
    }

    @Override
    public Question add(String question, String answer) {
        Question question1 = new Question(question, answer);
        questions.add(question1);
        return question1;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (questions.contains(question)) {
            questions.remove(question);
            return question;
        }
        throw new QuestionIsNotExistException();
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableSet(questions);
    }

    @Override
    public Question getRandomQuestion() {
        int randomQuestionIndex = random.nextInt(questions.size());
        return questions.stream().toList().get(randomQuestionIndex);
    }
}
