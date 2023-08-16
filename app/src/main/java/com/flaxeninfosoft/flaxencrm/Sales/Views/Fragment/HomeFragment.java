package com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentHomeBinding;
import com.google.android.material.navigation.NavigationView;


public class HomeFragment extends Fragment implements NavigationView.OnNavigationItemSelectedListener {

    public HomeFragment() {
        // Required empty public constructor
    }

    FragmentHomeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false);

        return binding.getRoot();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.dashboard) {
            Navigation.findNavController(requireActivity(),R.id.dashboard)
                    .navigate(R.id.action_homeFragment_to_salesDashboardFragment);
        } else if (id == R.id.client) {
            Navigation.findNavController(requireActivity(),R.id.client)
                    .navigate(R.id.action_homeFragment_to_clientFragment);
        } else if (id == R.id.new_client) {
            Navigation.findNavController(requireActivity(),R.id.new_client)
                    .navigate(R.id.action_homeFragment_to_newClientFragment);

        } else if (id == R.id.project) {
            Navigation.findNavController(requireActivity(),R.id.client)
                    .navigate(R.id.action_homeFragment_to_projectFragment);
        } else if (id == R.id.call_leads) {
            Navigation.findNavController(requireActivity(), R.id.call_leads)
                    .navigate(R.id.action_homeFragment_to_allLeadsFragment);

        } else if (id == R.id.calender) {


        }else if (id == R.id.apply_for_leave){
            Navigation.findNavController(requireActivity(),R.id.apply_for_leave)
                    .navigate(R.id.action_homeFragment_to_leaveFragment);
        }

        return true;

    }

}