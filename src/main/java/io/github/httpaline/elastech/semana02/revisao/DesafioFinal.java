package io.github.httpaline.elastech.semana02.revisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioFinal {

    static void exibirMenu() {
        System.out.println("        MEU CATÁLOGO        ");
        System.out.println("  ━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("  1 ▸ Cadastrar filme");
        System.out.println("  2 ▸ Listar filmes");
        System.out.println("  3 ▸ Buscar por título");
        System.out.println("  4 ▸ Estatísticas");
        System.out.println("  5 ▸ Sair");
        System.out.println("  ━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.print("    Escolha: ");
    }


    static String classificar(double nota){
        if(nota>=8){
             return "Ótimo";
        } else if (nota>=5) {
            return "Bom";
        }else{
            return "Ruim";
        }
    }


    static void main() {
        int opcao = 0, contador = 0;
        Scanner sc = new Scanner(System.in);
        Filme[] catalogo = new Filme[5];

        while (opcao != 5){
            exibirMenu();

            try {
                opcao = sc.nextInt();
                sc.nextLine(); //buffer
            }catch (InputMismatchException ime){
                System.out.println("O valor digitado deve ser um número inteiro de 1 a 5.");
                sc.nextLine();
                continue;
            }

            switch (opcao){
                case 1:
                    Filme filme = new Filme();

                    System.out.println("Insira o título do filme:");
                    filme.titulo = sc.nextLine();
                    System.out.println("Insira o gênero do filme:");
                    filme.genero = sc.nextLine().toUpperCase();
                    System.out.println("Insira uma nota para o filme:");
                    filme.nota = sc.nextDouble();

                    filme.classificacao = classificar(filme.nota);

                    if(contador != catalogo.length){
                        catalogo[contador]=filme;
                        contador+=1;
                        System.out.println("Filme cadastrado!");
                    }else{
                        System.out.println("Limite de "+catalogo.length+" filmes atingido!");
                    }

                    break;

                case 2:
                    if(contador != 0){
                        for(int i=0;i<contador;i++){
                            System.out.printf("%s[%s] - Nota %.1f - %s\n", catalogo[i].titulo, catalogo[i].genero, catalogo[i].nota, catalogo[i].classificacao);
                        }
                    }else{
                        System.out.println("Nenhum filme cadastrado.");
                    }

                    break;
                case 3:
                    System.out.println("Insira um título no buscador:");
                    String busca = sc.nextLine();
                    boolean encontrado = false;

                    for(int i=0;i<contador;i++){
                        if(busca.equalsIgnoreCase(catalogo[i].titulo)){
                            System.out.printf("Filme encontrado: %s\nGênero: %s\nNota: %.1f\nClassificação: %s\n",catalogo[i].titulo, catalogo[i].genero, catalogo[i].nota, catalogo[i].classificacao);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Título não encontrado.");
                    }
                    break;
                case 4:
                    System.out.printf("Quantidade de filmes: %d\n", contador);
                    double soma = 0.0;
                    for(int i=0;i<contador;i++){
                        soma+=catalogo[i].nota;
                    }
                    System.out.printf("A média das notas é: %.2f\n", soma/contador);

                    Filme maiorNota = catalogo[0];
                    for(int i=1; i<contador;i++){
                        if(catalogo[i].nota>maiorNota.nota){
                            maiorNota = catalogo[i];
                        }
                    }
                    System.out.println("O filme com a maior nota é: " + maiorNota.titulo);

                    int qtdOtimo = 0;
                    for(int i=0;i<contador;i++){
                        if(catalogo[i].classificacao.equals("Ótimo")){
                            qtdOtimo += 1;
                        }
                    }
                    System.out.println("Quantidade de filmes com classificação Ótima: " + qtdOtimo);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite um numero de 1 a 5.");
            }
        }
        sc.close();
    }
}
