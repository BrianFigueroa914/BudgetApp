package com.example.budgetapp;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class login extends AppCompatActivity {

    private boolean passwordShowing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);
        final ImageView showPassword = findViewById(R.id.showPasswordIcon);
        final TextView signInBtn = findViewById(R.id.signInBtn);

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

    }
}