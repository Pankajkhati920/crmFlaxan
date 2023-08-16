package com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Activities.SalesAttendanceActivity;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Activities.SalesClientActivity;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Activities.SalesLeadsActivity;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Activities.SalesMeetingActivity;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Activities.SalesProjectActivity;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Activities.SalesProposalActivity;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Activities.SalesReportActivity;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Activities.SalesTaskActivity;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Activities.SalesUpcomingProjectsActivity;
import com.flaxeninfosoft.flaxencrm.Sales.Views.Activities.WebMailActivity;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentSalesDashboardBinding;

public class SalesDashboardFragment extends Fragment {

    FragmentSalesDashboardBinding binding;

    public SalesDashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sales_dashboard, container, false);


        binding.cardViewAttendance.setOnClickListener(this::onClickAttendance);
        binding.cardViewTask.setOnClickListener(this::onClickTask);
        binding.cardViewMeeting.setOnClickListener(this::OnClickMeeting);
        binding.cardViewWebMail.setOnClickListener(this::onClickWebMail);
        binding.cardViewProjects.setOnClickListener(this::onClickProject);
        binding.cardViewReports.setOnClickListener(this::onClickReports);
        binding.cardViewUpcomingProjects.setOnClickListener(this::onClickUpcomingProjects);
        binding.cardViewClient.setOnClickListener(this::onClickClients);
        binding.cardViewLeads.setOnClickListener(this::onClickLeads);
        binding.cardViewProposal.setOnClickListener(this::onClickProposal);

        return binding.getRoot();
    }

    private void onClickProposal(View view) {
        Intent intent = new Intent(getContext(), SalesProposalActivity.class);
        startActivity(intent);
    }

    private void onClickLeads(View view) {
        Intent intent = new Intent(getContext(), SalesLeadsActivity.class);
        startActivity(intent);
    }

    private void onClickClients(View view) {
        Intent intent = new Intent(getContext(), SalesClientActivity.class);
        startActivity(intent);
    }

    private void onClickUpcomingProjects(View view) {
        Intent intent = new Intent(getContext(), SalesUpcomingProjectsActivity.class);
        startActivity(intent);
    }

    private void onClickReports(View view) {
        Intent intent = new Intent(getContext(), SalesReportActivity.class);
        startActivity(intent);
    }

    private void onClickProject(View view) {
        Intent intent = new Intent(getContext(), SalesProjectActivity.class);
        startActivity(intent);
    }

    private void OnClickMeeting(View view) {
        Intent intent = new Intent(getContext(), SalesMeetingActivity.class);
        startActivity(intent);
    }

    private void onClickWebMail(View view) {
        Intent intent = new Intent(getContext(), WebMailActivity.class);
        startActivity(intent);
    }

    private void onClickTask(View view) {
        Intent intent = new Intent(getContext(), SalesTaskActivity.class);
        startActivity(intent);
    }

    private void onClickAttendance(View view) {
        Intent intent = new Intent(getContext(), SalesAttendanceActivity.class);
        startActivity(intent);

    }
}