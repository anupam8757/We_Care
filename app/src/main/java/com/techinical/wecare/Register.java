package com.techinical.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    CheckBox Fever,Cough,Upset_stomach,chest_pain,Dehydration,Shortnessofbreath,Pressureinchest
            ,Nausa,Omiting,Squezing,Anxity,Deprisson,NightMare,SuicidalThough,Delision,MusclePain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Fever=findViewById(R.id.checkbox_fever);
        Cough=findViewById(R.id.checkbox_cough);
        Upset_stomach=findViewById(R.id.Upset_Stomach);
        chest_pain=findViewById(R.id.checkbox_Chest);
        Dehydration=findViewById(R.id.checkbox_dehydaration);
        Shortnessofbreath=findViewById(R.id.shortnessofbreath);
        Pressureinchest=findViewById(R.id.pressureinchest);
        Nausa=findViewById(R.id.nauesa);
        Omiting=findViewById(R.id.checkbox_vomiting);
        Squezing=findViewById(R.id.checkbox_sqeching);
        Anxity=findViewById(R.id.checkbox_anxity);
        Deprisson=findViewById(R.id.checkbox_depression);
        NightMare=findViewById(R.id.checkbox_nightmare);
        SuicidalThough=findViewById(R.id.Suicidal_Thought);
        Delision=findViewById(R.id.delusion);
        MusclePain=findViewById(R.id.muscle_pain);


    }
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        String msg="";

        // Concatenation of the checked options in if

        // isChecked() is used to check whether
        // the CheckBox is in true state or not.


        if(Fever.isChecked() && Cough.isChecked())
        {
            startActivity(new Intent(Register.this,Fever.class));
            finish();
        }
       else if(Fever.isChecked() && Dehydration.isChecked() && Upset_stomach.isChecked() && Omiting.isChecked())
        {
            startActivity(new Intent(Register.this,Daireaa.class));
            finish();
        }
        else if(Shortnessofbreath.isChecked() && chest_pain.isChecked() && Squezing.isChecked()
               && Pressureinchest.isChecked() && Nausa.isChecked())
        {
            startActivity(new Intent(Register.this,HeartAttack.class));
            finish();
        }
        else if(Anxity.isChecked() && Deprisson.isChecked() && NightMare.isChecked() && Delision.isChecked())
        {
            Toast.makeText(this, msg + "You Have Emotional Problem",
                    Toast.LENGTH_LONG).show();
            Toast.makeText(this, msg + "Kindly don't Overthink",
                    Toast.LENGTH_LONG).show();
        }
        else if(MusclePain.isChecked())
        {
            Toast.makeText(this, msg + "You Have Muscles  Problem",
                    Toast.LENGTH_LONG).show();
        }
        // Toast is created to display the
        // message using show() method.
        else {
            Toast.makeText(this, msg + "are selected",
                    Toast.LENGTH_LONG).show();
        }
    }
    public void contactUs(View view)
    {
        startActivity(new Intent(Register.this,ContactUs.class));
    }
    public void aboutUs(View view)
    {
        startActivity(new Intent(Register.this,AboutUs.class));
    }
}