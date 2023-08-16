package com.flaxeninfosoft.flaxencrm.Admin.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flaxeninfosoft.flaxencrm.Admin.Activities.AdUpComProjectActivity;
import com.flaxeninfosoft.flaxencrm.Admin.Activities.AdminAllClientActivity;
import com.flaxeninfosoft.flaxencrm.Admin.Activities.AdminAllReportActivity;
import com.flaxeninfosoft.flaxencrm.Admin.Activities.AdminLeaveActivity;
import com.flaxeninfosoft.flaxencrm.Admin.Activities.AdminMeetingActivity;
import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Activities.WebMailActivity;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentAdminDashboardBinding;


public class AdminDashboardFragment extends Fragment {

    FragmentAdminDashboardBinding binding;

    public AdminDashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_admin_dashboard,container,false);

        binding.adminWebmail.setOnClickListener(this::onClickAdminWebmail);
      //  binding.taskAdmin.setOnClickListener(this::onClickTask);
        binding.adminProjects.setOnClickListener(this::onClickAdminProject);
        binding.attedanceAdmin.setOnClickListener(this::onClickAdminAttendence);
        binding.clientMeetingAdmin.setOnClickListener(this::onClickAdminMeeting);
        binding.upcomingProjectAdmin.setOnClickListener(this::onClickAdminUpProject);
        binding.allClient.setOnClickListener(this::onClickclient);
        binding.allReports.setOnClickListener(this::onClickReport);

        return binding.getRoot();
    }

    private void onClickReport(View view) {
        Intent intent= new Intent(getContext(), AdminAllReportActivity.class);
        startActivity(intent);
    }

    private void onClickclient(View view) {
        Intent intent= new Intent(getContext(), AdminAllClientActivity.class);
        startActivity(intent);
    }

    private void onClickAdminUpProject(View view) {
        Intent intent= new Intent(getContext(), AdUpComProjectActivity.class);
        startActivity(intent);
    }

    private void onClickAdminMeeting(View view) {
        Intent intent= new Intent(getContext(), AdminMeetingActivity.class);
        startActivity(intent);
    }

    private void onClickAdminAttendence(View view) {
        Intent intent= new Intent(getContext(), AdminLeaveActivity.class);
        startActivity(intent);

    }

    private void onClickAdminProject(View view) {
        Intent intent= new Intent(getContext(),admin_project_fragment.class);
        startActivity(intent);
    }

/*
    private void onClickTask(View view) {
    }
*/

    private void onClickAdminWebmail(View view) {

        Intent intent = new Intent(getContext(), WebMailActivity.class);
        startActivity(intent);
    }
}