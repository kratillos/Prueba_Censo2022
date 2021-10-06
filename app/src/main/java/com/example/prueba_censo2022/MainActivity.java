package com.example.prueba_censo2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText User;
    EditText Pass;
    Button BTN1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User = (EditText) findViewById(R.id.etext_usuario);
        Pass = (EditText) findViewById(R.id.etext_clave);
        BTN1 = (Button) findViewById(R.id.btn_continuar);

        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (User.getText().toString().isEmpty() || Pass.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Se requiere llenar los campos", Toast.LENGTH_LONG).show();
                }
                String Uname = User.getText().toString();
                String Pwd = Pass.getText().toString();
                if(Uname.equals("adm123") & Pwd.equals("adm123"))
                {
                    Intent I= new Intent(getApplicationContext(), MainActivity2.class);
                    I.putExtra("MUser", Uname);
                    I.putExtra("MPass", Pwd);
                    startActivity(I);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Alguno de los datos ingresados es incorrecto", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}