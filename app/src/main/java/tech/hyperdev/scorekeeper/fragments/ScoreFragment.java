package tech.hyperdev.scorekeeper.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import tech.hyperdev.scorekeeper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScoreFragment extends Fragment {

    TextView mtvTeamName;

    public ScoreFragment() {
        // Required empty public constructor
    }

    public static ScoreFragment newInstance(String Team){
        ScoreFragment scoreFragment = new ScoreFragment();
        Bundle args = new Bundle();
        args.putString("team", Team);
        scoreFragment.setArguments(args);
        return scoreFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_score, container, false);
        String team = getArguments().getString("team");

        mtvTeamName = (TextView) view.findViewById(R.id.tvTeamName);

        mtvTeamName.setText(team);
        return view;
    }

}
