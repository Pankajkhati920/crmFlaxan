package com.flaxeninfosoft.flaxencrm;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.flaxeninfosoft.flaxencrm.Sales.Views.Activities.SalesActivity;
import com.flaxeninfosoft.flaxencrm.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
        binding.logo.animate().scaleX(-10f).scaleY(-10f).start();
        binding.logo.animate().scaleX(1.5f).scaleY(1.5f).setDuration(1000L).start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, SignInActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                SplashActivity.this.finish();
            }
        },3000);
    }
}