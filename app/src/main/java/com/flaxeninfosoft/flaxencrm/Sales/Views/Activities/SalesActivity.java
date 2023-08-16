package com.flaxeninfosoft.flaxencrm.Sales.Views.Activities;

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
import android.widget.Toast;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.AllLeadsFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.LeaveFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.SalesClientFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.NewClientFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.ProposalFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.SalesApplyLeaveFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.SalesDashboardFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.SalesKiQueryKaFragment;
import com.flaxeninfosoft.flaxencrm.databinding.ActivitySalesBinding;

public class SalesActivity extends AppCompatActivity {

    ActivitySalesBinding binding;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sales);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.sales_container,new SalesDashboardFragment());
        fragmentTransaction.commit();

        binding.menuImageview.setOnClickListener(view -> {
            binding.drawerLayout.openDrawer(Gravity.LEFT);
        });

        binding.navigationView.setNavigationItemSelectedListener(this::onNavigationSelected);
        binding.userProfileImg.setOnClickListener(this::userKeUperDabaya);

    }

    private void userKeUperDabaya(View view) {
        startActivity(new Intent(SalesActivity.this, SalesKiProfileActivity.class));
    }

    private boolean onNavigationSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.dashboard) {
           setFragment(new SalesDashboardFragment());
        } else if (id == R.id.client) {
            setFragment(new SalesClientFragment());
        } else if (id == R.id.new_client) {
            setFragment(new NewClientFragment());
        } else if (id == R.id.project) {
            setFragment(new ProposalFragment());
        } else if (id == R.id.call_leads) {
            setFragment(new AllLeadsFragment());
        } else if (id == R.id.calender) {

        } else if (id == R.id.apply_for_leave) {
           setFragment(new SalesApplyLeaveFragment());
        }else if (id == R.id.all_Leave) {
            setFragment(new LeaveFragment());
        } else if (id == R.id.logout) {
            Toast.makeText(this, "Nhi Jane denge FLAXEN se...!", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.quries_sales) {
            setFragment(new SalesKiQueryKaFragment());
        } else {
            setFragment(new SalesDashboardFragment());
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