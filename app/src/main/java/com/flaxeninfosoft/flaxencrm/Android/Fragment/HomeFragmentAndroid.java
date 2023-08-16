package com.flaxeninfosoft.flaxencrm.Android.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.flaxeninfosoft.flaxencrm.Android.Activities.AndroidProfileActivity;
import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentHome2Binding;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;


public class HomeFragmentAndroid extends Fragment implements NavigationView.OnNavigationItemSelectedListener {

    FragmentHome2Binding binding;

    public HomeFragmentAndroid() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home2, container, false);

        binding.menuImageview.setOnClickListener(this::onClick);
        binding.profile.setOnClickListener(this::onClickProfile);

        binding.navigationView.setNavigationItemSelectedListener(this);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Fragment childFragment = new AndroidDashboardFragment();
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.child_fragment_container, childFragment).commit();
    }

    private void onClick(View view) {
        binding.adminDrawer.openDrawer(Gravity.LEFT);
    }
    private void onClickProfile(View view){
        Intent intent = new Intent(getContext(), AndroidProfileActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.dashboard) {
            Navigation.findNavController(requireActivity(),R.id.dashboard)
                    .navigate(R.id.homeFragmentAndroid);
        } else if (id == R.id.androidteam) {
            Navigation.findNavController(requireActivity(),R.id.androidteam)
                    .navigate(R.id.action_homeFragment_to_allteamFragment);
        } else if (id == R.id.allprojects) {
            Navigation.findNavController(requireActivity(),R.id.allprojects)
                    .navigate(R.id.action_homeFragment_to_allprojectandroidFragment);
        } else if (id == R.id.attendance) {
            Navigation.findNavController(requireActivity(),R.id.attendance)
                    .navigate(R.id.action_homeFragment_to_attendanceFragment);
        } else if (id == R.id.leave) {
            Navigation.findNavController(requireActivity(),R.id.leave)
                    .navigate(R.id.action_homeFragment_to_leaveFragment);
        }

        DrawerLayout drawer =binding.adminDrawer;
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}