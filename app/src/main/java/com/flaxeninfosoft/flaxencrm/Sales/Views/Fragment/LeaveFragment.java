package com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Adapter.LeaveViewPagerAdapter;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentLeaveBinding;


public class LeaveFragment extends Fragment {

    FragmentLeaveBinding binding;
    public LeaveFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_leave,container,false);




        FragmentManager fragmentManager = getChildFragmentManager();
        LeaveViewPagerAdapter viewPagerAdapter = new LeaveViewPagerAdapter(fragmentManager);
        binding.viewPager.setAdapter(viewPagerAdapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);

        return binding.getRoot();
    }


    private void OnClickBack(View view) {
        Navigation.findNavController(view).navigateUp();
    }
}