package io.github.httpaline.elastech.semana03.petshop;
import java.util.InputMismatchException;

public class PetShopMenu {
    private static final int LIMITE_PETS = 5;
    private final Pet[] animais = new Pet[LIMITE_PETS];
    private int qtdAnimais = 0;
    private final Entrada entrada = new Entrada();


    public void iniciar() {
        int opcao = -1;
        while (opcao != 0) {

            System.out.println("\n*** PETSHOP ***");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Buscar pelo nome");
            System.out.println("0 - Sair");
            opcao = entrada.lerInteiro("Escolha: ");


            switch (opcao){
                case 0:
                    System.out.println("\nAté logo!");
                    break;
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    buscar();
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }

        entrada.fechar();

    }


    private String resumo(Pet pet) {
        return pet.getNome() + " (" + pet.getEspecie() + ") " + "- " + pet.getPeso() + " kg - Porte " + pet.getPorte();
    }

    private void cadastrar() {
        if(qtdAnimais >= animais.length){
            System.out.println("\nLimite de pets cadastrados atingido!");
            return;
        }

        String nome = entrada.lerTexto("Digite o nome do seu pet: ");
        String especie = entrada.lerTexto("Digite a espécie do seu pet: ");
        double peso = entrada.lerDecimal("Digite o peso do seu pet: ");

        Pet animal = new Pet(nome, especie, peso);

        animais[qtdAnimais]=animal;
        qtdAnimais++;

        System.out.println("\n*** FICHA DO PET ***");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Peso: " + animal.getPeso() + " kg");
        System.out.println("Porte: " + animal.getPorte());
        System.out.println("\nPet cadastrado! Agora são "+qtdAnimais+" Pet(s).");

    }

    private void listar() {
        if(qtdAnimais==0){
            System.out.println("Nenhum pet cadastrado.");
            return;
        }
        System.out.println("\n***PETS CADASTRADOS***");
        for(int i=0;i<qtdAnimais;i++){
            System.out.println(resumo(animais[i]));
        }
    }

    private void buscar() {
        String busca = entrada.lerTexto("Qual pet você procura?");

        boolean achou = false;
        for(int i=0;i<qtdAnimais;i++){
            if (animais[i].getNome().equalsIgnoreCase(busca)){
                System.out.println("\nEncontrado: "+resumo(animais[i]));
                achou =true;
            }
        }

        if(!achou){
            System.out.println("\nNão encontrado.");
        }

    }
}










