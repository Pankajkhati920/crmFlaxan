package com.flaxeninfosoft.flaxencrm.Sales.Views.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.ActivitySalesTaskBinding;

public class SalesTaskActivity extends AppCompatActivity {

    ActivitySalesTaskBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_sales_task);

        binding.backIcon.setOnClickListener(this::onClickBack);
    }

    private void onClickBack(View view) {

            onBackPressed();
        }
    }
