package com.flaxeninfosoft.flaxencrm.Sales.Views.Adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.AllLeaveFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.CasualFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.SickFragment;


public class LeaveViewPagerAdapter extends FragmentPagerAdapter {
    Bundle bundle;

    public LeaveViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        this.bundle = bundle;
    }

    public LeaveViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AllLeaveFragment();
        }
        else if (position == 1) {
            return new CasualFragment();
        }
        else {
            return new SickFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0){
            return " All Leaves ";
        }
        else if (position == 1){
            return "    Casual   ";
        }
        else {
            return "    Sick    ";
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
