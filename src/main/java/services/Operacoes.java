package services;

import java.util.Scanner;

import static services.PostsServices.*;

public class Operacoes {
    public static void TelaInicial(){
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("                Bem-vindo ao controle de Empresas -  Resolve"                      );
        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("1. Cadastro de empresas");
        System.out.println("2. Listar empresas ");
        System.out.println("3. Sair");
        System.out.println("Escolha uma opção: ");

        Scanner input = new Scanner(System.in);
        int operacao = input.nextInt();

        switch (operacao){
            case 1:
                CriarPost();
                break;

            case 3:
                System.exit(0);

            case 2:
                ListarPosts();
                break;

            default:
                System.out.println("Opção inválida.");
                TelaInicial();
                break;
        }

    }
}
