package com.example.budgetapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class register extends AppCompatActivity {
    //global variables
    private boolean passwordShowing = false;
    private boolean confirmPasswordShowing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //variables
        final EditText email = findViewById(R.id.email);
        final EditText password = findViewById(R.id.password);
        final EditText confirmPassword = findViewById(R.id.confirmPassword);
        final ImageView showPassword = findViewById(R.id.showPasswordIcon);
        final ImageView secondShowPassword = findViewById(R.id.secondShowPasswordIcon);
        final EditText phone = findViewById(R.id.phoneNumber);
        final AppCompatButton signUpBtn = findViewById(R.id.signUpBtn);
        final TextView acctSignIn = findViewById(R.id.acctSignInBtn);

        //methods
        //show or hide password methods
        showPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View temp) {
                if (passwordShowing) {
                    passwordShowing = false;
                    password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    showPassword.setImageResource(R.drawable.baseline_remove_red_eye_24);
                } else {
                    passwordShowing = true;
                    password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    showPassword.setImageResource(R.drawable.baseline_block_24);
                }
            }
        });
        secondShowPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View temp) {
                if (confirmPasswordShowing) {
                    confirmPasswordShowing= false;
                    confirmPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    showPassword.setImageResource(R.drawable.baseline_remove_red_eye_24);
                } else {
                    confirmPasswordShowing = true;
                    confirmPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    showPassword.setImageResource(R.drawable.baseline_block_24);

                }
            }
        });


        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




//                startActivity(new Intent(register.this, dashboard.class));
            }
        });

        acctSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sends you back to the activity that launched this activity (login_page)
                finish();
            }
        });

    }
}