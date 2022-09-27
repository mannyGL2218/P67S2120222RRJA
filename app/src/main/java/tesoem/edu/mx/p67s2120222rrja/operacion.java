package tesoem.edu.mx.p67s2120222rrja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class operacion extends AppCompatActivity {

    EditText num1,num2;
    TextView resultado;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacion);
        num1 = findViewById(R.id.txt_num1);
        num2 = findViewById(R.id.txt_num2);
        resultado = findViewById(R.id.txt_resultado);
        calcular = findViewById(R.id.btn_calcular);
    }
    public void calular(View view){
        int uno = Integer.parseInt(num1.getText().toString());
        int dos = Integer.parseInt(num2.getText().toString());
        resultado.setText(String.valueOf(uno+dos).toString());
    }
}