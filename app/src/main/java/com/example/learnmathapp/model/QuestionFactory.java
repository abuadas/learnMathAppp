package com.example.learnmathapp.model;

public class QuestionFactory {
    public IQuestionDA getModel(){
        return new QuestionDA();
    }
}
