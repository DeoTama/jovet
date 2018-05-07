package com.example.pengalatdite.jovet;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.pengalatdite.jovet.Fragment.AnimalsFragment;
import com.example.pengalatdite.jovet.Fragment.BookingFragment;
import com.example.pengalatdite.jovet.Fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;

    private BookingFragment bookingFragment;
    private AnimalsFragment animalsFragment;
    private ProfileFragment profileFragment;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainFrame = (FrameLayout) findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView) findViewById(R.id.main_nav);

        bookingFragment = new BookingFragment();
        animalsFragment = new AnimalsFragment();
        profileFragment = new ProfileFragment();

        setFragment(bookingFragment);

        bottomNavigationView(mMainNav);

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.nav_booking:
                        mMainNav.setItemBackgroundResource(R.color.colorLightOrange);
                        setFragment(bookingFragment);
                        return true;

                    case R.id.nav_animals:
                        mMainNav.setItemBackgroundResource(R.color.colorBrownYellow);
                        setFragment(animalsFragment);
                        return true;

                    case R.id.nav_profile:
                        mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(profileFragment);
                        return true;

                        default:
                            return false;
                }

            }
        });
    }

    private void setFragment(android.support.v4.app.Fragment fragment) {

        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();

    }

    public void bottomNavigationView(BottomNavigationView bottomNavigationView){
        bottomNavigationView.setSelectedItemId(R.id.nav_booking);
    }

}
