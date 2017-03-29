package com.example.rkesavan.soccerscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView teamAScore;
    private TextView teamBScore;

    private int scoreA;
    private int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.teamAScore = (TextView) findViewById(R.id.scoreTeamA);
        this.teamBScore = (TextView) findViewById(R.id.scoreTeamB);
    }

    public void decrementTeamA(View view) {
        this.scoreA--;
        this.updateTeamAScore();
    }

    public void incrementTeamA(View view) {
        this.scoreA++;
        this.updateTeamAScore();
    }

    public void decrementTeamB(View view) {
        this.scoreB--;
        this.updateTeamBScore();
    }

    public void incrementTeamB(View view) {
        this.scoreB++;
        this.updateTeamBScore();
    }

    public void updateTeamAScore() {
        this.teamAScore.setText(String.valueOf(scoreA));
    }

    public void updateTeamBScore() {
        this.teamBScore.setText(String.valueOf(scoreB));
    }
}
