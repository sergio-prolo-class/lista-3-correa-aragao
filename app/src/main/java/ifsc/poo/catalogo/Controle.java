package ifsc.poo.catalogo;

import java.util.Scanner;

public class Controle {

    private Catalogo catalogo;

    public Controle(Catalogo catalogo) {
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
                case 1:

                    System.out.println("Digite o título do filme");
            }

        } while (opcao != 0); // O loop continua enquanto a opção não for "0
    }
}
