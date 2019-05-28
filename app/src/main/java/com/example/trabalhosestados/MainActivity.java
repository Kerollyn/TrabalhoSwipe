package com.example.trabalhosestados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvRegioes,tvEstados;
    private String tipo;
    private String[] regioes, estados;
    private LinearLayout layout;
    private int contador, contRegiao = 0 , contEstado = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tipo = getIntent().getExtras().getString("tipo");
        contador = 0;


        layout = (LinearLayout) findViewById(R.id.layout);

        String[] regioesString = getResources().getStringArray(R.array.Regioes);
        String[] estadosString = getResources().getStringArray(R.array.Estados);
        String[] centro-oeste = getResources().getStringArray(R.array.Centro-Oeste);
        String[] nordeste = getResources().getStringArray(R.array.Nordeste);
        String[] norte = getResources().getStringArray(R.array.Norte);
        String[] sudeste = getResources().getStringArray(R.array.Sudeste);
        String[] sul = getResources().getStringArray(R.array.Sul);

        tvRegioes.setText( regioes[contRegiao] );
        tvEstados.setText( estados[contEstado]);//Receber array do estado 0

        layout.setOnTouchListener( new OnSwipeTouchListener(this){

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                tvEstados.setText(estados[contador]);
                contEstado++;
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                tvEstados.setText(estados[contador]);
                contEstado++;
            }

            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
                tvRegioes.setText(regioes[contador]);
                contRegiao++;
            }

            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
                tvRegioes.setText(regioes[contador]);
                contRegiao--;
            }
        });


    }


}
