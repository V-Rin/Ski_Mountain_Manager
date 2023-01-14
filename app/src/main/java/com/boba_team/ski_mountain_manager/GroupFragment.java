package com.boba_team.ski_mountain_manager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GroupFragment extends Fragment{

    public GroupFragment() {}

    public static GroupFragment newInstance() {
        return new GroupFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_group, container, false);
    }
}
