package Reto_Sofka_Trainning;
import java.util.Scanner;

public class main {
	
	 public static void main(String[] args)
	    {
	        Scanner Seguir = new Scanner(System.in);
	        String continuar = "";
	        int cantidadJugadores = 0;
	        String verPremios = "";
	        Inicio_Juego juego = new Inicio_Juego();
	        do {
	        	juego.iniciarJuego();
	            System.out.println("Nuevo Jugador?");
	            System.out.println("Si: presiona la tecla s");
	            System.out.println("No: presiona la tecla n");
	            continuar = Seguir.next();
	            juego.Jugadores[cantidadJugadores] = juego.nombreJugador;
	            juego.PremiosJugadores[cantidadJugadores] = juego.premio;
	            juego.premio =0;
	            cantidadJugadores += 1;
	        } while (continuar.equals("s"));

	        System.out.println("Ver la lista de los participantes y sus premios");
	        System.out.println("Si: ingrese la tecla s");
	        System.out.println("No: ingrese la tecla n");
	        verPremios = Seguir.next();

	        if(verPremios.equals("s"))
	        {
	            for(int i =0; i < cantidadJugadores; i++)
	                System.out.println("Nombre: " +juego.Jugadores[i]+ " Premio: " +juego.PremiosJugadores[i] );

	        }

	    }
	

}
