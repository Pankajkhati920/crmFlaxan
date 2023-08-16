package com.flaxeninfosoft.flaxencrm.Sales.Views.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.ActivitySalesKiProfileBinding;

public class SalesKiProfileActivity extends AppCompatActivity {

    ActivitySalesKiProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sales_ki_profile);

        binding.backIcon.setOnClickListener(this::baharJaneKeLiyeArrowDabaye);
    }

    private void baharJaneKeLiyeArrowDabaye(View view) {
        onBackPressed();
    }
}