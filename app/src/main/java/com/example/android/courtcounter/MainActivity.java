package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsA(View v){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoPointsA(View v){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void addOnePointA(View v){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //methods for team b
    public void addThreePointsB(View v){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoPointsB(View v){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    public void addOnePointB(View v){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //Reset points
    public void resetPoints(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
