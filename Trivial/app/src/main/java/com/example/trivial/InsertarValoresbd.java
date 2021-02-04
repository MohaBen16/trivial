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

        opdb.SetPregunta(CategoriaPregunta.historia,"¿Cuál fue el primer país en aprobar el sufragio femenino?");
        opdb.SetRespuesta(12,"Nueva Zelanda",true);
        opdb.SetRespuesta(12,"Alemania",false);
        opdb.SetRespuesta(12,"Reino Unido",false);
        opdb.SetRespuesta(12,"Francia",false);

        opdb.SetPregunta(CategoriaPregunta.historia,"¿En qué año llegó el hombre a la Luna?");
        opdb.SetRespuesta(13,"1983",false);
        opdb.SetRespuesta(13,"1930",false);
        opdb.SetRespuesta(13,"1954",false);
        opdb.SetRespuesta(13,"1969",true);

        opdb.SetPregunta(CategoriaPregunta.historia,"¿Qué carabela no regresó del primer viaje de Colón al Nuevo Mundo?");
        opdb.SetRespuesta(14,"La Niña",false);
        opdb.SetRespuesta(14,"La Pinta",false);
        opdb.SetRespuesta(14,"La Santa María",true);
        opdb.SetRespuesta(14,"Todas regresaron",false);

        opdb.SetPregunta(CategoriaPregunta.historia,"¿En qué año se disolvió la Unión Soviética?");
        opdb.SetRespuesta(15,"1998",false);
        opdb.SetRespuesta(15,"2001",false);
        opdb.SetRespuesta(15,"1991",true);
        opdb.SetRespuesta(15,"1978",false);

        opdb.SetPregunta(CategoriaPregunta.historia,"¿Qué reina británica fue hija de los Reyes Católicos?");
        opdb.SetRespuesta(16,"Catalina de Aragón",true);
        opdb.SetRespuesta(16,"María de Aragón",false);
        opdb.SetRespuesta(16,"Juana I de Castilla",false);
        opdb.SetRespuesta(16,"Isabel de Aragón",false);

        opdb.SetPregunta(CategoriaPregunta.historia,"¿Quién fue el primer presidente de Estados Unidos?");
        opdb.SetRespuesta(17,"John Adams",false);
        opdb.SetRespuesta(17,"George Washington",true);
        opdb.SetRespuesta(17,"Thomas Jefferson",false);
        opdb.SetRespuesta(17,"Abraham Lincoln",false);


        opdb.SetPregunta(CategoriaPregunta.arte,"¿Quién pintó 'La Mona Lisa'?");
        opdb.SetRespuesta(18,"Donatello",false);
        opdb.SetRespuesta(18,"Picasso",false);
        opdb.SetRespuesta(18,"Leonardo Da Vinci",true);
        opdb.SetRespuesta(18,"Van Gogh",false);

        opdb.SetPregunta(CategoriaPregunta.arte,"¿Qué filósofo creó 'El mito de la caverna'?");
        opdb.SetRespuesta(19,"Platón",true);
        opdb.SetRespuesta(19,"Aristóteles",false);
        opdb.SetRespuesta(19,"Sócrates",false);
        opdb.SetRespuesta(19,"Kant",false);

        opdb.SetPregunta(CategoriaPregunta.arte,"¿Quién escribió 'La colmena'?");
        opdb.SetRespuesta(20,"Miguel de Unamuno",false);
        opdb.SetRespuesta(20,"Mario Vargas Llosa",false);
        opdb.SetRespuesta(20,"Miguel Delibes",false);
        opdb.SetRespuesta(20,"Camilo José Cela",true);

        opdb.SetPregunta(CategoriaPregunta.arte,"¿Quién pintó el 'Guernica'?");
        opdb.SetRespuesta(21,"Monet",false);
        opdb.SetRespuesta(21,"Pablo Picasso",true);
        opdb.SetRespuesta(21,"Salvador Dalí",false);
        opdb.SetRespuesta(21,"Velázquez",false);

        opdb.SetPregunta(CategoriaPregunta.arte,"¿Cómo se llama el caballo de Don Quijote de la Mancha?");
        opdb.SetRespuesta(22,"Perdigón",false);
        opdb.SetRespuesta(22,"Tornado",false);
        opdb.SetRespuesta(22,"Babieca",false);
        opdb.SetRespuesta(22,"Rocinante",true);

        opdb.SetPregunta(CategoriaPregunta.arte,"¿De quién es la canción 'Can’t help falling in love with you'?");
        opdb.SetRespuesta(23,"Elvis Presley",true);
        opdb.SetRespuesta(23,"John Lennon",false);
        opdb.SetRespuesta(23,"Michael Jackson​",false);
        opdb.SetRespuesta(23,"Frank Sinatra",false);

        opdb.SetPregunta(CategoriaPregunta.arte,"¿A qué obra pertenece 'Ser o no ser, esa es la cuestión'?");
        opdb.SetRespuesta(24,"Romeo y Julieta",false);
        opdb.SetRespuesta(24,"Hamlet",true);
        opdb.SetRespuesta(24,"Crimen y castigo",false);
        opdb.SetRespuesta(24,"La Divina comedia",false);

        opdb.SetPregunta(CategoriaPregunta.arte,"¿Quién compuso 'Las cuatro estaciones'?");
        opdb.SetRespuesta(25,"Mozart",false);
        opdb.SetRespuesta(25,"Bach",false);
        opdb.SetRespuesta(25,"Beethoven",false);
        opdb.SetRespuesta(25,"Vivaldi",true);


        opdb.SetPregunta(CategoriaPregunta.deportes,"¿Dónde ganó España su primera Eurocopa?");
        opdb.SetRespuesta(26,"España",true);
        opdb.SetRespuesta(26,"Austria y Suiza",false);
        opdb.SetRespuesta(26,"Polonia y Ucrania",false);
        opdb.SetRespuesta(26,"Francia",false);

        opdb.SetPregunta(CategoriaPregunta.deportes,"¿Cuáles son los colores de los cinco anillos olímpicos?");
        opdb.SetRespuesta(27,"Morado, azul, negro, naranja y verde.",false);
        opdb.SetRespuesta(27,"Marrón, amarillo, rosa, rojo y verde.",false);
        opdb.SetRespuesta(27,"Amarillo, azul, negro, rojo y verde.",true);
        opdb.SetRespuesta(27,"Blanco, azul, negro, rojo y verde.",false);

        opdb.SetPregunta(CategoriaPregunta.deportes,"¿En qué ciudad está el estadio de fútbol de Mestalla?");
        opdb.SetRespuesta(28,"Valencia",true);
        opdb.SetRespuesta(28,"Madrid",false);
        opdb.SetRespuesta(28,"Bilbao",false);
        opdb.SetRespuesta(28,"Sevilla",false);

        opdb.SetPregunta(CategoriaPregunta.deportes,"¿Dónde se inventó el Ping-Pong?");
        opdb.SetRespuesta(29,"China",false);
        opdb.SetRespuesta(29,"Inglaterra",true);
        opdb.SetRespuesta(29,"Japón",false);
        opdb.SetRespuesta(29,"Estados Unidos",false);

        opdb.SetPregunta(CategoriaPregunta.deportes,"¿Cuántos jugadores hay en un equipo de voleibol?");
        opdb.SetRespuesta(30,"7",false);
        opdb.SetRespuesta(30,"5",false);
        opdb.SetRespuesta(30,"4",false);
        opdb.SetRespuesta(30,"6",true);

        opdb.SetPregunta(CategoriaPregunta.deportes,"¿Qué país ganó la primera Copa Mundial de Fútbol?");
        opdb.SetRespuesta(31,"Italia",false);
        opdb.SetRespuesta(31,"Uruguay",true);
        opdb.SetRespuesta(31,"Francia",false);
        opdb.SetRespuesta(31,"Brasil",false);

        opdb.SetPregunta(CategoriaPregunta.deportes,"¿Qué tenista ha ganado en más ocasiones el título de Roland Garros?");
        opdb.SetRespuesta(32,"Roger Federer",false);
        opdb.SetRespuesta(32,"Björn Borg",false);
        opdb.SetRespuesta(32,"Novak Djokovic",false);
        opdb.SetRespuesta(32,"Rafael Nadal",true);

        opdb.SetPregunta(CategoriaPregunta.deportes,"¿Quién fue la mascota de la Copa Mundial de Fútbol de España en 1982?");
        opdb.SetRespuesta(33,"Naranjito",true);
        opdb.SetRespuesta(33,"Súper Pepino",false);
        opdb.SetRespuesta(33,"Juanito",false);
        opdb.SetRespuesta(33,"Perico",false);


        opdb.SetPregunta(CategoriaPregunta.ciencia," ¿Cuál es la velocidad de la luz?");
        opdb.SetRespuesta(34,"325.743.187 km/s",false);
        opdb.SetRespuesta(34,"300.000.000 km/s",false);
        opdb.SetRespuesta(34,"400.000.000 km/s",false);
        opdb.SetRespuesta(34,"299.792.458 km/s",true);

        opdb.SetPregunta(CategoriaPregunta.ciencia," ¿En qué mes el Sol está más cerca de la Tierra?");
        opdb.SetRespuesta(35,"Diciembre",true);
        opdb.SetRespuesta(35,"Enero",false);
        opdb.SetRespuesta(35,"Junio",false);
        opdb.SetRespuesta(35,"Octubre",false);

        opdb.SetPregunta(CategoriaPregunta.ciencia," ¿Qué elemento está presente en absolutamente todas las moléculas orgánicas?");
        opdb.SetRespuesta(36,"Nitrógeno",false);
        opdb.SetRespuesta(36,"Oxígeno",false);
        opdb.SetRespuesta(36,"Carbono",true);
        opdb.SetRespuesta(36,"Hidrógeno",false);

        opdb.SetPregunta(CategoriaPregunta.ciencia," De los cinco sentidos, ¿cuál es el que se desarrolla primero?");
        opdb.SetRespuesta(37,"Oído",false);
        opdb.SetRespuesta(37,"Gusto",false);
        opdb.SetRespuesta(37,"Olfato",true);
        opdb.SetRespuesta(37,"Tacto",false);

        opdb.SetPregunta(CategoriaPregunta.ciencia," ¿Cuál es el animal más venenoso del mundo?");
        opdb.SetRespuesta(38,"La mamba negra",false);
        opdb.SetRespuesta(38,"La avispa de mar",true);
        opdb.SetRespuesta(38,"El escorpión",false);
        opdb.SetRespuesta(38,"La viuda negra",false);

        opdb.SetPregunta(CategoriaPregunta.ciencia," Proceso por el que una célula se divide para formar dos células hijas se llama:");
        opdb.SetRespuesta(39,"Mitosis",true);
        opdb.SetRespuesta(39,"Disgregación",false);
        opdb.SetRespuesta(39,"Segregación",false);
        opdb.SetRespuesta(39,"Meiosis",false);

        opdb.SetPregunta(CategoriaPregunta.ciencia," Al descendiente del cruce de un asno y una yegua se le conoce como:");
        opdb.SetRespuesta(40,"Asno",false);
        opdb.SetRespuesta(40,"Burro",false);
        opdb.SetRespuesta(40,"Mulo",true);
        opdb.SetRespuesta(40,"Potro",false);

        opdb.SetPregunta(CategoriaPregunta.ciencia," Para los botánicos, el tomate es una:");
        opdb.SetRespuesta(41,"Legumbre",false);
        opdb.SetRespuesta(41,"Hortaliza",false);
        opdb.SetRespuesta(41,"Verdura",false);
        opdb.SetRespuesta(41,"Fruta",true);


        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Quién fue el famoso cantante del grupo musical Queen?");
        opdb.SetRespuesta(42,"George Cloney",false);
        opdb.SetRespuesta(42,"Freddie Mercury",true);
        opdb.SetRespuesta(42,"Michael Jackson",false);
        opdb.SetRespuesta(42,"Marilyn Manson",false);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Cómo se llama la madre de Simba en la película de Disney 'El Rey León'?");
        opdb.SetRespuesta(43,"Nala",false);
        opdb.SetRespuesta(43,"Sarabi",true);
        opdb.SetRespuesta(43,"Sarafina",false);
        opdb.SetRespuesta(43,"Banzai",false);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Cuál ha sido la película más taquillera de la historia?");
        opdb.SetRespuesta(44,"Avatar",false);
        opdb.SetRespuesta(44,"Star Wars VII: El despertar de la fuerza",false);
        opdb.SetRespuesta(44,"Titanic",false);
        opdb.SetRespuesta(44,"Los Vengadores: Endgame",true);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Qué personaje es un pícaro de playa en la serie 'La que se avecina'?");
        opdb.SetRespuesta(45,"Antonio Recio",false);
        opdb.SetRespuesta(45,"Amador Rivas",false);
        opdb.SetRespuesta(45,"Fermín Trujillo",true);
        opdb.SetRespuesta(45,"Enrique Pastor",false);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Cuál fue la primera película de Disney?");
        opdb.SetRespuesta(46,"La bella durmiente",false);
        opdb.SetRespuesta(46,"Blancanieves",true);
        opdb.SetRespuesta(46,"Cenicienta",false);
        opdb.SetRespuesta(46,"Pocahontas",false);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Qué actriz protagonizó 'Desayuno con diamantes'?");
        opdb.SetRespuesta(47,"Elizabeth Taylor ",false);
        opdb.SetRespuesta(47,"Sophia Loren",false);
        opdb.SetRespuesta(47,"Marilyn Monroe",false);
        opdb.SetRespuesta(47,"Audrey Hepburn",true);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Qué actor protagonizó 'Pretty Woman'?");
        opdb.SetRespuesta(48,"Richard Gere",true);
        opdb.SetRespuesta(48,"Tom Cruise",false);
        opdb.SetRespuesta(48,"George Clooney",false);
        opdb.SetRespuesta(48,"Brad Pitt",false);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Quién cantaba: '¿Quién es? Soy yo'?");
        opdb.SetRespuesta(49,"Amaral",false);
        opdb.SetRespuesta(49,"Pimpinela",true);
        opdb.SetRespuesta(49,"Raphael e Isabel Pantoja",false);
        opdb.SetRespuesta(49,"Mecano",false);

        opdb.SetPregunta(CategoriaPregunta.lengua,"¿Quién ha sido reconocido como mejor streamer del mundo por los Esports Awards 2020?");
        opdb.SetRespuesta(50,"Dr. Lupo",false);
        opdb.SetRespuesta(50,"Ocelote",false);
        opdb.SetRespuesta(50,"Cristinini",false);
        opdb.SetRespuesta(50,"Ibai Llanos",true);

    }

}
