package com.boba_team.ski_mountain_manager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnItemSelectedListener mOnItemSelectedListener
    = new BottomNavigationView.OnItemSelectedListener() {

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_home:
                loadFragment(HomeFragment.newInstance());
                return true;
            case R.id.navigation_map:
                loadFragment(MapFragment.newInstance());
                return true;
            case R.id.navigation_group:
                loadFragment(GroupFragment.newInstance());
                return true;
            case R.id.navigation_profile:
                loadFragment(ProfileFragment.newInstance());
                return true;
            case R.id.navigation_settings:
                loadFragment(SettingsFragment.newInstance());
                return true;
        }
        return false;
        }
    };

    private void loadFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fl_content, fragment);
            ft.commit();
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(HomeFragment.newInstance());

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationView);
        navigation.setOnItemSelectedListener(mOnItemSelectedListener);
    }
}