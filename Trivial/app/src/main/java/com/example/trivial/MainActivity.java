package com.example.trivial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    public static final Random RANDOM = new Random();

    Button b_dado,b_ficha,b1;
    ImageView iv_dado,q_azul;


    private static final int[] CASILLAS = {
            R.id.a1,R.id.a2,R.id.a3,R.id.a4,R.id.a5,R.id.a6,R.id.a7d,R.id.a7i,R.id.a8d,R.id.a8i,R.id.a9d,R.id.a9i,
            R.id.r1,R.id.r2,R.id.r3,R.id.r4,R.id.r5,R.id.r6,R.id.r7d,R.id.r7i,R.id.r8d,R.id.r8i,R.id.r9d,R.id.r9i,
            R.id.v1,R.id.v2,R.id.v3,R.id.v4,R.id.v5,R.id.v6,
            R.id.o1,R.id.o2,R.id.o3,R.id.o4,R.id.o5,R.id.o6,
            R.id.m1,R.id.m2,R.id.m3,R.id.m4,R.id.m5,R.id.m6,R.id.m7d,R.id.m7i,R.id.m8d,R.id.m8i,R.id.m9d,R.id.m9i,
            R.id.n1,R.id.n2,R.id.n3,R.id.n4,R.id.n5,R.id.n6
    };

    Map<String,String> cMapa= new HashMap<String,String>();

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
        b_ficha = (Button)findViewById(R.id.b_ficha);
        iv_dado = (ImageView)findViewById(R.id.iv_dado);
        q_azul= findViewById(R.id.quisitoA);

        b_dado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iv_dado.setVisibility(View.VISIBLE);

                int nDado = RANDOM.nextInt(6)+1;

                for(int id : CASILLAS) {
                    final Button button = (Button) findViewById(id);

                    // numero de la posicion de la casilla
                    int posCasilla = button.getResources().getResourceEntryName(button.getId()).charAt(1) - '0';
                    // categoria de la posicion de la casilla
                    String cCasilla = String.valueOf(button.getResources().getResourceEntryName(button.getId()).charAt(0));
                    // posicion en la que esta la ficha
                    int posFicha = b_ficha.getTag().toString().charAt(1) - '0';
                    // categoria en la que esta la ficha
                    String cFicha = String.valueOf(b_ficha.getTag().toString().charAt(0));

                    if(posFicha == 6 && cCasilla.equals("a")){
                        q_azul.setVisibility(View.VISIBLE);
                    }

                    if (posFicha + nDado <=6) {

                        if (posCasilla  > posFicha) {

                            if (posCasilla == nDado + posFicha && (cCasilla.equals(cFicha) || cFicha.equals("0"))) {

                                moverFicha(button);

                            } else {
                                button.setVisibility(View.INVISIBLE);
                            }

                        }

                    }else if( posFicha == 6 && nDado > 3) {

                       // Toast.makeText(getApplicationContext(),"cCASILLA:"+cCasilla+ " cMAP: " +cMapa.get(cFicha).charAt(1) ,Toast.LENGTH_SHORT).show();

                        if ((posCasilla == ((posFicha-nDado)+(posFicha+1))) && (cCasilla.equals(String.valueOf(cMapa.get(cFicha)).charAt(0)) || cCasilla.equals(String.valueOf(cMapa.get(cFicha)).charAt(1)))) {

                            moverFicha(button);

                        } else {
                            button.setVisibility(View.INVISIBLE);
                        }

                    }else if( posFicha > 6 && nDado < 4) {

                        if (posCasilla == (posFicha-nDado)) {

                            moverFicha(button);

                        } else {
                            button.setVisibility(View.INVISIBLE);
                        }
                    }else if( posFicha > 6 ) {

                        Toast.makeText(getApplicationContext(),"prueba "+ cMapa.get(cFicha),Toast.LENGTH_LONG).show();

                        if (posCasilla == ((posFicha-nDado)+((10-posFicha)+(10-(posFicha+1))))) {

                            moverFicha(button);

                        } else {
                            button.setVisibility(View.INVISIBLE);
                        }

                    }else{

                        if(posCasilla == nDado+posFicha && cCasilla.equals(cFicha) ){

                            moverFicha(button);

                        }else{
                            button.setVisibility(View.INVISIBLE);
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

                b_ficha.setTag(String.valueOf(b.getResources().getResourceEntryName(b.getId())));

                b_ficha.setX(b.getX());
                b_ficha.setY(b.getY());

                ocultarCasillas();
            }
        });
    }
}