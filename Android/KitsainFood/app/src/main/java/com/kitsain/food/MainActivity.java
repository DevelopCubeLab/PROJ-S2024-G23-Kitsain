package com.kitsain.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.kitsain.food.Fragment.HomeFragment;
import com.kitsain.food.Fragment.ItemFragment;
import com.kitsain.food.Fragment.MeFragment;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set content view
        setContentView(R.layout.main_activity);

        //TODO if not login open login activity
        startActivity(new Intent(this, LoginActivity.class));


        //on click bottom button to switch fragment
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NotNull MenuItem item) {

                //TODO Add reused code to improve performance
                Fragment selectedFragment = getSupportFragmentManager().findFragmentByTag(String.valueOf(item.getItemId()));

                if (item.getItemId() == R.id.nav_item) {
                    selectedFragment = new ItemFragment();
                } else if (item.getItemId() == R.id.nav_me) {
                    selectedFragment = new MeFragment();
                } else {
                    selectedFragment = new HomeFragment();
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        selectedFragment).commit();

                return true;
            }
        });

        // default show home fragment
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HomeFragment()).commit();
        }


    }
}
