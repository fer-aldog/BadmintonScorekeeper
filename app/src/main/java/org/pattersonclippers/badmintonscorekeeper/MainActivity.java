package org.pattersonclippers.badmintonscorekeeper;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    TextView scoreATV, faultATV, scoreBTV, faultBTV;
    int scoreA, faultA, scoreB, faultB;
    Button updAscoreBTN, updAfaultBTN, updBscoreBTN, updBfaultBTN, resetBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreA = 0; scoreB = 0; faultA = 0; faultB = 0;
        scoreATV = (TextView) findViewById(R.id.scoreATV);
        faultATV = (TextView) findViewById(R.id.faultATV);
        updAscoreBTN = (Button) findViewById(R.id.updAscoreBTN);
        updAfaultBTN = (Button) findViewById(R.id.updAfaultBTN);
        scoreBTV = (TextView) findViewById(R.id.scoreBTV);
        faultBTV = (TextView) findViewById(R.id.faultBTV);
        updBscoreBTN = (Button) findViewById(R.id.updBscoreBTN);
        updBfaultBTN = (Button) findViewById(R.id.updBfaultBTN);
        resetBTN = (Button) findViewById(R.id.resetBTN);

        updAscoreBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //update team A's score
                String addScoreA;
                scoreA++;
                if(scoreA >= 10) {
                    addScoreA = "" + scoreA;
                }
                else {
                    addScoreA = "0" + scoreA;
                }
                scoreATV.setText(addScoreA);
            }
        });

        updAfaultBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //update team A's faults
                String addFaultA;
                faultA++;
                if(faultA >= 10) {
                    addFaultA = "" + faultA;
                }
                else {
                    addFaultA = "0" + faultA;
                }
                faultATV.setText(addFaultA);
            }
        });

        updBscoreBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //update team B's score
                String addScoreB;
                scoreB++;
                if(scoreB >= 10) {
                    addScoreB = "" + scoreB;
                }
                else {
                    addScoreB = "0" + scoreB;
                }
                scoreBTV.setText(addScoreB);
            }
        });

        updBfaultBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //update team B's faults
                String addFaultB;
                faultB++;
                if(faultB >= 10) {
                    addFaultB = "" + faultB;
                }
                else {
                    addFaultB = "0" + faultB;
                }
                faultBTV.setText(addFaultB);
            }
        });

        resetBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //reset everything
                String addScoreA = "00";
                scoreATV.setText(addScoreA);
                String addfaultA = "00";
                faultATV.setText(addfaultA);
                String addScoreB = "00";
                scoreBTV.setText(addScoreB);
                String addfaultB = "00";
                faultBTV.setText(addfaultB);
                scoreA = 0;
                faultA = 0;
                scoreB = 0;
                faultB = 0;
            }
        });
    }
}