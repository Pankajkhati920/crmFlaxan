package com.flaxeninfosoft.flaxencrm.Sales.Views.Adapter;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.AllLeaveFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.CasualFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.SalesMeetingInCompanyFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.SalesMeetingOnFieldFragment;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment.SickFragment;

public class MeetingVeiwPager extends FragmentPagerAdapter {
    Bundle bundle;

    public MeetingVeiwPager(@NonNull FragmentManager fm) {
        super(fm);
        this.bundle = bundle;
    }

    public MeetingVeiwPager(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SalesMeetingInCompanyFragment();
        }
        else  {
            return new SalesMeetingOnFieldFragment();
        }

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0){
            return "In The House";
        }else {
            return "On Field";

        }


    }

    @Override
    public int getCount() {
        return 2;
    }
}
