package io.github.httpaline.elastech.semana02.revisao;

import java.util.Locale;
import java.util.Scanner;

public class desafioFinal {

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


    static void main() {
        int opcao = 0, contador = 0;
        Scanner sc = new Scanner(System.in);
        Filme[] catalogo = new Filme[50];

        while (opcao != 6){
            exibirMenu();
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    Filme filme = new Filme();

                    System.out.println("Insira o título do filme:");
                    filme.titulo = sc.nextLine();
                    System.out.println("Insira o gênero do filme:");
                    filme.genero = sc.nextLine();
                    filme.genero.toUpperCase();
                    System.out.println("Insira uma nota para o filme:");
                    filme.nota = sc.nextInt();

                    if(filme.nota>=8){
                        filme.classificacao = "ótimo";
                    } else if (filme.nota>=5 && filme.nota<=7.9) {
                        filme.classificacao = "Bom";
                    }else{
                        filme.classificacao = "Ruim";
                    }
                    catalogo[contador]=filme;
                    contador+=1;

                    break;

                case 2:
                    if(contador == 0){
                        System.out.println("Nenhum filme cadastrado.");
                    }
                    for(int i=0;i<contador;i++){
                        System.out.printf("%s[%s] - Nota %.1f - %s\n", catalogo[i].titulo, catalogo[i].genero, catalogo[i].nota, catalogo[i].classificacao);
                    }
                    break;
                case 3:
                    System.out.println("Insira um título no buscador:");
                    String busca = sc.nextLine();
                    boolean encontrado = false;

                    for(int i=0;i<contador;i++){
                        if(busca.equalsIgnoreCase(catalogo[i].titulo)){
                            System.out.println(catalogo[i].titulo);
                            encontrado = true;
                            break;
                        }
                        if (!encontrado) {
                            System.out.println("Título não encontrado.");
                        }
                    }
                    break;
                case 4:
                    System.out.printf("Quantidade de filmes: %d", contador);
                    double soma = 0.0;
                    for(int i=0;i<contador;i++){
                        soma+=catalogo[i].nota;
                    }
                    System.out.printf("A média das notas é: %.2f", soma/contador);

            }
        }
    }
}
