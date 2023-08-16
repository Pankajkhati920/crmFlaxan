package com.flaxeninfosoft.flaxencrm.Sales.Views.Fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import com.flaxeninfosoft.flaxencrm.R;
import com.flaxeninfosoft.flaxencrm.databinding.FragmentSalesApplyLeaveBinding;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class SalesApplyLeaveFragment extends Fragment {

    FragmentSalesApplyLeaveBinding binding;

    int day, month, year;
    String formatted;

    public SalesApplyLeaveFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater, R.layout.fragment_sales_apply_leave,container,false);


        binding.fromTextview.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH);
            day = calendar.get(Calendar.DAY_OF_MONTH);

            Date date = calendar.getTime();
            SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
            formatted = formatter.format(date);
            binding.fromTextview.setText(formatted);
            DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), this::onDateSet, year, month, day);
            datePickerDialog.show();
        });
        binding.toTextview.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH);
            day = calendar.get(Calendar.DAY_OF_MONTH);

            Date date = calendar.getTime();
            SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
            formatted = formatter.format(date);
            binding.toTextview.setText(formatted);
            DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(), this::onDateSetTo, year, month, day);
            datePickerDialog.show();
        });
        return binding.getRoot();
    }

    private void onDateSetTo(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        Date date = c.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
        formatted = formatter.format(date);
        binding.toTextview.setText(formatted);

    }

    private void OnBackClick(View view) {
        Navigation.findNavController(view).navigateUp();
    }

    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        Date date = c.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
        formatted = formatter.format(date);
        binding.fromTextview.setText(formatted);

    }
}