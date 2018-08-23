package co.edu.udea.compumovil.gr03_20182.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button food;
    Button drink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food = (Button)findViewById(R.id.butttonFood);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent food = new Intent(MainActivity.this, FoodsActivity.class);
                startActivity(food);
            }
        });
        drink = (Button)findViewById(R.id.buttonDrink);
        drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent drink = new Intent(MainActivity.this, DrinksActivity.class);
                startActivity(drink);
            }
        });
    }
}
