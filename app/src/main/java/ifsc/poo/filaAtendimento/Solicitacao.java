package ifsc.poo.filaAtendimento;


// para fazer:
// Registrar os dados de um cliente quando é a sua primeira solicitação
//• Registrar novas solicitações vinculadas a um cliente.
//• Listar os telefones de todos os clientes já registrados.
//• Imprimir o nome do próximo cliente da fila.
//• Atender a próxima solicitação da fila, removendo-a.
//• Listar as idades dos clientes já atendidos.
//• Listar os telefones dos clientes ainda em espera

import java.util.HashSet;
import java.util.List;

public class Solicitacao {

    private String solicitacao;
    private Cliente cliente; // qual cliente fez a solicitacao

    public Solicitacao(String solicitacao, Cliente cliente) {
        this.solicitacao = solicitacao;
        this.cliente = cliente;
    }

    public String getSolicitacao() {
        return solicitacao;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
