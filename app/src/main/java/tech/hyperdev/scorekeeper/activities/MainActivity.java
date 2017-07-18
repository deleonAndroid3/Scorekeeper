package tech.hyperdev.scorekeeper.activities;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tech.hyperdev.scorekeeper.R;
import tech.hyperdev.scorekeeper.fragments.ScoreFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        ScoreFragment SF1 = ScoreFragment.newInstance(getString(R.string.team_1));
        ScoreFragment SF2 = ScoreFragment.newInstance(getString(R.string.team_2));

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.FM1,SF1);
        fragmentTransaction.add(R.id.FM2,SF2);

        fragmentTransaction.commit();
    }
}
