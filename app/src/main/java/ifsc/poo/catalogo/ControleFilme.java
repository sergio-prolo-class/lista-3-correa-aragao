package ifsc.poo.catalogo;

import java.util.Scanner;

public class ControleFilme {

    private Catalogo catalogo;

    public ControleFilme(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // menu de filmes
            System.out.println("Menu do catalogo de filmes: ");
            System.out.println("1 - Adicionar Filme");
            System.out.println("2 - Remover Filmes");
            System.out.println("3 - Listar Filmes");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: // adicionar filme

                    System.out.println("Digite o título do filme");
                    String filmeN = scanner.nextLine();

                    System.out.println("Ano de lançamento: ");
                    int anoLancamento = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Genero do filme: ");
                    String generoFilme = scanner.nextLine();

                    Filme filmeNovo = new Filme(anoLancamento, filmeN, generoFilme);
                    catalogo.adicionarFilmes(filmeNovo);
                    System.out.println("O filme foi adicionado!");
                    break;
                case 2: // para remover o filme

                    System.out.println("Titulo do filme para ser removido: ");
                    String removerNome = scanner.nextLine();
                    catalogo.removerFilmes(removerNome);
                    System.out.println("Filme removido!");
                    break;
                case 3: // listar filmes

                    System.out.println("Filmes que existem no catalogo");
                    catalogo.listarFilmes();
                    break;
                case 4:
                    System.out.println("Saida do menu.");
                default:
                    System.out.println("Opção inválida, tente de novo");
            }

        } while (opcao != 0); // O loop continua enquanto a opção não for "0

        scanner.close();
    }
}
