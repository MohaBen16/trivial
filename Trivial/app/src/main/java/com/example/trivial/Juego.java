package com.example.trivial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Juego extends AppCompatActivity {


    public static final Random RANDOM = new Random();

    Button b_dado,b_ficha1,b_ficha2,b1;
    ImageView iv_dado,q_azul,q_rojo,q_naranja,q_amarillo,q_verde,q_morado;
    TextView t_j1,t_j2;
    Animation anim;

    List<Jugador> jugador = new ArrayList<>();


    private static final int[] CASILLAS = {
            R.id.a1c,R.id.a2c,R.id.a3c,R.id.a4c,R.id.a5c,R.id.a6c,R.id.a7d,R.id.a7i,R.id.a8d,R.id.a8i,R.id.a9d,R.id.a9i,
            R.id.r1c,R.id.r2c,R.id.r3c,R.id.r4c,R.id.r5c,R.id.r6c,R.id.r7d,R.id.r7i,R.id.r8d,R.id.r8i,R.id.r9d,R.id.r9i,
            R.id.v1c,R.id.v2c,R.id.v3c,R.id.v4c,R.id.v5c,R.id.v6c,R.id.v7d,R.id.v7i,R.id.v8d,R.id.v8i,R.id.v9d,R.id.v9i,
            R.id.o1c,R.id.o2c,R.id.o3c,R.id.o4c,R.id.o5c,R.id.o6c,R.id.o7d,R.id.o7i,R.id.o8d,R.id.o8i,R.id.o9d,R.id.o9i,
            R.id.m1c,R.id.m2c,R.id.m3c,R.id.m4c,R.id.m5c,R.id.m6c,R.id.m7d,R.id.m7i,R.id.m8d,R.id.m8i,R.id.m9d,R.id.m9i,
            R.id.n1c,R.id.n2c,R.id.n3c,R.id.n4c,R.id.n5c,R.id.n6c,R.id.n7d,R.id.n7i,R.id.n8d,R.id.n8i,R.id.n9d,R.id.n9i,
            R.id.b0c
    };

    Map<String,String> cMapa= new HashMap<String,String>();

    int posFicha, turno = 0, tirar = 1 , n = 0;
    String cFicha;
    ArrayList<Jugador> jugadores;

    public String posFicha1,posFicha2;

    private float posX,posY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

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

        jugadores = (ArrayList<Jugador>) getIntent().getSerializableExtra("jugadores");


        try{

            jugadores.size();

            tirar = 3;

            final Button button1 = devolverButton(Integer.parseInt(jugadores.get(0).getPosicion()));
            final Button button2 =  devolverButton(Integer.parseInt(jugadores.get(1).getPosicion()));;

            if(jugadores.get(0).isTurno()){

                b_ficha1.setTag(String.valueOf(button1.getResources().getResourceEntryName(button1.getId())));
                b_ficha1.setX(button1.getX());
                b_ficha1.setY(button1.getY());

                // posicion en la que esta la ficha
                posFicha = b_ficha1.getTag().toString().charAt(1) - '0';
                // categoria en la que esta la ficha
                cFicha = String.valueOf(b_ficha1.getTag().toString().charAt(0));

                t_j1.setTextColor(Color.GREEN);
                t_j2.setTextColor(Color.RED);

            }else if(jugadores.get(1).isTurno()){

                b_ficha2.setTag(String.valueOf(button2.getResources().getResourceEntryName(button2.getId())));
                b_ficha2.setX(button2.getX());
                b_ficha2.setY(button2.getY());

                // posicion en la que esta la ficha
                posFicha = b_ficha2.getTag().toString().charAt(1) - '0';
                // categoria en la que esta la ficha
                cFicha = String.valueOf(b_ficha2.getTag().toString().charAt(0));

                t_j1.setTextColor(Color.RED);
                t_j2.setTextColor(Color.GREEN);

            }


        }catch (NullPointerException np){

            jugadores = new ArrayList<>();
            jugadores.add(new Jugador(1,1,"Moha",true,"1000235",false,false,false,false,false,false,false));
            jugadores.add(new Jugador(2,2,"Gonza",false,"1000234",false,false,false,false,false,false,false));
        }


        InsertarValoresbd ivd = new InsertarValoresbd(this);

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
                        jugadores.get(0).setTurno(true);
                        jugadores.get(1).setTurno(false);

                        Toast.makeText(getApplicationContext(), "Empieza " + jugadores.get(0).getNombre(), Toast.LENGTH_SHORT).show();
                    }else {
                        jugadores.get(0).setTurno(false);
                        jugadores.get(1).setTurno(true);
                        Toast.makeText(getApplicationContext(), "Empieza " + jugadores.get(1).getNombre(), Toast.LENGTH_SHORT).show();
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

                        if(jugadores.get(0).isTurno()){

                            // posicion en la que esta la ficha
                            posFicha = b_ficha1.getTag().toString().charAt(1) - '0';
                            // categoria en la que esta la ficha
                            cFicha = String.valueOf(b_ficha1.getTag().toString().charAt(0));

                            t_j1.setTextColor(Color.GREEN);
                            t_j2.setTextColor(Color.RED);
                            b_ficha1.setEnabled(true);
                            b_ficha2.setEnabled(false);

                        }else if(jugadores.get(1).isTurno()){

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

                        //Control de movimientos

                        if (posFicha + nDado <= 9 && posCasilla  > posFicha && posFicha <= 6 ) {

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
                        }else if( posFicha == 6) {

                            if ((posCasilla == (posFicha-nDado) && (cCasilla.equals(cFicha) || cCasilla.equals("b")))|| (posCasilla == ((posFicha-nDado)+(posFicha+1))) && ((cCasilla.equals(String.valueOf(cMapa.get(cFicha).charAt(0))) && (dCasilla.equals("d"))) || (cCasilla.equals(String.valueOf(cMapa.get(cFicha).charAt(1)))  && (dCasilla.equals("i"))))) {
                                moverFicha(button);
                            }else {
                                button.setVisibility(View.INVISIBLE);
                            }
                        }else if( posFicha > 6 ) {

                            if (posCasilla == (nDado+2) && (cCasilla.equals(String.valueOf(cMapa.get(cFicha).charAt(1))) && (dCasilla.equals("d"))) || ((posCasilla == (posFicha-((posFicha-5)+(posFicha-7)))+nDado && (cCasilla.equals(cFicha) && dCasilla.equals("i")) )) || (posCasilla == ((posFicha-2)+nDado) && (cCasilla.equals(cFicha) && dCasilla.equals("i"))) || (posCasilla == (posFicha-nDado) && cFicha.equals(cCasilla)) || posCasilla == ((posFicha-nDado)+((10-posFicha)+(10-(posFicha+1)))) && (cCasilla.equals(String.valueOf(cMapa.get(cFicha).charAt(1))) && (dCasilla.equals("i")) || (cCasilla.equals(String.valueOf(cMapa.get(cFicha).charAt(1))) && posCasilla == 6 ))) {
                                moverFicha(button);
                            }else {
                                button.setVisibility(View.INVISIBLE);
                            }
                        }
                    }
                }

                int res = getResources().getIdentifier("dado_"+nDado , "drawable", "com.example.trivial");
                anim = AnimationUtils.loadAnimation(getApplicationContext() ,R.anim.rotate);
                iv_dado.startAnimation(anim);
                iv_dado.setImageResource(res);
                iv_dado.setEnabled(false);
            }
        });
    }

    private Button devolverButton(int parseInt) {

        final Button button;

        for(int id : CASILLAS) {

            if(id == parseInt ){
                final Button button_dev = (Button) findViewById(id);
                return button_dev;
            }
        }

        return null;

    }

    public void ocultarCasillas(){
        for(int id : CASILLAS) {
            final Button button = (Button) findViewById(id);
            button.setVisibility(View.INVISIBLE);
        }
    }
    public void moverFicha(final Button b){

        b.setVisibility(View.VISIBLE);

        b_dado.setVisibility(View.INVISIBLE);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                anim = AnimationUtils.loadAnimation(getApplicationContext() ,R.anim.rotate);

                if(turno == 1){

                    b_ficha1.setTag(String.valueOf(b.getResources().getResourceEntryName(b.getId())));
                    b_ficha1.setX(b.getX());
                    b_ficha1.setY(b.getY());
                    b_ficha1.startAnimation(anim);

                    b_dado.setVisibility(View.VISIBLE);

                }else if(turno == 2){

                    b_ficha2.setTag(String.valueOf(b.getResources().getResourceEntryName(b.getId())));
                    b_ficha2.setX(b.getX());
                    b_ficha2.setY(b.getY());
                    b_ficha2.startAnimation(anim);

                    b_dado.setVisibility(View.VISIBLE);
                }
                ocultarCasillas();

                for(Jugador jugador : jugadores){
                    if(jugador.isTurno())
                        jugador.setPosicion(String.valueOf(b.getId()));
                }

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        boolean esQuesito = false;
                        if(posFicha == 6) esQuesito = true;

                        obtenerPreguntas(String.valueOf(b.getTag().toString().charAt(0)),esQuesito,jugadores);
                    }
                }, 1000);

                iv_dado.setEnabled(true);

            }
        });
    }

    private void obtenerPreguntas(String categoria, boolean esQuesito, ArrayList<Jugador> jugadores) {
        CategoriaPregunta catpregunta = CategoriaPregunta.geografia;
        if(categoria.equals("h"))
            catpregunta = CategoriaPregunta.historia;
        else if(categoria.equals("a"))
            catpregunta = CategoriaPregunta.arte;
        else if(categoria.equals("o"))
            catpregunta = CategoriaPregunta.deportes;
        else if(categoria.equals("c"))
            catpregunta = CategoriaPregunta.ciencia;
        else if(categoria.equals("e"))
            catpregunta = CategoriaPregunta.lengua;

        OperacionesBaseDatos opdb = OperacionesBaseDatos.Instanciar(this);
        Pregunta pregunta = opdb.GetPregunta(catpregunta);

        Intent intent = new Intent(this, Quiz.class);
        intent.putExtra("pregunta",pregunta);
        intent.putExtra("esQuesito",esQuesito);
        intent.putExtra("jugadores",jugadores);
        startActivity(intent);
    }

    public void clasificacion(View v){
        Intent intent = new Intent(this, Clasificacion.class);
        startActivity(intent);
    }
}