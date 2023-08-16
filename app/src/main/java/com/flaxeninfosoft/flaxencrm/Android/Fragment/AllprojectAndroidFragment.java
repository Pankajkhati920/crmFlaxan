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
import com.flaxeninfosoft.flaxencrm.databinding.FragmentLeaveAndroidBinding;

public class AllprojectAndroidFragment extends Fragment {

    FragmentAllprojectBinding binding;

    public AllprojectAndroidFragment() {
        // Required empty public constructor
    }

      @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_allproject,container,false);

        binding.card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(requireActivity(),R.id.card1)
                        .navigate(R.id.action_allprojectandroidFragment_to_projectDetailFragment);
            }
        });

        binding.card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(requireActivity(),R.id.card2)
                        .navigate(R.id.action_allprojectandroidFragment_to_projectDetailFragment);
            }
        });

        toolbarSetup();
        return binding.getRoot();
    }
    public void toolbarSetup(){
        View view =  binding.tlAppointmentDetails;
        TextView txtHeader = view.findViewById(R.id.txtHeader);
        ImageView ImgBack = view.findViewById(R.id.ImggClose);
        txtHeader.setText("All Project");
        ImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigateUp();
            }
        });
    }
}