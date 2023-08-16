package com.flaxeninfosoft.flaxencrm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.flaxeninfosoft.flaxencrm.Admin.Activities.AdminActivity;
import com.flaxeninfosoft.flaxencrm.Android.Activities.AndroidActivity;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Activities.SalesActivity;
import com.flaxeninfosoft.flaxencrm.databinding.ActivitySigninBinding;

public class SignInActivity extends AppCompatActivity {
    ActivitySigninBinding binding;
    boolean show = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySigninBinding binding = ActivitySigninBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, SalesActivity.class);
                startActivity(intent);
            }
        });

        binding.logo.animate().scaleX(-10f).scaleY(-10f).start();
        binding.logo.animate().scaleX(1.5f).scaleY(1.5f).setDuration(1000L).start();


    }
}
