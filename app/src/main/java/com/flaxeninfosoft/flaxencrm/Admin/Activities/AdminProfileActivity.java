package com.flaxeninfosoft.flaxencrm.Admin.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.ActivityAdminBinding;

public class AdminProfileActivity extends AppCompatActivity {

    ActivityAdminBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_profile);
    }
}