package com.example.prueba_censo2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    Spinner Gender;
    Button BTN3;
    EditText Nam, Age;
    ArrayList<String> Value = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Gender = (Spinner) findViewById(R.id.spn_generos);
        BTN3 = (Button) findViewById(R.id.btn_agregar);
        Nam = (EditText) findViewById(R.id.etext_nombre);
        Age = (EditText) findViewById(R.id.etext_edad);

        Value.add("...");
        Value.add("HOMBRE");
        Value.add("MUJER");
        ArrayAdapter<String> Adap = new ArrayAdapter<String>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item,Value);
        Gender.setAdapter(Adap);

        BTN3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gender = Gender.getSelectedItem().toString();
                if (Nam.getText().toString().isEmpty() || Age.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Ingresar todos los datos", Toast.LENGTH_LONG).show();
                }
                if(gender.equals("HOMBRE"))
                {
                    Integer TotF = 0, ContM = 0, ContW = 0;
                    ContM++;
                    TotF++;
                    Intent I = new Intent(getApplicationContext(), MainActivity2.class);
                    I.putExtra("ContadorM", ContM);
                    I.putExtra("ContadorF", TotF);
                    startActivity(I);
                }
                if (gender.equals("MUJER"))
                {
                    Integer TotF = 0, ContM = 0, ContW = 0;
                    ContW++;
                    TotF++;
                    Intent I = new Intent(getApplicationContext(), MainActivity2.class);
                    I.putExtra("ContadorW", ContM);
                    I.putExtra("ContadorF", TotF);
                    startActivity(I);
                }
            }
        });
    }
}