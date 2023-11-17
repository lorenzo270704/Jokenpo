/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo_jokenpo;

import java.util.Scanner;
//hbjbhjv

public class Jogo_Jokenpo {

   
    public static void main(String[] args) {
        
       
		
		Scanner sc = new Scanner(System.in);
		int v1,v2;
		
		System.out.println("Escolha entre 0, 1 e 2 , sendo : ");
		System.out.println("Pedra = 0 ");
		System.out.println("Papel = 1  ");
		System.out.println("Tesoura = 2");
		
		System.out.println("Jogador 1: ");
		v1 = sc.nextInt();
		
		System.out.println("Jogador 2: ");
		v2 = sc.nextInt();
		
		switch (v1){
			case 0: 
				switch (v2){
					case 0:
						System.out.println("Empate");
						break;
					case 1:
						System.out.println("Jogador 2 ganhou");
						break;
					case 2:
						System.out.println("Jogador 1 ganhou");
						break;
						default: 
							System.out.println ("USUARIO BURRO DO CARALHO");
				} break;
			case 1:
				switch(v2) {
					case 0: 
						System.out.println("Jogador 1 ganhou");
						break;
					case 1:
						System.out.println(" Empatou");
						break;
					case 2:
						System.out.println("Jogador 2 ganhou");
						break;
					default: 
						System.out.println ("USUARIO BURRO DO CARALHO");
				} break;
			case 2:
				switch(v2) {
						case 0:
							System.out.println("Jogador 2 ganhou");
							break;
						case 1:
							System.out.println("Jogador 1 ganhou");
							break;
						case 2:
							System.out.println("Empate");
							break;
						default: 
				            System.out.println ("USUARIO BURRO DO CARALHO");
				} break;
			default: 
				System.out.println ("USUARIO BURRO DO CARALHO");
		}
	}
}

    

