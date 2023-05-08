package com.example.learnmathapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learnmathapp.model.IQuestionDA;
import com.example.learnmathapp.model.Question;
import com.example.learnmathapp.model.QuestionFactory;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView questionTextView;
    private RadioButton ansRadioBtn1;
    private RadioButton ansRadioBtn2;
    private RadioButton ansRadioBtn3;
    private Button nextBtn;
    private int scoreSum;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView = findViewById(R.id.questionTextView);
        ansRadioBtn1 = findViewById(R.id.ansRadioBtn1);
        ansRadioBtn2 = findViewById(R.id.ansRadioBtn2);
        ansRadioBtn3 = findViewById(R.id.ansRadioBtn3);
        nextBtn = findViewById(R.id.nextBtn);
        setQuestion();
        getAns();
    }


    QuestionFactory qFactory = new QuestionFactory();
    IQuestionDA objQ = qFactory.getModel();
    List<Question>questions = objQ.getQuestion();
    private void setQuestion() {
        questionTextView.setText(questions.get(0).getQuestionTxt());
    }
    private void getAns() {

    }
    public void nextBtn(View view) {
        for(int i = 1; i < questions.size();i++){
            questionTextView.setText(questions.get(i).getQuestionTxt());
        }
    }
    public void ansRadioBtn1(View view) {
        for(int i = 1; i < questions.size();i++){
            if(ansRadioBtn1.getText().equals(questions.get(i).getAnsTxt())){
                ansRadioBtn1.setBackgroundColor(Color.parseColor("#00FF00"));
            }
            else
                ansRadioBtn1.setBackgroundColor(Color.parseColor("#FF0000"));
        }
    }

    public void ansRadioBtn2(View view) {
        for(int i = 1; i < questions.size();i++){
            if(ansRadioBtn2.getText().equals(questions.get(i).getAnsTxt())){
                ansRadioBtn2.setBackgroundColor(Color.parseColor("#00FF00"));
            }
            else
                ansRadioBtn2.setBackgroundColor(Color.parseColor("#FF0000"));
        }
    }

    public void ansRadioBtn3(View view) {
        for(int i = 1; i < questions.size();i++){
            if(ansRadioBtn3.getText().equals(questions.get(i).getAnsTxt())){
                ansRadioBtn3.setBackgroundColor(Color.parseColor("#00FF00"));
            }
            else
                ansRadioBtn3.setBackgroundColor(Color.parseColor("#FF0000"));
        }
    }

}