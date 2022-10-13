package cueva.luis.proyectoprimeraevaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TercerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);

        Button buttonN = (Button) findViewById(R.id.bttNextActivity3);
        Button buttonB = (Button) findViewById(R.id.bttBeforeActivity3);

        buttonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TercerActivity.this, CuartoActivity.class);

                startActivity(intent);
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TercerActivity.this, SegundoActivity.class);

                startActivity(intent);
            }
        });
    }
}