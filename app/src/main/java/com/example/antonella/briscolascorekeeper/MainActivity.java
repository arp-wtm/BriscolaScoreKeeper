package com.example.antonella.briscolascorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int team_a_score = 0;
    int team_b_score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds two to score and display result for Team A.
     */
    public void addTwoForTeamA(View v) {
        team_a_score = team_a_score + 2;
        displayForTeamA(team_a_score);
    }
    /**
     * Adds three to score and display result for Team A.
     */
    public void addThreeForTeamA(View v) {
        team_a_score = team_a_score + 3;
        displayForTeamA(team_a_score);
    }
    /**
     * Adds four to score and display result for Team A.
     */
    public void addFourForTeamA(View v) {
        team_a_score = team_a_score + 4;
        displayForTeamA(team_a_score);
    }
    /**
     * Adds ten to score and display result for Team A.
     */
    public void addTenForTeamA(View v) {
        team_a_score = team_a_score + 10;
        displayForTeamA(team_a_score);
    }
    /**
     * Adds eleven to score and display result for Team A.
     */
    public void addElevenForTeamA(View v) {
        team_a_score = team_a_score + 11;
        displayForTeamA(team_a_score);
    }
    /**
     * Adds two to score and display result for Team B.
     */
    public void addTwoForTeamB(View v) {
        team_b_score = team_b_score + 2;
        displayForTeamB(team_b_score);
    }
    /**
     * Adds three to score and display result for Team B.
     */
    public void addThreeForTeamB(View v) {
        team_b_score = team_b_score + 3;
        displayForTeamB(team_b_score);
    }
    /**
     * Adds four to score and display result for Team B.
     */
    public void addFourForTeamB(View v) {
        team_b_score = team_b_score + 4;
        displayForTeamB(team_b_score);
    }
    /**
     * Adds ten to score and display result for Team B.
     */
    public void addTenForTeamB(View v) {
        team_b_score = team_b_score + 10;
        displayForTeamB(team_b_score);
    }
    /**
     * Adds eleven to score and display result for Team B.
     */
    public void addElevenForTeamB(View v) {
        team_b_score = team_b_score + 11;
        displayForTeamB(team_b_score);
    }
    /**
     * Reset score and display 0 for Team A and Team B.
     */
    public void reset(View v) {

        team_a_score = 0;
        displayForTeamA(team_a_score);
        team_b_score = 0;
        displayForTeamB(team_b_score);
    }

}
