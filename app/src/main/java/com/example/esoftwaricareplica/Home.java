package com.example.esoftwaricareplica;

import android.os.Bundle;

import com.example.esoftwaricareplica.models.Students;
import com.example.esoftwaricareplica.ui.students.StudentFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_students)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
        StudentFragment.studentsList.add(new Students("Kritik Ranjit", "21", "Male", "Chagal", R.drawable.male));
        StudentFragment.studentsList.add(new Students("Christina Shrestha", "20", "Female", "Ason", R.drawable.female));
        StudentFragment.studentsList.add(new Students("Other Other", "25", "Others", "Kathmandu", R.drawable.other));
    }

}
