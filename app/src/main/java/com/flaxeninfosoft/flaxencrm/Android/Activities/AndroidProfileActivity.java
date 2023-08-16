package com.flaxeninfosoft.flaxencrm.Android.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.flaxeninfosoft.flaxencrm.R;

public class AndroidProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_profile);
        toolbarSetup();
    }

    public void toolbarSetup(){
        View view =  findViewById(R.id.tlAppointmentDetails);
        TextView txtHeader = view.findViewById(R.id.txtHeader);
        ImageView ImgBack = view.findViewById(R.id.ImggClose);
        txtHeader.setText("All Team");
        ImgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

}