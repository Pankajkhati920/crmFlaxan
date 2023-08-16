package com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentNewClientBinding;

public class NewClientFragment extends Fragment {


    FragmentNewClientBinding binding;
    public NewClientFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_new_client, container, false);


        return binding.getRoot();

    }

    private void onClickBack(View view) {
        Navigation.findNavController(view).navigateUp();
    }

}