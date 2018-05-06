package com.example.pcoscar.intent_parametros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText xet1,xet2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        xet1= findViewById(R.id.et1);
        xet2=findViewById(R.id.et2);
    }

    public void Enviar(View view){
        Intent intento =new Intent(this,Main2Activity.class);
        intento.putExtra("Dato1",xet1.getText().toString());
        intento.putExtra("Dato2",xet2.getText().toString());
        startActivity(intento);



    }
}
