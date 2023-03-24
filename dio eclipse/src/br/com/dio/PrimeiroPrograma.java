package br.com.dio;

import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		
		System.out.println("Hello World " + (a+b));
		
		Gato gato1 = new Gato(null, null, a);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o nome do gato: ");
		gato1.setNome(sc.nextLine());
		
		System.out.println("Insira a cor do gato: ");
		gato1.setCor(sc.nextLine());
		
		System.out.println("Insira a idade do gato: ");
		gato1.setIdade(sc.nextInt());
		
		System.out.println(gato1.toString());
	}

}
