package com.example.myapplication;


import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.voiti);
        EditText email = findViewById(R.id.name);
        EditText password = findViewById(R.id.password);
        password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        if (email.getText().toString().length() > 0) {

        }


        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}


            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().trim().length() > 0) {
                    button.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.yellow)));
                } else {
                    button.setBackgroundTintList(ColorStateList.valueOf(getColor(R.color.silver)));
                }
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = "admin";
                String password = "admin";
                if (email.getText().toString().equals(login) && password.equals(password)) {
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_LONG).show();
                    findViewById(R.id.name).setVisibility(View.GONE);
                    findViewById(R.id.password).setVisibility(View.GONE);
                    findViewById(R.id.zabyl).setVisibility(View.GONE);
                    findViewById(R.id.najmi).setVisibility(View.GONE);
                    findViewById(R.id.ili).setVisibility(View.GONE);
                    findViewById(R.id.voiti).setVisibility(View.GONE);
                    findViewById(R.id.vypolnit).setVisibility(View.GONE);
                    findViewById(R.id.vhod).setVisibility(View.GONE);
                } else {
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_LONG).show();
                }
            }
        });









    }
}

