package com.flaxeninfosoft.flaxencrm.Admin.Fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flaxeninfosoft.flaxencrm.Admin.Adapter.AndroidEmployeeprojectAdapter;
import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Adapter.LeaveViewPagerAdapter;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentAndroidBinding;

public class AndroidFragment extends Fragment {

    FragmentAndroidBinding binding;
    public AndroidFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_android,container,false);


        FragmentManager fragmentManager = getChildFragmentManager();
        AndroidEmployeeprojectAdapter viewPagerAdapter = new AndroidEmployeeprojectAdapter(fragmentManager);
        binding.viewPager.setAdapter(viewPagerAdapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);

        return binding.getRoot();
    }


    private void OnClickBack(View view) {
        Navigation.findNavController(view).navigateUp();
    }
}