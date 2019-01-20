package com.example.dell.mengmian;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BilibiliActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private Fragment homeFragment;
    private Fragment secondFragment;
    private Fragment thirdFragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragmentManager.beginTransaction().replace(R.id.fragment_container,homeFragment).commit();
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilibili);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        fragmentManager = getSupportFragmentManager();
        homeFragment = new HomeFragment();
        secondFragment = new SecondFragment();
        thirdFragment = new ThirdFragment();
        fragmentManager.beginTransaction().add(R.id.fragment_container, secondFragment).commit();
        fragmentManager.beginTransaction().add(R.id.fragment_container, thirdFragment).commit();
        fragmentManager.beginTransaction().add(R.id.fragment_container, homeFragment).commit();
    }

}