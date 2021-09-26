package Reto_Sofka_Trainning;
import java.util.Scanner;

public class main {
	
	 public static void main(String[] args)
	    {
	        Scanner datoContinue = new Scanner(System.in);
	        int continuar = 9;
	        int numeroJugadores = 0;
	        int conocerPremios = 0;
	        Inicio_Juego juego = new Inicio_Juego();
	        do {
	        	juego.iniciarJuego();
	            System.out.println("Nuevo Jugador?");
	            System.out.println("Si: presiona la tecla 0");
	            System.out.println("No: presiona la tecla 9");
	            continuar = datoContinue.nextInt();
	            juego.Jugadores[numeroJugadores] = juego.nombreJugador;
	            juego.PremiosJugadores[numeroJugadores] = juego.premio;
	            juego.premio =0;
	            numeroJugadores += 1;
	        } while (continuar==0);

	        System.out.println("Desea conocer la lista de los participantes y sus premios?");
	        System.out.println("Si: presiones 0");
	        System.out.println("No: presiones 9");
	        conocerPremios = datoContinue.nextInt();

	        if(conocerPremios==0)
	        {
	            for(int i =0; i < numeroJugadores; i++)
	                System.out.println("Nombre: " +juego.Jugadores[i]+ " Premio: " +juego.PremiosJugadores[i] );

	        }

	    }
	

}
