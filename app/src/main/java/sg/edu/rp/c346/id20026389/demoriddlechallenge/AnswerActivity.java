package sg.edu.rp.c346.id20026389.demoriddlechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        tvAnswer=findViewById(R.id.textViewAnswer);
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        if(questionsSelected.trim().equalsIgnoreCase("Q1")){
            tvAnswer.setText(questionsSelected + " answer is: Queue");
        }
        else if(questionsSelected.trim().equalsIgnoreCase("Q2")){
            tvAnswer.setText(questionsSelected + " answer is: Gone");
        }
    }
}