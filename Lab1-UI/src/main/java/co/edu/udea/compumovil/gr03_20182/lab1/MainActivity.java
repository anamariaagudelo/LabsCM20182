package co.edu.udea.compumovil.gr03_20182.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button comida;
    Button bebida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comida = (Button)findViewById(R.id.botonComida);
        comida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent comida = new Intent(MainActivity.this, comidaActivity.class);
                startActivity(comida);
            }
        });
        bebida = (Button)findViewById(R.id.botonBebida);
        bebida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bebida = new Intent(MainActivity.this, bebidaActivity.class);
                startActivity(bebida);
            }
        });
    }
}
