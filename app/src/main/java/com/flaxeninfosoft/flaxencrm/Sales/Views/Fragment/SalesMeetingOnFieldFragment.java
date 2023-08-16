package com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.CustomAddMeetingDialogBinding;
import com.flaxeninfosoft.flaxencrm.databinding.CustomAddMeetingDialogBindingImpl;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentSalesMeetingOnFieldBinding;

public class SalesMeetingOnFieldFragment extends Fragment {


    FragmentSalesMeetingOnFieldBinding binding;
    public SalesMeetingOnFieldFragment() {
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
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_sales_meeting_on_field, container, false);

        binding.addMeeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDilog();

            }
        });
        return binding.getRoot();
    }

    public void showDilog(){
        LayoutInflater factory = LayoutInflater.from(getContext());

        final View view = factory.inflate(R.layout.custom_add_meeting_dialog, null);
        AlertDialog attendaceDialog = new AlertDialog.Builder(getContext()).create();
        attendaceDialog.setView(view);
        attendaceDialog.setCancelable(true);
        attendaceDialog.show();
//        Button submitButton = view.findViewById(R.id.submit);
      //  Button buttonPunch = view.findViewById(R.id.button1);
//        submitButton.setOnClickListener(view12 -> {
//            attendaceDialog.dismiss();
//            Navigation.findNavController(binding.getRoot()).navigate(R.id.action_employeeHomeFragment_to_employeeAddAttendanceFragment);
//        });

    }
}