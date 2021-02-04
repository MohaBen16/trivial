package com.example.trivial;

import android.content.Context;

public class InsertarValoresbd {

    public InsertarValoresbd(Context contexto) {
        OperacionesBaseDatos opdb = OperacionesBaseDatos.Instanciar(contexto);

        opdb.BorrarTodasPreguntas();
        opdb.BorrarTodasRespuestas();

        opdb.SetPregunta(CategoriaPregunta.geografia,"¿Por donde pasa el rio Pisuerga?");
        opdb.SetRespuesta(1,"Palencia",false);
        opdb.SetRespuesta(1,"Valladolid",true);
        opdb.SetRespuesta(1,"Paris",false);
        opdb.SetRespuesta(1,"Madrid",false);

        opdb.SetPregunta(CategoriaPregunta.geografia,"¿Que rio pasa por Sevilla?");
        opdb.SetRespuesta(2,"Tajo",false);
        opdb.SetRespuesta(2,"Miño",false);
        opdb.SetRespuesta(2,"Guadalquivir",true);
        opdb.SetRespuesta(2,"Guadiana",false);

        opdb.SetPregunta(CategoriaPregunta.geografia,"¿Que pico es el mas alto de España?");
        opdb.SetRespuesta(3,"Teide",true);
        opdb.SetRespuesta(3,"Peña prieta",false);
        opdb.SetRespuesta(3,"Cura vacas",false);
        opdb.SetRespuesta(3,"Mulhacen",false);

        opdb.SetPregunta(CategoriaPregunta.geografia,"¿Que pico es el mas alto de la peninsula Iberica?");
        opdb.SetRespuesta(4,"Teide",false);
        opdb.SetRespuesta(4,"Peña prieta",false);
        opdb.SetRespuesta(4,"Cura vacas",false);
        opdb.SetRespuesta(4,"Mulhacen",true);

        opdb.SetPregunta(CategoriaPregunta.geografia,"¿En que sistema montañoso se encuentra Andorra?");
        opdb.SetRespuesta(5,"Los Alpes",false);
        opdb.SetRespuesta(5,"Los Pirineos",true);
        opdb.SetRespuesta(5,"Himalaya",false);
        opdb.SetRespuesta(5,"Cordillera cantabrica",false);

        opdb.SetPregunta(CategoriaPregunta.geografia,"¿En que continente esta china?");
        opdb.SetRespuesta(6,"Europa",false);
        opdb.SetRespuesta(6,"America",false);
        opdb.SetRespuesta(6,"Oceania",false);
        opdb.SetRespuesta(6,"Asia",true);

        opdb.SetPregunta(CategoriaPregunta.geografia,"¿Cual es el punto mas hondo del planeta tierra?");
        opdb.SetRespuesta(7,"La fosa de las marianas",true);
        opdb.SetRespuesta(7,"El medio del Atlantico",false);
        opdb.SetRespuesta(7,"El triangulo de las bermudas",false);
        opdb.SetRespuesta(7,"La Falla de San Andres",false);

        opdb.SetPregunta(CategoriaPregunta.geografia,"¿Entre qué países podemos encontrar el Estrecho de Bering?");
        opdb.SetRespuesta(8,"España y Marruecos",false);
        opdb.SetRespuesta(8,"Alemania y Dinamarca",false);
        opdb.SetRespuesta(8,"Estados Unidos y Rusia",true);
        opdb.SetRespuesta(8,"Costa Rica y Nicaragua",false);


        opdb.SetPregunta(CategoriaPregunta.historia,"¿Quién fue el primer presidente de la democracia española tras el franquismo?");
        opdb.SetRespuesta(9,"Felipe Gónzalez",false);
        opdb.SetRespuesta(9,"Jose Maria Aznar",false);
        opdb.SetRespuesta(9,"Donald Trump",false);
        opdb.SetRespuesta(9,"Adolfo Suarez",true);

        opdb.SetPregunta(CategoriaPregunta.historia,"¿La invasión de qué fortaleza es considerada como el punto de inicio de la Revolución Francesa?");
        opdb.SetRespuesta(10,"Bastilla",true);
        opdb.SetRespuesta(10,"La fortaleza Roja",false);
        opdb.SetRespuesta(10,"Vauban",false);
        opdb.SetRespuesta(10,"Versalles",false);

        opdb.SetPregunta(CategoriaPregunta.historia,"¿Cuánto duró la Guerra de los Cien Años?");
        opdb.SetRespuesta(11,"100",false);
        opdb.SetRespuesta(11,"116",true);
        opdb.SetRespuesta(11,"95",false);
        opdb.SetRespuesta(11,"101",false);


        opdb.SetPregunta(CategoriaPregunta.arte,"¿Quien pinto la mona lisa?");
        opdb.SetRespuesta(12,"Donatello",false);
        opdb.SetRespuesta(12,"Picasso",false);
        opdb.SetRespuesta(12,"Leonardo Da Vinci",true);
        opdb.SetRespuesta(12,"Van gogh",false);


        opdb.SetPregunta(CategoriaPregunta.deportes,"¿Donde gano España su primera Eurocopa?");
        opdb.SetRespuesta(13,"España",true);
        opdb.SetRespuesta(13,"Austria y Suiza",false);
        opdb.SetRespuesta(13,"Polonia y Ucrania",false);
        opdb.SetRespuesta(13,"Francia",false);


        opdb.SetPregunta(CategoriaPregunta.ciencia," ¿Cuál es la velocidad de la luz?");
        opdb.SetRespuesta(14,"325.743.187 km/s",false);
        opdb.SetRespuesta(14,"300.000.000 km/s",false);
        opdb.SetRespuesta(14,"400.000.000 km/s",false);
        opdb.SetRespuesta(14,"299.792.458 km/s",true);


        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Quién fue el famoso cantante del grupo musical Queen?");
        opdb.SetRespuesta(15,"325.743.187 km/s",false);
        opdb.SetRespuesta(15,"Freddie Mercury",true);
        opdb.SetRespuesta(15,"400.000.000 km/s",false);
        opdb.SetRespuesta(15,"299.792.458 km/s",false);
    }

}
