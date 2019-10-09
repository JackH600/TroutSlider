package com.example.troutslider;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mLinearLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinearLayout = (LinearLayout) findViewById(R.id.layout);

        fillTroutGallery();
    }

    private void fillTroutGallery() {
        ImageButton buttonItem;

        for (int i = 0; i < TroutDB.description.length; i++) {
            buttonItem = new ImageButton(this);

            Trout trout = new Trout(TroutDB.description[i], TroutDB.id[i]);

            buttonItem.setContentDescription(trout.getDescription());

            buttonItem.setImageDrawable(getResources().getDrawable(trout.getImageID()));

            buttonItem.setOnClickListener(displayTroutInformation);



            mLinearLayout.addView(buttonItem);

        }
    }

    private  View.OnClickListener displayTroutInformation = new View.OnClickListener() {
            @Override
            public void onClick(View btn) {
                String troutDescription = (String)btn.getContentDescription();

                displayToast(troutDescription);

            }
        };


    private void displayToast(String troutDescription){
        Toast.makeText(this, troutDescription, Toast.LENGTH_SHORT).show();

    }



}
