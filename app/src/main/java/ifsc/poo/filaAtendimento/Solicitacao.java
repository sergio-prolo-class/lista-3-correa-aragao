package ifsc.poo.filaAtendimento;

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
