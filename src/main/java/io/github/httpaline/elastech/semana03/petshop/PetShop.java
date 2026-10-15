package io.github.httpaline.elastech.semana03.petshop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PetShop {
    static void main(String[] args) {
        int opcao = -1, qtdAnimais = 0;
        Pet[] animais = new Pet[5];

        Scanner sc = new Scanner(System.in);

        while (opcao != 0) {

            System.out.println("\n*** PETSHOP ***");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Buscar pelo nome");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();
            }catch (InputMismatchException ime){
                System.out.println("\nDigite apenas números!");
                sc.nextLine();
                continue;
            }

            switch (opcao){

                case 0:
                    System.out.println("\nAté logo!");
                    break;

                case 1:

                    if(qtdAnimais >= animais.length){
                        System.out.println("\nLimite de pets cadastrados atingido!");
                        break;
                    }

                    Pet animal = new Pet();
                    System.out.println("Digite o nome do seu pet: ");
                    animal.nome  = sc.nextLine();
                    System.out.println("Digite a espécie do seu pet: ");
                    animal.especie = sc.nextLine();
                    System.out.println("Digite o peso do seu pet: ");
                    animal.peso = sc.nextDouble();
                    animal.porte = animal.definirPorte();

                    animais[qtdAnimais]=animal;
                    qtdAnimais++;

                    System.out.println("\n*** FICHA DO PET ***");
                    System.out.println("Nome: " + animal.nome);
                    System.out.println("Espécie: " + animal.especie);
                    System.out.println("Peso: " + animal.peso + " kg");
                    System.out.println("Porte: " + animal.porte);
                    System.out.println("\nPet cadastrado! Agora são "+qtdAnimais+" Pet(s).");

                    break;

                case 2:
                    if(qtdAnimais==0){
                        System.out.println("Nenhum pet cadastrado.");
                        break;
                    }
                    System.out.println("\n***PETS CADASTRADOS***");
                    for(int i=0;i<qtdAnimais;i++){
                        System.out.println(animais[i].nome+" ("+animais[i].especie+") "+"- "+animais[i].peso+" kg - Porte "+animais[i].porte);
                    }

                    break;

                case 3:
                    System.out.println("Qual pet você procura?");
                    String busca = sc.nextLine();

                    boolean achou = false;
                    for(int i=0;i<qtdAnimais;i++){
                        if (animais[i].nome.equalsIgnoreCase(busca)){
                            System.out.println("\nEncontrado: "+animais[i].nome+" ("+animais[i].especie+") "+"- "+animais[i].peso+" kg - Porte "+animais[i].porte);
                            achou =true;
                        }
                    }

                    if(!achou){
                        System.out.println("\nNão encontrado.");
                    }

                    break;

                default:
                    System.out.println("Digite uma opção válida!");
            }




        }



    }
}
