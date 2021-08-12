package com.techinical.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class SignUp extends AppCompatActivity {
    Button loginn,regbtn;
    EditText regname,regEmail,regPhone,regPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        FirebaseApp.initializeApp(SignUp.this);
        loginn=findViewById(R.id.loginn_btn);
        regname=findViewById(R.id.name);
        regEmail=findViewById(R.id.email);
        regPassword=findViewById(R.id.password);

        regPhone=findViewById(R.id.phone);

        loginn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUp.this,Login.class));
                finish();
            }
        });
    }

    public void addrecord(View view) {
        Dbmanager db=new Dbmanager(this);
        String name=regname.getText().toString();
        if(name.trim().length()<=0)
        {
            regname.setError("name cannot be blanks");
            Toast.makeText(this," Name cannot be blanks",Toast.LENGTH_LONG).show();
            return;
        }
        String Gmail=regEmail.getText().toString();
        if(Gmail.trim().length()<=0)
        {
            regEmail.setError("Email cannot be blanks");
            Toast.makeText(this," Email cannot be blanks",Toast.LENGTH_LONG).show();
            return;
        }
        String Mobile=regPhone.getText().toString();
        if(Mobile.trim().length()<=0)
        {
            regPhone.setError("Phone cannot be blanks");
            Toast.makeText(this," Phone cannot be blanks",Toast.LENGTH_LONG).show();
            return;
        }
        String Pass=regEmail.getText().toString();
        if(Pass.trim().length()<=0)
        {
            regPassword.setError("PassWord cannot be blanks");
            Toast.makeText(this," Password cannot be blanks",Toast.LENGTH_LONG).show();
            return;
        }
        Toast.makeText(this,"Inside add record",Toast.LENGTH_LONG).show();
       String result= db.addRecord(regname.getText().toString(),regEmail.getText().toString(),
                regPhone.getText().toString(),regPassword.getText().toString());
       Toast.makeText(this,result,Toast.LENGTH_LONG).show();
       if(result=="Succuessfully Stored")
       {
           startActivity(new Intent(SignUp.this,Register.class));
           finish();
       }

    }
}