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

        //HITORIAAAAAA
        /*opdb.SetPregunta(CategoriaPregunta.historia,"¿Cuál fue el primer país en aprobar el sufragio femenino?");
        opdb.SetRespuesta(11,"Nueva Zelanda",true);
        opdb.SetRespuesta(11,"Alemania",false);
        opdb.SetRespuesta(11,"Reino Unido",false);
        opdb.SetRespuesta(11,"Francia",false);

        opdb.SetPregunta(CategoriaPregunta.historia,"¿En qué año llegó el hombre a la Luna?");
        opdb.SetRespuesta(11,"1983",false);
        opdb.SetRespuesta(11,"1930",false);
        opdb.SetRespuesta(11,"1954",false);
        opdb.SetRespuesta(11,"1969",true);

        opdb.SetPregunta(CategoriaPregunta.historia,"¿Qué carabela no regresó del primer viaje de Colón al Nuevo Mundo?");
        opdb.SetRespuesta(11,"La Niña",false);
        opdb.SetRespuesta(11,"La Pinta",false);
        opdb.SetRespuesta(11,"La Santa María",true);
        opdb.SetRespuesta(11,"Todas regresaron",false);

        opdb.SetPregunta(CategoriaPregunta.historia,"¿En qué año se disolvió la Unión Soviética?");
        opdb.SetRespuesta(11,"1998",false);
        opdb.SetRespuesta(11,"2001",false);
        opdb.SetRespuesta(11,"1991",true);
        opdb.SetRespuesta(11,"1978",false);

        opdb.SetPregunta(CategoriaPregunta.historia,"¿Qué reina británica fue hija de los Reyes Católicos?");
        opdb.SetRespuesta(11,"Catalina de Aragón",true);
        opdb.SetRespuesta(11,"María de Aragón",false);
        opdb.SetRespuesta(11,"Juana I de Castilla",false);
        opdb.SetRespuesta(11,"Isabel de Aragón",false);

        opdb.SetPregunta(CategoriaPregunta.historia,"¿Quién fue el primer presidente de Estados Unidos?");
        opdb.SetRespuesta(11,"John Adams",false);
        opdb.SetRespuesta(11,"George Washington",true);
        opdb.SetRespuesta(11,"Thomas Jefferson",false);
        opdb.SetRespuesta(11,"Abraham Lincoln",false);*/

        //ARTEEEEEE

        /*opdb.SetPregunta(CategoriaPregunta.arte,"¿Quién pintó 'La Mona Lisa'?");
        opdb.SetRespuesta(12,"Donatello",false);
        opdb.SetRespuesta(12,"Picasso",false);
        opdb.SetRespuesta(12,"Leonardo Da Vinci",true);
        opdb.SetRespuesta(12,"Van Gogh",false);

        opdb.SetPregunta(CategoriaPregunta.arte,"¿Qué filósofo creó 'El mito de la caverna'?");
        opdb.SetRespuesta(12,"Platón",true);
        opdb.SetRespuesta(12,"Aristóteles",false);
        opdb.SetRespuesta(12,"Sócrates",false);
        opdb.SetRespuesta(12,"Kant",false);

        opdb.SetPregunta(CategoriaPregunta.arte,"¿Quién escribió 'La colmena'?");
        opdb.SetRespuesta(12,"Miguel de Unamuno",false);
        opdb.SetRespuesta(12,"Mario Vargas Llosa",false);
        opdb.SetRespuesta(12,"Miguel Delibes",false);
        opdb.SetRespuesta(12,"Camilo José Cela",true);

        opdb.SetPregunta(CategoriaPregunta.arte,"¿Quién pintó el 'Guernica'?");
        opdb.SetRespuesta(12,"Monet",false);
        opdb.SetRespuesta(12,"Pablo Picasso",true);
        opdb.SetRespuesta(12,"Salvador Dalí",false);
        opdb.SetRespuesta(12,"Velázquez",false);

        opdb.SetPregunta(CategoriaPregunta.arte,"¿Cómo se llama el caballo de Don Quijote de la Mancha?");
        opdb.SetRespuesta(12,"Perdigón",false);
        opdb.SetRespuesta(12,"Tornado",false);
        opdb.SetRespuesta(12,"Babieca",false);
        opdb.SetRespuesta(12,"Rocinante",true);

        opdb.SetPregunta(CategoriaPregunta.arte,"¿De quién es la canción 'Can’t help falling in love with you'?");
        opdb.SetRespuesta(12,"Elvis Presley",true);
        opdb.SetRespuesta(12,"John Lennon",false);
        opdb.SetRespuesta(12,"Michael Jackson​",false);
        opdb.SetRespuesta(12,"Frank Sinatra",false);

        opdb.SetPregunta(CategoriaPregunta.arte,"¿A qué obra pertenece 'Ser o no ser, esa es la cuestión'?");
        opdb.SetRespuesta(12,"Romeo y Julieta",false);
        opdb.SetRespuesta(12,"Hamlet",true);
        opdb.SetRespuesta(12,"Crimen y castigo",false);
        opdb.SetRespuesta(12,"La Divina comedia",false);

        opdb.SetPregunta(CategoriaPregunta.arte,"¿Quién compuso 'Las cuatro estaciones'?");
        opdb.SetRespuesta(12,"Mozart",false);
        opdb.SetRespuesta(12,"Bach",false);
        opdb.SetRespuesta(12,"Beethoven",false);
        opdb.SetRespuesta(12,"Vivaldi",true);*/


        //DEPORTEEESSSS

        /*opdb.SetPregunta(CategoriaPregunta.deportes,"¿Dónde ganó España su primera Eurocopa?");
        opdb.SetRespuesta(13,"España",true);
        opdb.SetRespuesta(13,"Austria y Suiza",false);
        opdb.SetRespuesta(13,"Polonia y Ucrania",false);
        opdb.SetRespuesta(13,"Francia",false);

        opdb.SetPregunta(CategoriaPregunta.deportes,"¿Cuáles son los colores de los cinco anillos olímpicos?");
        opdb.SetRespuesta(13,"Morado, azul, negro, naranja y verde.",false);
        opdb.SetRespuesta(13,"Marrón, amarillo, rosa, rojo y verde.",false);
        opdb.SetRespuesta(13,"Amarillo, azul, negro, rojo y verde.",true);
        opdb.SetRespuesta(13,"Blanco, azul, negro, rojo y verde.",false);

        opdb.SetPregunta(CategoriaPregunta.deportes,"¿En qué ciudad está el estadio de fútbol de Mestalla?");
        opdb.SetRespuesta(13,"Valencia",true);
        opdb.SetRespuesta(13,"Madrid",false);
        opdb.SetRespuesta(13,"Bilbao",false);
        opdb.SetRespuesta(13,"Sevilla",false);

        opdb.SetPregunta(CategoriaPregunta.deportes,"¿Dónde se inventó el Ping-Pong?");
        opdb.SetRespuesta(13,"China",false);
        opdb.SetRespuesta(13,"Inglaterra",true);
        opdb.SetRespuesta(13,"Japón",false);
        opdb.SetRespuesta(13,"Estados Unidos",false);

        opdb.SetPregunta(CategoriaPregunta.deportes,"¿Cuántos jugadores hay en un equipo de voleibol?");
        opdb.SetRespuesta(13,"7",false);
        opdb.SetRespuesta(13,"5",false);
        opdb.SetRespuesta(13,"4",false);
        opdb.SetRespuesta(13,"6",true);

        opdb.SetPregunta(CategoriaPregunta.deportes,"¿Qué país ganó la primera Copa Mundial de Fútbol?");
        opdb.SetRespuesta(13,"Italia",false);
        opdb.SetRespuesta(13,"Uruguay",true);
        opdb.SetRespuesta(13,"Francia",false);
        opdb.SetRespuesta(13,"Brasil",false);

        opdb.SetPregunta(CategoriaPregunta.deportes,"¿Qué tenista ha ganado en más ocasiones el título de Roland Garros?");
        opdb.SetRespuesta(13,"Roger Federer",false);
        opdb.SetRespuesta(13,"Björn Borg",false);
        opdb.SetRespuesta(13,"Novak Djokovic",false);
        opdb.SetRespuesta(13,"Rafael Nadal",true);

        opdb.SetPregunta(CategoriaPregunta.deportes,"¿Quién fue la mascota de la Copa Mundial de Fútbol de España en 1982?");
        opdb.SetRespuesta(13,"Naranjito",true);
        opdb.SetRespuesta(13,"Súper Pepino",false);
        opdb.SetRespuesta(13,"Juanito",false);
        opdb.SetRespuesta(13,"Perico",false);*/


        //CIENCIAAAAAAA
        /*opdb.SetPregunta(CategoriaPregunta.ciencia," ¿Cuál es la velocidad de la luz?");
        opdb.SetRespuesta(14,"325.743.187 km/s",false);
        opdb.SetRespuesta(14,"300.000.000 km/s",false);
        opdb.SetRespuesta(14,"400.000.000 km/s",false);
        opdb.SetRespuesta(14,"299.792.458 km/s",true);

        opdb.SetPregunta(CategoriaPregunta.ciencia," ¿En qué mes el Sol está más cerca de la Tierra?");
        opdb.SetRespuesta(14,"Diciembre",true);
        opdb.SetRespuesta(14,"Enero",false);
        opdb.SetRespuesta(14,"Junio",false);
        opdb.SetRespuesta(14,"Octubre",false);

        opdb.SetPregunta(CategoriaPregunta.ciencia," ¿Qué elemento está presente en absolutamente todas las moléculas orgánicas?");
        opdb.SetRespuesta(14,"Nitrógeno",false);
        opdb.SetRespuesta(14,"Oxígeno",false);
        opdb.SetRespuesta(14,"Carbono",true);
        opdb.SetRespuesta(14,"Hidrógeno",false);

        opdb.SetPregunta(CategoriaPregunta.ciencia," De los cinco sentidos, ¿cuál es el que se desarrolla primero?");
        opdb.SetRespuesta(14,"Oído",false);
        opdb.SetRespuesta(14,"Gusto",false);
        opdb.SetRespuesta(14,"Olfato",true);
        opdb.SetRespuesta(14,"Tacto",false);

        opdb.SetPregunta(CategoriaPregunta.ciencia," ¿Cuál es el animal más venenoso del mundo?");
        opdb.SetRespuesta(14,"La mamba negra",false);
        opdb.SetRespuesta(14,"La avispa de mar",true);
        opdb.SetRespuesta(14,"El escorpión",false);
        opdb.SetRespuesta(14,"La viuda negra",false);

        opdb.SetPregunta(CategoriaPregunta.ciencia," Proceso por el que una célula se divide para formar dos células hijas se llama:");
        opdb.SetRespuesta(14,"Mitosis",true);
        opdb.SetRespuesta(14,"Disgregación",false);
        opdb.SetRespuesta(14,"Segregación",false);
        opdb.SetRespuesta(14,"Meiosis",false);

        opdb.SetPregunta(CategoriaPregunta.ciencia," Al descendiente del cruce de un asno y una yegua se le conoce como:");
        opdb.SetRespuesta(14,"Asno",false);
        opdb.SetRespuesta(14,"Burro",false);
        opdb.SetRespuesta(14,"Mulo",true);
        opdb.SetRespuesta(14,"Potro",false);

        opdb.SetPregunta(CategoriaPregunta.ciencia," Para los botánicos, el tomate es una:");
        opdb.SetRespuesta(14,"Legumbre",false);
        opdb.SetRespuesta(14,"Hortaliza",false);
        opdb.SetRespuesta(14,"Verdura",false);
        opdb.SetRespuesta(14,"Fruta",true);*/


        //ENTRETENIMIENTOOOOOO
        /*opdb.SetPregunta(CategoriaPregunta.lengua,"¿Quién fue el famoso cantante del grupo musical Queen?");
        opdb.SetRespuesta(15,"George Cloney",false);
        opdb.SetRespuesta(15,"Freddie Mercury",true);
        opdb.SetRespuesta(15,"Michael Jackson",false);
        opdb.SetRespuesta(15,"Marilyn Manson",false);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Cómo se llama la madre de Simba en la película de Disney 'El Rey León'?");
        opdb.SetRespuesta(15,"Nala",false);
        opdb.SetRespuesta(15,"Sarabi",true);
        opdb.SetRespuesta(15,"Sarafina",false);
        opdb.SetRespuesta(15,"Banzai",false);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Cuál ha sido la película más taquillera de la historia?");
        opdb.SetRespuesta(15,"Avatar",false);
        opdb.SetRespuesta(15,"Star Wars VII: El despertar de la fuerza",false);
        opdb.SetRespuesta(15,"Titanic",false);
        opdb.SetRespuesta(15,"Los Vengadores: Endgame",true);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Qué personaje es un pícaro de playa en la serie 'La que se avecina'?");
        opdb.SetRespuesta(15,"Antonio Recio",false);
        opdb.SetRespuesta(15,"Amador Rivas",false);
        opdb.SetRespuesta(15,"Fermín Trujillo",true);
        opdb.SetRespuesta(15,"Enrique Pastor",false);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Cuál fue la primera película de Disney?");
        opdb.SetRespuesta(15,"La bella durmiente",false);
        opdb.SetRespuesta(15,"Blancanieves",true);
        opdb.SetRespuesta(15,"Cenicienta",false);
        opdb.SetRespuesta(15,"Pocahontas",false);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Qué actriz protagonizó 'Desayuno con diamantes'?");
        opdb.SetRespuesta(15,"Elizabeth Taylor ",false);
        opdb.SetRespuesta(15,"Sophia Loren",false);
        opdb.SetRespuesta(15,"Marilyn Monroe",false);
        opdb.SetRespuesta(15,"Audrey Hepburn",true);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Qué actor protagonizó 'Pretty Woman'?");
        opdb.SetRespuesta(15,"Richard Gere",true);
        opdb.SetRespuesta(15,"Tom Cruise",false);
        opdb.SetRespuesta(15,"George Clooney",false);
        opdb.SetRespuesta(15,"Brad Pitt",false);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Quién cantaba: '¿Quién es? Soy yo'?");
        opdb.SetRespuesta(15,"Amaral",false);
        opdb.SetRespuesta(15,"Pimpinela",true);
        opdb.SetRespuesta(15,"Raphael e Isabel Pantoja",false);
        opdb.SetRespuesta(15,"Mecano",false);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Quién ha sido reconocido como mejor streamer del mundo por los Esports Awards 2020?");
        opdb.SetRespuesta(15,"Dr. Lupo",false);
        opdb.SetRespuesta(15,"Ocelote",false);
        opdb.SetRespuesta(15,"Cristinini",false);
        opdb.SetRespuesta(15,"Ibai Llanos",true);*/

    }

}
