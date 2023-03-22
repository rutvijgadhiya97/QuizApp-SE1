package com.example.quizapp_se1;

import android.os.Bundle;
import android.view.View;

import com.example.quizapp_se1.ui.courseapproval.CourseApprovalFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.quizapp_se1.databinding.ActivityBottomNavigationBinding;

public class BottomNavigation extends AppCompatActivity {

private ActivityBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     binding = ActivityBottomNavigationBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_courseapproval, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_bottom_navigation);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
        User userinfo=(User) getIntent().getSerializableExtra("User");
        final androidx.fragment.app
                .FragmentManager mFragmentManager
                = getSupportFragmentManager();
        final androidx.fragment.app
                .FragmentTransaction mFragmentTransaction
                = mFragmentManager.beginTransaction();
        final CourseApprovalFragment mFragment
                = new CourseApprovalFragment();

                Bundle mBundle = new Bundle();
                mBundle.putString(
                        "SelectedCourse",
                        userinfo.SelectedCourse);
                mFragment.setArguments(mBundle);
                mFragmentTransaction
                        .add(R.id.frameLayout, mFragment)
                        .commit();


    }

}