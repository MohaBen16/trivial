package com.example.trivial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public static final Random RANDOM = new Random();

    Button b_dado,b_ficha1,b_ficha2,b1;
    ImageView iv_dado,q_azul,q_rojo,q_naranja,q_amarillo,q_verde,q_morado;
    TextView t_j1,t_j2;


    private static final int[] CASILLAS = {
            R.id.a1c,R.id.a2c,R.id.a3c,R.id.a4c,R.id.a5c,R.id.a6c,R.id.a7d,R.id.a7i,R.id.a8d,R.id.a8i,R.id.a9d,R.id.a9i,
            R.id.r1c,R.id.r2c,R.id.r3c,R.id.r4c,R.id.r5c,R.id.r6c,R.id.r7d,R.id.r7i,R.id.r8d,R.id.r8i,R.id.r9d,R.id.r9i,
            R.id.v1c,R.id.v2c,R.id.v3c,R.id.v4c,R.id.v5c,R.id.v6c,
            R.id.o1c,R.id.o2c,R.id.o3c,R.id.o4c,R.id.o5c,R.id.o6c,
            R.id.m1c,R.id.m2c,R.id.m3c,R.id.m4c,R.id.m5c,R.id.m6c,R.id.m7d,R.id.m7i,R.id.m8d,R.id.m8i,R.id.m9d,R.id.m9i,
            R.id.n1c,R.id.n2c,R.id.n3c,R.id.n4c,R.id.n5c,R.id.n6c
    };

    Map<String,String> cMapa= new HashMap<String,String>();

    int posFicha, turno = 0, tirar = 1 , n = 0;
    String cFicha;

    private float posX,posY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        cMapa.put("a","mr");
        cMapa.put("r","an");
        cMapa.put("n","ro");
        cMapa.put("o","nv");
        cMapa.put("v","om");
        cMapa.put("m","va");

        b_dado = (Button)findViewById(R.id.b_dado);
        b_ficha1 = (Button)findViewById(R.id.b_ficha1);
        b_ficha2 = (Button)findViewById(R.id.b_ficha2);
        iv_dado = (ImageView)findViewById(R.id.iv_dado);
        q_azul= findViewById(R.id.quisitoA);
        t_j1 = findViewById(R.id.tJugador);
        t_j2 = findViewById(R.id.tJugador2);

        b_dado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iv_dado.setVisibility(View.VISIBLE);

                int nDado = RANDOM.nextInt(6)+1;

                if(tirar == 1){
                    n = nDado;
                    t_j1.setTextColor(Color.GREEN);
                    t_j2.setTextColor(Color.RED);
                    tirar++;

                }else if(tirar == 2){
                    t_j1.setTextColor(Color.RED);
                    t_j2.setTextColor(Color.GREEN);
                    tirar++;

                    if (n > nDado) {
                        turno = 1;
                        Toast.makeText(getApplicationContext(), "Compienza el jugador " + turno, Toast.LENGTH_SHORT).show();
                    }else {
                        turno = 2;
                        Toast.makeText(getApplicationContext(), "Compienza el jugador " + turno, Toast.LENGTH_SHORT).show();
                    }

                }else{

                    for(int id : CASILLAS) {
                        final Button button = (Button) findViewById(id);

                        // numero de la posicion de la casilla
                        int posCasilla = button.getResources().getResourceEntryName(button.getId()).charAt(1) - '0';
                        // categoria de la posicion de la casilla
                        String cCasilla = String.valueOf(button.getResources().getResourceEntryName(button.getId()).charAt(0));
                        // direccion de la casilla
                        String dCasilla = String.valueOf(button.getResources().getResourceEntryName(button.getId()).charAt(2));

                        if(turno == 1){

                            // posicion en la que esta la ficha
                            posFicha = b_ficha1.getTag().toString().charAt(1) - '0';
                            // categoria en la que esta la ficha
                            cFicha = String.valueOf(b_ficha1.getTag().toString().charAt(0));

                            t_j1.setTextColor(Color.GREEN);
                            t_j2.setTextColor(Color.RED);
                            b_ficha1.setEnabled(true);
                            b_ficha2.setEnabled(false);

                        }else if(turno == 2){

                            // posicion en la que esta la ficha
                            posFicha = b_ficha2.getTag().toString().charAt(1) - '0';
                            // categoria en la que esta la ficha
                            cFicha = String.valueOf(b_ficha2.getTag().toString().charAt(0));

                            t_j1.setTextColor(Color.RED);
                            t_j2.setTextColor(Color.GREEN);
                            b_ficha1.setEnabled(false);
                            b_ficha2.setEnabled(true);

                        }

                        if(posFicha == 6 && cCasilla.equals("a")){
                            q_azul.setVisibility(View.VISIBLE);
                        }

                        //Control de moviminetos

                        if (posFicha + nDado <= 9 && posCasilla  > posFicha) {

                            if (posCasilla == nDado + posFicha && (cCasilla.equals(cFicha) || cFicha.equals("0"))) {
                                moverFicha(button);
                            }else {
                                button.setVisibility(View.INVISIBLE);
                            }
                        }else if(posFicha >= 4  &&  posFicha  < 6 && (posFicha == 4 && nDado == 6 || posFicha == 5 && nDado == 5 )){

                            if (posCasilla == (posFicha+nDado)-1 && ((cCasilla.equals(String.valueOf(cMapa.get(cFicha).charAt(0))) && (dCasilla.equals("d"))) || (cCasilla.equals(String.valueOf(cMapa.get(cFicha).charAt(1))) && (dCasilla.equals("i"))))){
                                moverFicha(button);
                            }else {
                                button.setVisibility(View.INVISIBLE);
                            }
                        }else if ( posFicha == 5 && nDado == 6){

                            if(posCasilla == (posFicha+nDado)-3 && ((cCasilla.equals(String.valueOf(cMapa.get(cFicha).charAt(0))) && (dCasilla.equals("d"))) || (cCasilla.equals(String.valueOf(cMapa.get(cFicha).charAt(1))) && (dCasilla.equals("i"))))){
                                moverFicha(button);
                            }else {
                                button.setVisibility(View.INVISIBLE);
                            }
                        }else if( posFicha == 6 && nDado > 3) {

                            if ((posCasilla == ((posFicha-nDado)+(posFicha+1))) && ((cCasilla.equals(String.valueOf(cMapa.get(cFicha).charAt(0))) && (dCasilla.equals("d"))) || (cCasilla.equals(String.valueOf(cMapa.get(cFicha).charAt(1)))  && (dCasilla.equals("i"))))) {
                                moverFicha(button);
                            }else {
                                button.setVisibility(View.INVISIBLE);
                            }
                        }else if( posFicha > 6 ) {

                            if ((posCasilla == (posFicha-nDado) && cFicha.equals(cCasilla))|| posCasilla == ((posFicha-nDado)+((10-posFicha)+(10-(posFicha+1)))) && (cCasilla.equals(String.valueOf(cMapa.get(cFicha).charAt(1))) && (dCasilla.equals("i")) || (cCasilla.equals(String.valueOf(cMapa.get(cFicha).charAt(1))) && posCasilla == 6 ))) {
                                moverFicha(button);
                            }else {
                                button.setVisibility(View.INVISIBLE);
                            }
                        }
                    }
                }

                int res = getResources().getIdentifier("dado_"+nDado , "drawable", "com.example.trivial");
                iv_dado.setImageResource(res);
            }
        });
    }

    public void ocultarCasillas(){
        for(int id : CASILLAS) {
            final Button button = (Button) findViewById(id);
            button.setVisibility(View.INVISIBLE);
        }
    }
    public void moverFicha(final Button b){

        b.setVisibility(View.VISIBLE);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(turno == 1){

                    b_ficha1.setTag(String.valueOf(b.getResources().getResourceEntryName(b.getId())));
                    b_ficha1.setX(b.getX());
                    b_ficha1.setY(b.getY());

                }else if(turno == 2){

                    b_ficha2.setTag(String.valueOf(b.getResources().getResourceEntryName(b.getId())));
                    b_ficha2.setX(b.getX());
                    b_ficha2.setY(b.getY());
                }
                ocultarCasillas();
                obtenetPreguntas();
            }
        });
    }

    private void obtenetPreguntas() {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }
}