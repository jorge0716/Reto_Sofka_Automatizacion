package Reto_Sofka_Trainning;

public class AleatorioPreguntas {
	
	      
     public int numero_Pregunta_Nivel1 = (int) (Math.random() * 5) + 1;
     public int numero_Pregunta_Nivel2 = (int) (Math.random() * 5) + 1;
     public int numero_Pregunta_Nivel3 = (int) (Math.random() * 5) + 1;
     public int numero_Pregunta_Nivel4 = (int) (Math.random() * 5) + 1;
     public int numero_Pregunta_Nivel5 = (int) (Math.random() * 5) + 1;

     

     public void PreguntasNivel1() {

         nivelUno niveluno = new nivelUno();

         switch (numero_Pregunta_Nivel1) {
             case 1:
                 niveluno.Pregunta1();
                 break;
             case 2:
                 niveluno.Pregunta2();
                 break;

             case 3:
                 niveluno.Pregunta3();
                 break;

             case 4:
                 niveluno.Pregunta4();
                 break;

             case 5:
                 niveluno.Pregunta5();
                 break;
         }

     }

     ;

     public void PreguntasNivel2() {

         nivelDos niveldos = new nivelDos();
         switch (numero_Pregunta_Nivel2) {
             case 1:
                 niveldos.Pregunta1();
                 break;
             case 2:
                 niveldos.Pregunta2();
                 break;

             case 3:
                 niveldos.Pregunta3();
                 break;

             case 4:
                 niveldos.Pregunta4();
                 break;

             case 5:
                 niveldos.Pregunta5();
                 break;
         }
     }

     public void PreguntasNivel3() {

         nivelTres niveltres = new nivelTres();

         switch (numero_Pregunta_Nivel3) {
             case 1:
                 niveltres.Pregunta1();
                 break;
             case 2:
                 niveltres.Pregunta2();
                 break;

             case 3:
                 niveltres.Pregunta3();
                 break;

             case 4:
                 niveltres.Pregunta4();
                 break;

             case 5:
                 niveltres.Pregunta5();
                 break;
         }

     }

     ;

     public void PreguntasNivel4() {
         nivelCuatro nivelcuatro = new nivelCuatro();
         switch (numero_Pregunta_Nivel4) {
             case 1:
                 nivelcuatro.Pregunta1();
                 break;
             case 2:
                 nivelcuatro.Pregunta2();
                 break;

             case 3:
                 nivelcuatro.Pregunta3();
                 break;

             case 4:
                 nivelcuatro.Pregunta4();
                 break;

             case 5:
                 nivelcuatro.Pregunta5();
                 break;
         }
     }

     public void PreguntasNivel5() {

         nivelCinco nivelcinco = new nivelCinco();
         switch (numero_Pregunta_Nivel5) {
             case 1:
                 nivelcinco.Pregunta1();
                 break;
             case 2:
                 nivelcinco.Pregunta2();
                 break;

             case 3:
                 nivelcinco.Pregunta3();
                 break;

             case 4:
                 nivelcinco.Pregunta4();
                 break;

             case 5:
                 nivelcinco.Pregunta5();
                 break;
         }
     }


}
