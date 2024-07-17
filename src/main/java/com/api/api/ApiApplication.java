package com.api.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiApplication.class, args);

		limpa_windows(); 

        Scanner scanner = new Scanner(System.in);
        String regiao = scanner.nextLine();
        
        Estado.listaEstadosRegião(regiao);



		/* Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma UF pelo número:");
        for (Estado estado : Estado.values()) {
            System.out.println(estado.getNumero() + " - " + estado.name());
        }

        int numero = scanner.nextInt();
        Estado estadoEscolhido = Estado.fromNumero(numero);

		if (estadoEscolhido != null) {
            if (estadoEscolhido.getNumero() <= 7) {
                System.out.println("Você escolheu: " + estadoEscolhido.getNome() + "\nRegião Norte.");
            } else if (estadoEscolhido.getNumero() >= 8 && estadoEscolhido.getNumero() <= 16) { // DE 8 A 16
                System.out.println("Você escolheu: " + estadoEscolhido.getNome() + "\nRegião Nordeste.");
            } else if (estadoEscolhido.getNumero() >= 17 && estadoEscolhido.getNumero() <= 20) {
                System.out.println("Você escolheu: " + estadoEscolhido.getNome() + "\nRegião Centro-Oeste.");
            } else if (estadoEscolhido.getNumero() >= 21 && estadoEscolhido.getNumero() <= 24) {
                System.out.println("Você escolheu: " + estadoEscolhido.getNome() + "\nRegião Sudeste.");
            } else if (estadoEscolhido.getNumero() >= 25 && estadoEscolhido.getNumero() <= 27) {
                System.out.println("Você escolheu: " + estadoEscolhido.getNome() + "\nRegião Sul.");
            }
        } else {
            System.out.println("UF inválida.");
        }

        scanner.close();

    } */
	
    }

	
		static void limpa_windows() {
			try {
				if (System.getProperty("os.name").contains("Windows")) {
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} else {
					System.out.println("Este comando só funciona no Windows.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}
    }
		

	
	


