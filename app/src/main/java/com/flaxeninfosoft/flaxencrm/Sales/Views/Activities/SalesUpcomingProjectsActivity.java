package com.flaxeninfosoft.flaxencrm.Sales.Views.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.flaxeninfosoft.flaxencrm.R;

public class SalesUpcomingProjectsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_projects);
        toolbarSetup();
    }
    public void toolbarSetup(){
        View view =  findViewById(R.id.tlAppointmentDetails);
        TextView txtHeader = view.findViewById(R.id.txtHeader);
        ImageView ImgBack = view.findViewById(R.id.ImggClose);
        txtHeader.setText("Upcoming Projects");
        ImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

}