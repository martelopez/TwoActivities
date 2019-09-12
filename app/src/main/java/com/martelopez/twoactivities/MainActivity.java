package com.martelopez.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private Intent intent;

    //Constante para definir la clave para el Intent extra
    public static final String EXTRA_MESSSAGE = "com.martelopez.android.twoactivities.extra.MESSAGE";

    // Varbiable privada para contener el EditText
    private EditText mMessageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencia del EditText
        mMessageEditText = findViewById(R.id.editTextMain);
    }

    public void launchSecondActivity(View view) {

        Log.d(LOG_TAG, "Boton Presionado");


        //Crea el Internt para llamar la otra activida al dar clic en el boton
        intent = new Intent(this, SecondActivity.class);

        //Obtener el texto del EditText como una cadena
        String message = mMessageEditText.getText().toString();

        //Cadena Intent como extra con la EXTRA_MESSAGE constante como clave y cadena valor
        intent.putExtra(EXTRA_MESSSAGE, message);

        startActivity(intent);



    }
}
