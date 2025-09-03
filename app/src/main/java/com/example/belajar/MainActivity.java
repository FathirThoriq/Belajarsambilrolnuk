package com.example.belajar;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    MaterialButton tab1, tab2, tab3;
    LinearLayout homeTab;
    ScrollView profileTab, settingsTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tab1 = findViewById(R.id.tab1);
        tab2 = findViewById(R.id.tab2);
        tab3 = findViewById(R.id.tab3);


        homeTab = findViewById(R.id.home_tab);
        profileTab = findViewById(R.id.profile_tab);
        settingsTab = findViewById(R.id.settings_tab);


        showTab(1);


        tab1.setOnClickListener(v -> showTab(1));
        tab2.setOnClickListener(v -> showTab(2));
        tab3.setOnClickListener(v -> showTab(3));
    }

    private void showTab(int tabNumber) {

        homeTab.setVisibility(View.GONE);
        profileTab.setVisibility(View.GONE);
        settingsTab.setVisibility(View.GONE);


        resetTabColors();

        if (tabNumber == 1) {
            homeTab.setVisibility(View.VISIBLE);
            activateTab(tab1);
        } else if (tabNumber == 2) {
            profileTab.setVisibility(View.VISIBLE);
            activateTab(tab2);
        } else if (tabNumber == 3) {
            settingsTab.setVisibility(View.VISIBLE);
            activateTab(tab3);
        }
    }

    private void resetTabColors() {
        tab1.setBackgroundTintList(ContextCompat.getColorStateList(this, android.R.color.white));
        tab2.setBackgroundTintList(ContextCompat.getColorStateList(this, android.R.color.white));
        tab3.setBackgroundTintList(ContextCompat.getColorStateList(this, android.R.color.white));

        tab1.setTextColor(ContextCompat.getColor(this, android.R.color.black));
        tab2.setTextColor(ContextCompat.getColor(this, android.R.color.black));
        tab3.setTextColor(ContextCompat.getColor(this, android.R.color.black));
    }

    private void activateTab(MaterialButton tab) {
        tab.setBackgroundTintList(ContextCompat.getColorStateList(this, android.R.color.holo_blue_dark));
        tab.setTextColor(ContextCompat.getColor(this, android.R.color.white));
    }
}
