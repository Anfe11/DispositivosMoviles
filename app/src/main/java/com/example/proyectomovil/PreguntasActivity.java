package com.example.proyectomovil;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class PreguntasActivity extends AppCompatActivity {
    Button Btn1,Btn2,Btn3,Btn4;
    TextView score, question;
    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLenght = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        r = new Random();

        Btn1 = (Button) findViewById(R.id.BtnOp1);
        Btn2 = (Button) findViewById(R.id.BtnOp2);
        Btn3 = (Button) findViewById(R.id.btnOp3);
        Btn4 = (Button) findViewById(R.id.BtnOp4);

        score = (TextView) findViewById(R.id.Puntos);
        question = (TextView) findViewById(R.id.Pregunta);
        score.setText("Puntos: "+mScore);
        updateQuestion(r.nextInt(mQuestionsLenght));

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Btn1.getText() == mAnswer){
                    mScore++;
                    score.setText("Puntos: "+mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }else{
                    gameOver();
                }

            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Btn2.getText() == mAnswer){
                    mScore++;
                    score.setText("Puntos: "+mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }else{
                    gameOver();
                }

            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Btn3.getText() == mAnswer){
                    mScore++;
                    score.setText("Puntos: "+mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }else{
                    gameOver();
                }
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Btn4.getText() == mAnswer){
                    mScore++;
                    score.setText("Puntos: "+mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }else{
                    gameOver();
                }
            }
        });

    }

    private void updateQuestion(int num){
        question.setText(mQuestions.getQuestion(num));
        Btn1.setText(mQuestions.getChoice1(num));
        Btn2.setText(mQuestions.getChoice2(num));
        Btn3.setText(mQuestions.getChoice3(num));
        Btn4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }

    private void gameOver(){

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(PreguntasActivity.this);
        alertDialogBuilder
                .setMessage("Juego Terminado! Tus puntuación es de: "+mScore+" puntos")
                .setCancelable(false)
                .setPositiveButton("Nuevo Juego",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                    startActivity(new Intent(getApplicationContext(), PreguntasActivity.class));
                                    finish();
                            }
                        })
                .setNegativeButton("Salir",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
