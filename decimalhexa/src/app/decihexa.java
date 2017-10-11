package app;

import java.util.Scanner;

public class decihexa 
{
	static Scanner leer= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Introduzca Numero Para Convertirlo: ");
		int dato = leer.nextInt();
		System.out.println("Convertirlo En Cual Quier Base: ");
		int base = leer.nextInt();
		System.out.println(decihexa(dato,base));
		
	}
	
	public static String decihexa(int dato, int base)
	{
		int fin = dato/base;
		String hexacada = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Soporta 37 Bases
		char[] hexacara = hexacada.toCharArray();
		dato = dato % base;
		if(fin<=0) 
		{
			return ""+hexacara[dato];
		}
		else
		{
			return decihexa(fin,base)+hexacara[dato] ;
		}
	}
}


