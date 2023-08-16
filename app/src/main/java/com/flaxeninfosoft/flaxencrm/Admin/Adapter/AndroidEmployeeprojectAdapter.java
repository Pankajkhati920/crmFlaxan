package com.flaxeninfosoft.flaxencrm.Admin.Adapter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.flaxeninfosoft.flaxencrm.Admin.Fragment.AndroidEmpolyeeFragment;
import com.flaxeninfosoft.flaxencrm.Admin.Fragment.AndroidProjectFragment;


public class AndroidEmployeeprojectAdapter extends FragmentPagerAdapter {

    Bundle bundle;

    public AndroidEmployeeprojectAdapter(@NonNull FragmentManager fm) {
        super(fm);
        this.bundle = bundle;
    }

    public AndroidEmployeeprojectAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AndroidEmpolyeeFragment();
        }
        else {
            return new AndroidProjectFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0){
            return " Android Employee";
        }
        else {
            return "Android Project";
        }

    }

    @Override
    public int getCount() {
        return 2;
    }
}
