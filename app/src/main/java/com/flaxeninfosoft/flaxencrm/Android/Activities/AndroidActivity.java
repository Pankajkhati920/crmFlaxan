package com.flaxeninfosoft.flaxencrm.Android.Activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.ActivityAndroidBinding;
import com.google.android.material.navigation.NavigationView;

public class AndroidActivity extends AppCompatActivity {
    ActivityAndroidBinding binding;
    NavController navController;
    NavHostFragment hostFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_android);

        hostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.android_host_fragment);
        navController = hostFragment.getNavController();
    }

}