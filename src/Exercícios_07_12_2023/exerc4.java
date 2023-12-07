package Exercícios_07_12_2023;

import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String c1, c2, c3;
		
		System.out.println("\nSeu animal é vertebrado ou invertebrado?");
		c1 = leia.next();
		 if (c1.equalsIgnoreCase("vertebrado")) {
			 System.out.println("\nSeu animal é ave ou mamífero?");
			 c2 = leia.next();
			 if(c2.equalsIgnoreCase("ave")) {
				 System.out.println("\nSeu animal é carnívoro ou onívoro?");
				 c3 = leia.next();
				 if(c3.equalsIgnoreCase("carnívoro")) {
					 System.out.println("\nSeu animal é uma Águia"); }
					 if(c3.equalsIgnoreCase("onívoro")) {
						 System.out.println("\nSeu animal é uma Pomba");
					 }
				 }
				 if (c2.equalsIgnoreCase("mamífero")) {
					 System.out.println("\nSeu animal é herbívoro ou onívoro?");
					 c3 = leia.next();
					 if(c3.equalsIgnoreCase("herbívoro")) {
						 System.out.println("\nSeu animal é uma Vaca"); } 
					 if(c3.equalsIgnoreCase("onívoro")) {
						 System.out.println("\nSeu animal é um Homem");
					 } 
				 }
			 }
		 
		 if (c1.equalsIgnoreCase("invertebrado")) {
			 System.out.println("\nSeu animal é inseto ou anelídeo?");
			 c2 = leia.next();
			 if(c2.equalsIgnoreCase("inseto")) {
				 System.out.println("\nSeu animal é hematófago ou herbívoro?");
				 c3 = leia.next();
				 if(c3.equalsIgnoreCase("hematófago")) {
					 System.out.println("\nSeu animal é uma Pulga"); }
					 if(c3.equalsIgnoreCase("herbívoro")) {
						 System.out.println("\nSeu animal é uma Lagarta");
					 }
				 }
				 if (c2.equalsIgnoreCase("anelídeo")) {
					 System.out.println("\nSeu animal é hematófago ou onívoro?");
					 c3 = leia.next();
					 if(c3.equalsIgnoreCase("hematófago")) {
						 System.out.println("\nSeu animal é uma Sanguessuga"); } 
					 if(c3.equalsIgnoreCase("onívoro")) {
						 System.out.println("\nSeu animal é uma Minhoca");
					 } 
				 }
			 }
			 
		 }
	}

