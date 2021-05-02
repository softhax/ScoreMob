package com.softhax.scoremob;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button goal_teamA,goal_teamB,gameover;
        TextView scoreA,scoreB;
        goal_teamA = findViewById(R.id.goal_teamA);
        goal_teamB = findViewById(R.id.goal_teamB);
        gameover = findViewById(R.id.gameover_button);
        scoreA = findViewById(R.id.score_teama);
        scoreB = findViewById(R.id.score_teamb);

        goal_teamA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(scoreA.getText().toString());
                score++;
                scoreA.setText(Integer.toString(score));

                Toast.makeText(MainActivity.this,"Team A scored !!!",Toast.LENGTH_SHORT).show();

            }
        });

        goal_teamB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int score = Integer.parseInt(scoreB.getText().toString());
                score++;
                scoreB.setText(Integer.toString(score));
                Toast.makeText(MainActivity.this,"Team B scored !!!",Toast.LENGTH_SHORT).show();
            }
        });

        gameover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(scoreA.getText().toString());
                int b = Integer.parseInt(scoreB.getText().toString());

                if(a>b)
                {
                    Toast.makeText(MainActivity.this,"Team A won !!",Toast.LENGTH_LONG).show();
                }
                else if(a<b)
                {
                    Toast.makeText(MainActivity.this,"Team B won !!",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Match Drawn !!",Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}