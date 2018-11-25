package es.usj.task101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText etName;
     TextView tvResult;
     Button btnSend;
     Button btnS2;
     Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        tvResult = findViewById(R.id.tvResult);

        btnSend = findViewById(R.id.btnSend); // No necesario debido a que no trabajaremos con el botón

        bundle = new Bundle();
        btnS2 = findViewById(R.id.btnS2);




    }


    public void send (View v){
        String name = etName.getText().toString();
        tvResult.setText("Hola" + name);
    }

}

