package ifsc.poo.filaAtendimento;

import java.util.Scanner;

public class Controle {

    private Atendimento atendimento;
    private Scanner console; // ler o que o usuario digitar

    public Controle {
        this.atendimento = new Atendimento();
        this.console = new Scanner(System.in);
    }

    // metodo para executar o menu
    public void executar() {
        int opcao = -1; // opcao para o usuario escolher

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");

            // veio como String e depois eu converto
            String clienteDigita = console.nextLine();

            opcao = Integer.parseInt(clienteDigita); // tranforma de string para int

            proximaOpcao(opcao);

        } while (opcao != 0);

        System.out.println("Sistema de Fila de Atendimento encerrado.");
        console.close();
    }
    }
}
