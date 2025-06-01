package ifsc.poo.filaAtendimento;

// ordem de chegada das solicitações
// Listar as idades dos clientes já atendidos.
// Precisa de uma forma de rastrear os clientes que já passaram pela fila
// e foram atendidos.

import java.util.*;

public class Atendimento {

    private Set<Cliente> clienteRegistrados;
    private Queue<Solicitacao> filaClientes;
    private List<Cliente> atendidosClientes;

    public Atendimento(List<Cliente> atendidosClientes, Queue<Solicitacao> filaClientes, Set<Cliente> clienteRegistrados) {
        this.atendidosClientes = new LinkedList<>();
        this.filaClientes = new LinkedList<>();
        this.clienteRegistrados = new HashSet<>(); // para iniciar logo como um novo HashSet e coleção vazia
    }

    // passo 1: eu preciso registrar os dados dos clientes - 1 solicitação
    public void registrarClientes (String nome, int idade, List<String> telefones) {
        Cliente clientesNovos = new Cliente(nome, idade, telefones);

        boolean adicionarCliente = clienteRegistrados.add(clientesNovos);

        // aqui eu coloco para ver se o cliente foi registrado.
        if (adicionarCliente) {
            System.out.println(nome + " foi adicionado com sucesso");
        } else {
            System.out.println(nome + " já foi registrado");
        }
    }

    // slides
//    public boolean equals(Object o) {
//        if(!(o instanceof Pessoa other)) return false;
//        return this.nome.equals(p.nome) && this.idade
//                == other.idade;
//    }
//    public int hashCode() {
//        return nome.hashCode() + idade.hashCode();
//    }

    // passo 2: Registrar novas solicitações vindas de um cliente
    public void adicionarSolicitacao(Cliente cliente, String descricao) {
        Solicitacao solicitacaoNova = new Solicitacao(descricao, cliente);

        boolean adicionarSolicitacao = solicitacaoNova.add();
    }

    // passo 3:
    public void listarTelefones() {
        // esse é dos clientes já registrados.
    }

}
