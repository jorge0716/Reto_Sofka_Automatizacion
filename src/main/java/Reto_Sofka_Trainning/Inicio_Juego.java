package Reto_Sofka_Trainning;
import java.util.Scanner;

public class Inicio_Juego {
	
	  private int respuestanivel1 = 0;
	    private int respuestanivel2 = 0;
	    private int respuestanivel3 = 0;
	    private int respuestanivel4 = 0;
	    private int respuestanivel5 = 0;
	    private String irNivel2 = " ";
	    private String irNivel3 = " ";
	    private String irNivel4 = " ";
	    private String irNivel5 = " ";
	    public String nombreJugador = "";
	    public String [] Jugadores = new String[100];
	    public double [] PremiosJugadores = new double[100];
	    public double premio = 0;
	
	public  void iniciarJuego() {


        AleatorioPreguntas aleatorio = new AleatorioPreguntas();
        Scanner Teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        nombreJugador = Teclado.nextLine();
        System.out.println("HOLA " + nombreJugador + " VAMOS A JUGAR!!!!");

        aleatorio.PreguntasNivel1();
        System.out.println("Elija su respuesta correcta");
        respuestanivel1 = Teclado.nextInt();

        switch (aleatorio.numero_Pregunta_Nivel1) {
            case 1:
                if (respuestanivel1 == 1) {
                    System.out.println("Vamos al nivel 2");
                    premio += 300000;
                    System.out.println(" Premio acumulado: " + premio);
                    System.out.println("¿Desea continuar?");
                    System.out.println("Si - escribe s");
                    System.out.println("No - escribe n");
                    irNivel2 = Teclado.next();
                    if (irNivel2.equals("s") ) {
                        aleatorio.PreguntasNivel2();
                        System.out.println("Elija una opcion");
                        respuestanivel2 = Teclado.nextInt();
                    }
                    ;
                    if (irNivel2.equals("n"))
                    {
                        System.out.println("Gracias por participar, has ganado: " + premio);

                    }

                }
                if (respuestanivel1 != 1) {
                    System.out.println("Perdió....");

                }
                ;
                break;

            case 2:
                if (respuestanivel1 == 4) {
                    System.out.println("Vamos al nivel 2");
                    premio += 300000;
                    System.out.println(" Premio acumulado: " + premio);
                    System.out.println("¿Desea continuar?");
                    System.out.println("Si - escribe s");
                    System.out.println("No - escribe n");
                    irNivel2 = Teclado.next();
                    if (irNivel2.equals("s")) {
                        aleatorio.PreguntasNivel2();
                        System.out.println("Elija una opcion");
                        respuestanivel2 = Teclado.nextInt();
                    }
                    ;
                    if (irNivel2.equals("n"))
                    {
                        System.out.println("Se ganó: " + premio);

                    }

                }
                if (respuestanivel1 != 4) {
                    System.out.println("Perdió....");

                }
                ;
                break;

            case 3:
                if (respuestanivel1 == 3) {
                	  System.out.println("Vamos al nivel 2");
                      premio += 300000;
                      System.out.println(" Premio acumulado: " + premio);
                      System.out.println("¿Desea continuar?");
                      System.out.println("Si - escribe s");
                      System.out.println("No - escribe n");
                      irNivel2 = Teclado.next();
                    if (irNivel2.equals("s")) {
                        aleatorio.PreguntasNivel2();
                        System.out.println("Elija una opcion");
                        respuestanivel2 = Teclado.nextInt();
                    }
                    ;
                    if (irNivel2.equals("n"))
                    {

                        System.out.println("Se ganó: " + premio);

                    }
                }
                if (respuestanivel1 != 3) {
                    System.out.println("Perdio...");

                }
                ;
                break;

            case 4:
                if (respuestanivel1 == 4) {
                	System.out.println("Vamos al nivel 2");
                    premio += 300000;
                    System.out.println(" Premio acumulado: " + premio);
                    System.out.println("¿Desea continuar?");
                    System.out.println("Si - escribe s");
                    System.out.println("No - escribe n");
                    irNivel2 = Teclado.next();
                    if (irNivel2.equals("s")) {
                        aleatorio.PreguntasNivel2();
                        System.out.println("Elija una opcion");
                        respuestanivel2 = Teclado.nextInt();
                    }
                    ;
                    if (irNivel2.equals("n"))
                    {
                    	System.out.println("Se ganó: " + premio);

                    }
                }
                if (respuestanivel1 != 4) {
                	System.out.println("Perdio...");

                }
                ;
                break;

            case 5:
                if (respuestanivel1 == 3) {
                	System.out.println("Vamos al nivel 2");
                    premio += 300000;
                    System.out.println(" Premio acumulado: " + premio);
                    System.out.println("¿Desea continuar?");
                    System.out.println("Si - escribe s");
                    System.out.println("No - escribe n");
                    irNivel2 = Teclado.next();
                    if (irNivel2.equals("n")) {
                        aleatorio.PreguntasNivel2();
                        System.out.println("Elija una opcion");
                        respuestanivel2 = Teclado.nextInt();
                    }
                    ;
                    if (irNivel2.equals("n"))
                    {
                    	System.out.println("Se ganó: " + premio);

                    }
                }
                if (respuestanivel1 != 3) {
                	System.out.println("Perdio...");

                }
                ;
                break;

        }

        if(irNivel2.equals("s"))
        {
            switch (aleatorio.numero_Pregunta_Nivel2) {
                case 1:
                    if (respuestanivel2 == 3) {
                    	System.out.println("Vamos al nivel 2");
                        premio += 400000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        if (irNivel3.equals("s")) {
                            aleatorio.PreguntasNivel3();
                            System.out.println("Elija una opcion");
                            respuestanivel3 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel3.equals("s")) 
                        {
                        	System.out.println("Se ganó: " + premio);
                        }
                        	
                    }
                    if (respuestanivel2 != 3) {
                    	System.out.println("Perdio...");
                    }
                    ;
                    break;

                case 2:
                    if (respuestanivel2 == 1) {
                    	System.out.println("Vamos al nivel 2");
                        premio += 400000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        irNivel3 = Teclado.next();
                        if (irNivel3.equals("s")) {
                            aleatorio.PreguntasNivel3();
                            System.out.println("Elija su respuesta correcta");
                            respuestanivel3 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel3.equals("n"))
                        { 
                        	System.out.println("Se ganó: " + premio);
                        }

                    }
                    if (respuestanivel2 != 1) {
                    	System.out.println("Perdio...");
                    }
                    ;
                    break;

                case 3:
                    if (respuestanivel2 == 4) {
                    	System.out.println("Vamos al nivel 2");
                        premio += 400000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        irNivel3 = Teclado.next();
                        if (irNivel3.equals("s")) {
                            aleatorio.PreguntasNivel3();
                            System.out.println("Elija una opcion");
                            respuestanivel3 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel3.equals("n"))
                        	{
                        		System.out.println("Se ganó: " + premio);
                        	}
                        	
                    }
                    if (respuestanivel2 != 4) 
                    {
                    	System.out.println("Perdio...");
                    }
                    ;
                    break;

                case 4:
                    if (respuestanivel2 == 2) {
                    	System.out.println("Vamos al nivel 2");
                        premio += 400000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        irNivel3 = Teclado.next();
                        if (irNivel3.equals("s")) {
                            aleatorio.PreguntasNivel3();
                            System.out.println("Elija una opcion");
                            respuestanivel3 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel3.equals("n")) 
                        {
                        	System.out.println("Se ganó: " + premio);
                        }
                    }
                    if (respuestanivel2 != 2) {
                    	System.out.println("Perdio...");
                    }
                    ;
                    break;

                case 5:
                    if (respuestanivel2 == 3) {
                    	System.out.println("Vamos al nivel 2");
                        premio += 400000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        irNivel3 = Teclado.next();
                        if (irNivel3.equals("s")) {
                            aleatorio.PreguntasNivel3();
                            System.out.println("Elija una opcion");
                            respuestanivel3 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel3.equals("n"))
                        {
                        	System.out.println("Se ganó: " + premio);
                        }
                    }
                    if (respuestanivel2 != 3) {
                    	System.out.println("Perdio...");
                    }
                    ;
                    break;

            }
        }
        if(irNivel3.equals("s"))
        {
            switch (aleatorio.numero_Pregunta_Nivel3) {
                case 1:
                    if (respuestanivel3 == 3) {
                    	System.out.println("Vamos al nivel 2");
                        premio += 500000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        irNivel4 = Teclado.next();
                        if (irNivel4.equals("s")) {
                            aleatorio.PreguntasNivel4();
                            System.out.println("Elija una opcion");
                            respuestanivel4 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel4.equals("s")) 
                        {
                        	System.out.println("Se ganó: " + premio);
                        }

                    }
                    if (respuestanivel3 != 3) {
                        System.out.println("Perdio...");
                    }
                    ;
                    break;

                case 2:
                    if (respuestanivel3 == 4) {
                    	System.out.println("Vamos al nivel 2");
                        premio += 500000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        irNivel4 = Teclado.next();
                        if (irNivel4.equals("s")) {
                            aleatorio.PreguntasNivel4();
                            System.out.println("Elija una opcion");
                            respuestanivel4 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel4.equals("n"))
                        	{
                        		System.out.println("Se ganó: " + premio);
                        	}

                    }
                    
                    if (respuestanivel3 != 4) 
                    {
                    	System.out.println("Perdio...");
                    }
                    ;
                    break;

                case 3:
                    if (respuestanivel3 == 1) {
                    	
                    	System.out.println("Vamos al nivel 2");
                        premio += 500000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        irNivel4 = Teclado.next();
                        
                        if (irNivel4.equals("s")) {
                            aleatorio.PreguntasNivel4();
                            System.out.println("Elija una opcion");
                            respuestanivel4 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel4.equals("n")) 
                        	{
                        		System.out.println("Se ganó: " + premio);
                        	}
                    }
                    if (respuestanivel3 != 1)
                    {
                    	System.out.println("Perdio...");
                    }
                    ;
                    break;

                case 4:
                    if (respuestanivel3 == 4) {
                    	System.out.println("Vamos al nivel 2");
                        premio += 500000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        irNivel4 = Teclado.next();
                        if (irNivel4.equals("s")) {
                            aleatorio.PreguntasNivel4();
                            System.out.println("Elija una opcion");
                            respuestanivel4 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel4.equals("n"))
                        	{
                        		System.out.println("Se ganó: " + premio);
                        	}
                    }
                    if (respuestanivel3 != 4) 
                    {
                    	System.out.println("Perdio...");
                    }
                    ;
                    break;

                case 5:
                    if (respuestanivel3 == 1) {
                    	System.out.println("Vamos al nivel 2");
                        premio += 500000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        irNivel4 = Teclado.next();
                        
                        if (irNivel4.equals("s")) {
                            aleatorio.PreguntasNivel4();
                            System.out.println("Elija una opcion");
                            respuestanivel4 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel4.equals("n"))
                        	{
                        		System.out.println("Se ganó: " + premio);
                        	}
                    }
                    if (respuestanivel3 != 1) 
                    {
                    	System.out.println("Perdio...");
                    }
                    ;
                    break;

            }
        }
        if(irNivel4.equals("s"))
        {
            switch (aleatorio.numero_Pregunta_Nivel4) {
                case 1:
                    if (respuestanivel4 == 4) {
                    	System.out.println("Vamos al nivel 2");
                        premio += 800000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        irNivel5 = Teclado.next();
                        if (irNivel5.equals("s")) {
                            aleatorio.PreguntasNivel5();
                            System.out.println("Elija una opcion");
                            respuestanivel5 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel5.equals("n"))
                        	{
                        	System.out.println("Se ganó: " + premio);
                        	}

                    }
                    if (respuestanivel4 != 4) {
                    	System.out.println("Perdio...");
                    }
                    ;
                    break;

                case 2:
                    if (respuestanivel4 == 1) {
                    	System.out.println("Vamos al nivel 2");
                        premio += 800000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        irNivel5 = Teclado.next();
                        if (irNivel5.equals("s")) {
                            aleatorio.PreguntasNivel5();
                            System.out.println("Elija una opcion");
                            respuestanivel5 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel5.equals("n"))
                        	{
                        		System.out.println("Se ganó: " + premio);
                        	}

                    }
                    if (respuestanivel4 != 1)
                    {
                    	System.out.println("Perdio...");
                    }
                    ;
                    break;

                case 3:
                    if (respuestanivel4 == 2) {
                    	System.out.println("Vamos al nivel 2");
                        premio += 800000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        irNivel5 = Teclado.next();
                        if (irNivel5.equals("s")) {
                            aleatorio.PreguntasNivel5();
                            System.out.println("Elija una opcion");
                            respuestanivel5 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel5.equals("n")) 
                        	{
                        		System.out.println("Se ganó: " + premio);
                        	}
                    }
                    if (respuestanivel4 != 2)
                    {
                    	System.out.println("Perdio...");
                    }
                    ;
                    break;

                case 4:
                    if (respuestanivel4 == 1) {
                    	System.out.println("Vamos al nivel 2");
                        premio += 800000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        irNivel5 = Teclado.next();
                        if (irNivel5.equals("s")) {
                            aleatorio.PreguntasNivel5();
                            System.out.println("Elija una opcion");
                            respuestanivel5 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel5.equals("n"))
                        	{
                        		System.out.println("Se ganó: " + premio);
                        	}
                    }
                    if (respuestanivel4 != 1) {
                    	System.out.println("Perdio...");
                    }
                    ;
                    break;

                case 5:
                    if (respuestanivel4 == 2) {
                    	System.out.println("Vamos al nivel 2");
                        premio += 800000;
                        System.out.println(" Premio acumulado: " + premio);
                        System.out.println("¿Desea continuar?");
                        System.out.println("Si - escribe s");
                        System.out.println("No - escribe n");
                        irNivel5 = Teclado.next();
                        
                        if (irNivel5.equals("s"))
                        {
                            aleatorio.PreguntasNivel5();
                            System.out.println("Elija una opcion");
                            respuestanivel5 = Teclado.nextInt();
                        }
                        ;
                        if (irNivel5.equals("n"))
                        	{
                        		System.out.println("Se ganó: " + premio);
                        	}
                    }
                    if (respuestanivel4 != 2) 
                    {
                    	System.out.println("Perdio...");
                    }
                    ;
                    break;

            }
        }
        if(irNivel5.equals("s"))
        {
            switch (aleatorio.numero_Pregunta_Nivel5) {
                case 1:
                    if (respuestanivel5 == 2) {
                        System.out.println(" GANASTE");
                        premio += 9000000;
                        System.out.println(" Premio total es de: " + premio);
                    }
                    if (respuestanivel5 != 2)
                    	{
                    		System.out.println("Perdio...");
                    	}
                    break;

                case 2:
                    if (respuestanivel5 == 2) {
                    	System.out.println(" GANASTE");
                        premio += 9000000;
                        System.out.println(" Premio total es de: " + premio);
                    }
                    if (respuestanivel5 != 2)
                    	{
                    		System.out.println("Perdio...");
                    	}
                    break;

                case 3:
                    if (respuestanivel5 == 2)
                    {
                    	System.out.println(" GANASTE");
                        premio += 9000000;
                        System.out.println(" Premio total es de: " + premio);
                    }
                    if (respuestanivel5 != 2)
                    	{
                    		System.out.println("Perdio...");
                    	}
                    break;

                case 4:
                    if (respuestanivel5 == 3) {
                    	System.out.println(" GANASTE");
                        premio += 9000000;
                        System.out.println(" Premio total es de: " + premio);
                    } 
                     if (respuestanivel5 != 3)
                     {
                    	 System.out.println("Perdio..."); 
                     }
                    	
                    break;

                case 5:
                    if (respuestanivel5 == 4) {
                    	System.out.println(" GANASTE");
                        premio += 9000000;
                        System.out.println(" Premio total es de: " + premio);
                    }
                    if (respuestanivel5 != 4)
                    {
                    	System.out.println("Perdio..."); 
                    }
                    break;

            }
        }

    }

}
