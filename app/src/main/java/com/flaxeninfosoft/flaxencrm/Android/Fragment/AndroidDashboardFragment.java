package com.flaxeninfosoft.flaxencrm.Android.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.flaxeninfosoft.flaxencrm.Android.Activities.AndroidTask;
import com.flaxeninfosoft.flaxencrm.Android.Activities.MeetingAndroidActivity;
import com.flaxeninfosoft.flaxencrm.Android.Activities.TodayTaskAndroidActivity;
import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Activities.WebMailActivity;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentAndroidDashboardBinding;


public class AndroidDashboardFragment extends Fragment {

    FragmentAndroidDashboardBinding binding;

    public AndroidDashboardFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_android_dashboard, container, false);

        binding.applyLeave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(requireActivity(),R.id.apply_leave)
                        .navigate(R.id.action_homeFragment_to_applyleaveandroidFragment);
            }
        });
        binding.androidtask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AndroidTask.class);
                startActivity(intent);
            }
        });
        binding.upcomingProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(requireActivity(),R.id.upcomingProject)
                        .navigate(R.id.action_homeFragment_to_upcomingprojectandroidandroidFragment);
            }
        });
        binding.webmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WebMailActivity.class);
                startActivity(intent);
            }
        });
        binding.allproject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(requireActivity(),R.id.allprojects)
                        .navigate(R.id.action_homeFragment_to_allprojectandroidFragment);
            }
        });
        binding.todayTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TodayTaskAndroidActivity.class);
                startActivity(intent);
            }
        });
        binding.attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(requireActivity(),R.id.attendance)
                        .navigate(R.id.action_homeFragment_to_attendanceFragment);
            }
        });
        binding.pendingProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(requireActivity(),R.id.pending_project)
                        .navigate(R.id.action_homeFragment_to_pendingprojectandroidandroidFragment);
            }
        });
        binding.meeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(getActivity(), MeetingAndroidActivity.class);
            startActivity(intent);
            }
        });


        return binding.getRoot();
    }

}