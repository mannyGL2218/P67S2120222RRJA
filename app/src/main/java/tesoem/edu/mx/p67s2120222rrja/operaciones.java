package tesoem.edu.mx.p67s2120222rrja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class operaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones);
    }
    public void btnsuma(View view){
        Intent intent = new Intent(operaciones.this, operacion.class);
        startActivity(intent);
    }
}