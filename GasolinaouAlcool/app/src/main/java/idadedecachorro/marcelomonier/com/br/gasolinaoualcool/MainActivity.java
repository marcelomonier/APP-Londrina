package idadedecachorro.marcelomonier.com.br.gasolinaoualcool;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    private EditText valoralcool;
    private EditText valorgas;
    private Button calcula;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valoralcool = (EditText) findViewById(R.id.valoralcool);
        valorgas = (EditText) findViewById(R.id.valorgas);

        calcula = (Button) findViewById(R.id.btn_verificar);

        resultado = (TextView) findViewById(R.id.resultado);

        calcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recuperar valor nos campos de texto
                String textovaloralcool = valoralcool.getText().toString();
                String textovalorgas = valorgas.getText().toString();

                //Converter valor Strings para inteiros
                double precoalcool = Double.parseDouble(textovaloralcool);
                double precogas = Double.parseDouble(textovalorgas);


                Context context = getApplicationContext();

                //Valor da mensagem
                CharSequence text1 = "É melhor utilizar gasolina.";
                CharSequence text2 = "É melhor utilizar álcool.";

                int duration = Toast.LENGTH_SHORT;

                //Mensagem de alerta
                Toast toast1 = Toast.makeText(context, text1, duration);
                Toast toast2 = Toast.makeText(context, text2, duration);

                //alcool / gasolina

                double resultado2 = precoalcool / precogas;

                if(resultado2 >=0.7){

                    //Gasolina
                    toast1.show();

                } else {

                    //Álcool
                    toast2.show();

                }




            }
        });




    }
}
