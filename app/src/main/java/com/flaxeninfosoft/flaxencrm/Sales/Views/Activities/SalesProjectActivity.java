package com.flaxeninfosoft.flaxencrm.Sales.Views.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.ActivitySalesProjectBinding;

public class SalesProjectActivity extends AppCompatActivity {

    ActivitySalesProjectBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sales_project);
    }
}