package com.flaxeninfosoft.flaxencrm.Sales.Views.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.ActivityAllClientBinding;

public class AllClientActivity extends AppCompatActivity {

    ActivityAllClientBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_all_client);

        binding.backIcon.setOnClickListener(this::onClickBack);
    }

    private void onClickBack(View view) {

        onBackPressed();
    }
}