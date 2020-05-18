package com.example.proyectomovil;

public class Questions {

    public String mQuestions[]={

            "¿De qué se alimentan los koalas?",
            "¿Quién inventó el telescopio?",
            "¿Cuál fue la primera película de Walt Disney?",
            "¿Cuántas veces parpadea una persona por semana?",
            "¿En que planeta estamos?",
            "¿Cual es nuestro satelite natural?",
            "¿Qué dia se tomo Dios para descansar?",
            "¿Que clase es esta?",
            "¿Cual es el nombre del profesor?",
            "¿Cuantos dias hay?",
            "¿Ciudad más poblada mundo?",
            "¿Qué cantidad de huesos en el cuerpo humano?",
            "¿De dónde son originarios juegos olímpicos?",
            "¿Cuál es el río más largo del mundo?",
            "¿Y el río más largo de España?",
            "¿Quién escribió La Odisea?",
            "¿Quién pintó “La última cena”?",
            "¿Cuantos dias hay?¿La ballena qué tipo de animal es?",
            "¿Cuál es el océano más grande?",
            "¿Cuál es el país más grande del mundo?",
            "¿Cuál es la moneda Marruecos?",
            "¿Cómo se llama la capital de Mongolia?",
            "¿Por cultivar qué producto es conocido Guatemala?",
            "¿Cómo se llama la Reina del Reino Unido?",
            "¿En qué año comenzó la II Guerra Mundial?",
            "¿Cual es país más poblado de la Tierra?",
            "¿Cuál es quinto planeta en el sistema solar?",
            "¿Cuál es la capital de Kosovo?",
            "¿En qué país se usó la primera bomba atómica en combate?",
            "¿Cuál es el metal más caro del mundo?"



    };

    public String mChoices [][] = {
            {"Plantas","hojas de eucalipto","Azucar","Miel"},
            {"Juan Roget","Galileo","A. Uribe","J. Santo"},
            {"La sirenita","Los 7","Blancanieves","Bella"},
            {"25.000","10","50.000","602.351"},
            {"Tierra","Martes","Mercury","Saturn"},
            {"El S.A.R 21","La luna","El sol","No tenemos"},
            {"Lunes","Domingo","Sabado","Viernes"},
            {"D. Moviles","Penal","Matematicas","Ni idea"},
            {"Juan","Carlos","Julian","Santiago"},
            {"2","6","9","7"},
            {"Tokio ","Cartagena","Brazilia","Guatemala"},
            {"206","360","250","225"},
            {"Chocó","Medellin","Roma","Olimpia"},
            {"Nilo","Amazonas","Cauca","Atrato"},
            {"Nilo","Tajo","Amazonas","Atrato"},
            {"Homero","Lucas","Cristiano Ronaldo","Leo Messi"},
            {"Leonardo da Vinci","Leonardo di Caprio","Juan Zapata","Lucas Perez"},
            {"Mamífero marino","Mamifero terrestre","Extraterrestre","Del agua"},
            {"Ninguno","Articulo","Atlantico","Pacífico"},
            {"Brasil","Colombia","Rusia","EEUU"},
            {"Lorapauta","Timbiqui","Dírham","Tétiröw"},
            {"Ulan Batorws","Ulan Bator","Bortäw","Ninguna"},
            {"El café","Marihuana","Gas","Azucar"},
            {"Isabel II","Pamela V","Valentains ","Cristina"},
            {"1939","1935","1996","1758"},
            {"India","China","Brazil","Tokio"},
            {"Júpiter","Tierra","Saturno","Martes"},
            {"Pristina","Angöu","üncloa","Eslovenia"},
            {"Quibdó","Cartagena","Minörk","Hiroshima"},
            {"Oro","Platino","Rodio","Cobre"}

    };

    private String mCorrectAnswers []= {"hojas de eucalipto",
            "Juan Roget",
            "Blancanieves",
            "25.000",
            "Tierra",
            "La luna",
            "Domingo",
            "D. Moviles",
            "Julian",
            "7",
            "Tokio",
            "206",
            "Olimpia",
            "Nilo",
            "Tajo",
            "Homero",
            "Leonardo da Vinci",
            "Mamífero marino",
            "Pacífico",
            "Rusia",
            "Dírham",
            "Ulan Bator",
            "El café",
            "Isabel II",
            "1939",
            "China",
            "Júpiter",
            "Pristina",
            "Hiroshima",
            "Rodio",
    };

    public String getQuestion (int a){
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }
   public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
   }
}
