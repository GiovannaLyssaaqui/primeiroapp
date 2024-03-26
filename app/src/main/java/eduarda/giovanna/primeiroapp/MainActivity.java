package eduarda.giovanna.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity { // classe representa a tela principal, cuida do seu comportamento

    @Override
    protected void onCreate(Bundle savedInstanceState) { // chamado automaticamente pelo android
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //constroi a interface da tela

        Button btnEnviar = findViewById(R.id.btn_enviar); // obtem o botão enviar
        btnEnviar.setOnClickListener(new View.OnClickListener() { // configurando o botão, atribuindo um ouvidor clicks
            @Override
            public void onClick(View v) { // variavel que guarda um objeto tipo view (v - botão)

                EditText etDigiteAqui = findViewById(R.id.et_digite_aqui); // concede a caixa de texto
                String textoDigitado = etDigiteAqui.getText().toString(); // obtem o texto da caixa de texto

                Intent i = new Intent(MainActivity.this, NextActivity.class); // passam para outra página

                i.putExtra( "texto", textoDigitado);

                startActivity(i); // executa a intenção entregue a ele. no caso mudar da pg principal p/ proxima


            }
        });
    }
}