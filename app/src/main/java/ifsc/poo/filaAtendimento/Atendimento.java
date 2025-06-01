package ifsc.poo.filaAtendimento;

// ordem de chegada das solicitações
// Listar as idades dos clientes já atendidos.
// Precisa de uma forma de rastrear os clientes que já passaram pela fila
// e foram atendidos.

import java.util.*;

public class Atendimento {

    private Set<Cliente> clienteRegistrados;
    private Queue<String> filaClientes;
    private List<Cliente> atendidosClientes;

    public Atendimento(Set<Cliente> clienteRegistrados, Queue<String> filaClientes, List<Cliente> atendidosClientes) {
        this.clienteRegistrados = new HashSet<>();
        this.filaClientes = filaClientes;
        this.atendidosClientes = atendidosClientes;
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

    // passo 2: Registrar novas solicitações vindas de um cliente
    public void adicionarSolicitacao(Cliente cliente, String descricao) {

    }

    // passo 3:
    public void listarTelefones() {
        // esse é dos clientes já registrados.
    }

}
