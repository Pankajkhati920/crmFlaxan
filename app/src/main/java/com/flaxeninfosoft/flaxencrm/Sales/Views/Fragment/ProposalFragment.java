package com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentProjectDetailsBinding;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;


public class ProposalFragment extends Fragment {

    FragmentProjectDetailsBinding binding;

    private  int reqcode=9,rescode=88;
    String encodedpdf;
    boolean isselected;
    ImageView img;
    int id;



    public ProposalFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_project_details, container, false);

        binding.uploadpr.setOnClickListener(this::OnClickUpload);
        binding.selectpr.setOnClickListener(this::OnClickSelecter);
        binding.imageButton4.setOnClickListener(this::OnClickBack);


        return binding.getRoot();
    }

    private void OnClickBack(View view) {
        Navigation.findNavController(view).navigateUp();
    }

    private void OnClickSelecter(View view) {
    }

    private void OnClickUpload(View view) {
    }


}