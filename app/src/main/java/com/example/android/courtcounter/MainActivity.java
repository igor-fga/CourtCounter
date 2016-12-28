package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 3 points.
     * @param view
     */
    public void addThreeForTeamA(View view)
    {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Increase the score for Team A by 2 points.
     * @param view
     */
    public void addTwoForTeamA(View view)
    {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 1 points.
     * @param view
     */
    public void addOneForTeamA(View view)
    {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 3 points.
     * @param view
     */
    public void addThreeForTeamB(View view)
    {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Increase the score for Team B by 2 points.
     * @param view
     */
    public void addTwoForTeamB(View view)
    {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 1 points.
     * @param view
     */
    public void addOneForTeamB(View view)
    {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void ResetScore(View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Exibe a pontuação dada para o Grupo B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
