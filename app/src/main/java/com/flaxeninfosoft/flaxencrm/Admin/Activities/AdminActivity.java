package com.flaxeninfosoft.flaxencrm.Admin.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import com.flaxeninfosoft.flaxencrm.Admin.Fragment.AdminDashboardFragment;
import com.flaxeninfosoft.flaxencrm.Admin.Fragment.AdminHrDepartment;
import com.flaxeninfosoft.flaxencrm.Admin.Fragment.AdminProfileFragment;
import com.flaxeninfosoft.flaxencrm.Admin.Fragment.AndroidFragment;
import com.flaxeninfosoft.flaxencrm.Admin.Fragment.PHPFragment;
import com.flaxeninfosoft.flaxencrm.Admin.Fragment.WebmailFragment;
import com.flaxeninfosoft.flaxencrm.Admin.Fragment.admin_project_fragment;
import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.AllLeaveFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.NewClientFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.SalesDashboardFragment;
import com.flaxeninfosoft.flaxencrm.databinding.ActivityAdminBinding;

public class AdminActivity extends AppCompatActivity {

    ActivityAdminBinding binding;

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_admin);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.sales_container,new AdminDashboardFragment());
        fragmentTransaction.commit();

        binding.menuImageview.setOnClickListener(view -> {
            binding.drawerLayout.openDrawer(Gravity.LEFT);
        });
        binding.adminProfileImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminActivity.this,AdminProfileActivity.class));
            }
        });

        binding.navigationView.setNavigationItemSelectedListener(this::onNavigationSelected);
    }

    private boolean onNavigationSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.dashboard) {
            setFragment(new AdminDashboardFragment());
        } else if (id == R.id.adminHrDepartment) {
            setFragment(new AdminHrDepartment());
        } else if (id == R.id.leave) {
            setFragment(new AllLeaveFragment());
        } else if (id == R.id.project) {
            setFragment(new admin_project_fragment());
        } else if (id == R.id.webmail) {
            setFragment(new WebmailFragment());
        } else if (id == R.id.android) {
            setFragment(new AndroidFragment());
        } else if (id == R.id.php_department) {
            setFragment(new PHPFragment());
        }else if (id == R.id.hr_department) {
            setFragment(new AdminHrDepartment());
        } else if (id == R.id.info) {
            setFragment(new AdminProfileFragment());
        }

        binding.drawerLayout.close();
        return true;
    }
    public void setFragment(Fragment fragment){
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.sales_container,fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)){
            binding.drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }
}