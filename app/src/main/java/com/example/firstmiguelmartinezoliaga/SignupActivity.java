package com.example.firstmiguelmartinezoliaga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_signup);
        Button signup = (Button) findViewById(R.id.button);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //toast de aviso
                Toast toast0 = Toast.makeText(SignupActivity.this, "¡Cuenta creada correctamente!", Toast.LENGTH_LONG);
                toast0.show();
                //mientras mostramos el toast, vamos al mainactivity
                Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
    }
}
