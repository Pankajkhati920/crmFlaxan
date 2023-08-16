package com.flaxeninfosoft.flaxencrm.Sales.Views.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Adapter.MeetingVeiwPager;
import com.flaxeninfosoft.flaxencrm.databinding.ActivitySalesMeetingBinding;
import com.flaxeninfosoft.flaxencrm.databinding.ActivitySalesTaskBinding;

public class SalesMeetingActivity extends AppCompatActivity {


    ActivitySalesMeetingBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_sales_meeting);

        binding.backIcon.setOnClickListener(this::OnClickBack);

        FragmentManager fragmentManager = getSupportFragmentManager();
        MeetingVeiwPager veiwPager = new MeetingVeiwPager(fragmentManager);
        binding.viewPager.setAdapter(veiwPager);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
    }

    private void OnClickBack(View view) {
        onBackPressed();
    }
}