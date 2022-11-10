/**
*
*	Ejercicio 5, Horario de Clase con colores.
* 
* 	Nombre del archivo: Ejercicio5.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio5{
	public static void main(String[] args){
		
		String verde =  	"\033[92m";
		String verdeClaro = "\033[32m";
		String rojo = 		"\033[91m";
		String amarillo = 	"\033[33m";
		String azul = 		"\033[94m";
		String morado = 	"\033[95m";
		String cian = 		"\033[96m";
		String blanco = 	"\033[37m";
		String ANSI_RESET = "\u001B[0m";
		
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n","Horario", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
		System.out.printf("%-10s %-19s %-19s %-19s %-19s %-19s\n","15:15", verde+"S.I."+ANSI_RESET, azul+"Prog."+ANSI_RESET, verde+"S.I."+ANSI_RESET, azul+"Prog."+ANSI_RESET, azul+"Prog."+blanco);
		System.out.printf("%-10s %-19s %-19s %-19s %-19s %-19s\n","16:15", azul+"Prog."+ANSI_RESET, azul+"Prog."+ANSI_RESET, amarillo+"FOl"+ANSI_RESET, azul+"Prog."+ANSI_RESET, azul+"Prog."+blanco);
		System.out.printf("%-10s %-19s %-19s %-19s %-19s %-19s\n","17:15", azul+"Prog."+ANSI_RESET, cian+"L.M."+ANSI_RESET, amarillo+"FOL"+ANSI_RESET, rojo+"B.D."+ANSI_RESET, rojo+"B.D."+blanco);
		System.out.printf("%-10s %-19s %-19s %-14s %-19s %-19s\n","18:30", amarillo+"FOL"+ANSI_RESET, cian+"L.M."+ANSI_RESET, "E.D."+ANSI_RESET, rojo+"B.D."+ANSI_RESET, rojo+"B.D."+blanco);
		System.out.printf("%-10s %-19s %-19s %-14s %-19s %-19s\n","19:30", rojo+"B.D."+ANSI_RESET, verde+"S.I."+ANSI_RESET, "E.D."+ANSI_RESET, verde+"S.I."+ANSI_RESET, cian+"L.M."+blanco);
		System.out.printf("%-10s %-19s %-19s %-14s %-19s %-19s\n","20:30", rojo+"B.D."+ANSI_RESET, verde+"S.I."+ANSI_RESET, "E.D."+ANSI_RESET, verde+"S.I."+ANSI_RESET, cian+"L.M."+blanco);
	}
}
