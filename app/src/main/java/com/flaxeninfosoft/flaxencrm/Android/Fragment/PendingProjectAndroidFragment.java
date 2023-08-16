package com.flaxeninfosoft.flaxencrm.Android.Fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentAllprojectBinding;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentPendingProjectsBinding;

public class PendingProjectAndroidFragment extends Fragment {

    FragmentPendingProjectsBinding binding;

    public PendingProjectAndroidFragment() {
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
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_pending_projects,container,false);
        toolbarSetup();
        return binding.getRoot();
    }
    public void toolbarSetup(){
        View view =  binding.tlAppointmentDetails;
        TextView txtHeader = view.findViewById(R.id.txtHeader);
        ImageView ImgBack = view.findViewById(R.id.ImggClose);
        txtHeader.setText("Pending Projects");
        ImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigateUp();
            }
        });
    }

}