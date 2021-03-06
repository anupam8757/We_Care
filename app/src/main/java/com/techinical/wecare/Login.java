package com.techinical.wecare;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseAuthUIActivityResultContract;
import com.firebase.ui.auth.IdpResponse;
import com.firebase.ui.auth.data.model.FirebaseAuthUIAuthenticationResult;
import com.firebase.ui.auth.util.ExtraConstants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.techinical.wecare.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;




        import android.content.Intent;
        import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.result.ActivityResultCallback;
        import androidx.activity.result.ActivityResultLauncher;
        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;

        import com.firebase.ui.auth.AuthUI;
        import com.firebase.ui.auth.FirebaseAuthUIActivityResultContract;
        import com.firebase.ui.auth.IdpResponse;
        import com.firebase.ui.auth.data.model.FirebaseAuthUIAuthenticationResult;
        import com.firebase.ui.auth.util.ExtraConstants;
        import com.google.android.gms.tasks.OnCompleteListener;
        import com.google.android.gms.tasks.Task;
        import com.google.firebase.auth.ActionCodeSettings;
        import com.google.firebase.auth.FirebaseAuth;
        import com.google.firebase.auth.FirebaseUser;

        import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;

public class Login extends AppCompatActivity {



    Button callSignUp,login__btn;
    ImageView img;

    TextInputLayout email,paassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        FirebaseApp.initializeApp(Login.this);
        callSignUp = findViewById(R.id.signup_btn);
        email = findViewById(R.id.Email);
        paassword = findViewById(R.id.Password);
        login__btn = findViewById(R.id.signin_btn);
       callSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Login.this,SignUp.class);
                startActivity(intent);
                finish();
            }
        });
       login__btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(Login.this,Register.class));
               finish();
           }
       });
    }
}

