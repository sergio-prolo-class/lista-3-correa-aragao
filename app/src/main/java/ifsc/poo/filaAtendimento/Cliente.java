package ifsc.poo.filaAtendimento;

import java.util.List;

public class Cliente {

    private String nome;
    private int idade;
    private List<String> numTelefone;

    public Cliente(String nome, int idade, List<String> numTelefones) {
        this.nome = nome;
        this.idade = idade;
        this.numTelefone = numTelefones;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public List<String> getNumTelefone() {
        return numTelefone;
    }

    // colocando o telefone como identificador unico
    // public boolean telefoneUnico ();

    @Override
    public String toString() {
        return "Cliente { " + " nome = '" + nome + '\'' + ", idade = " + idade + ", numTelefone = " + numTelefone + '}';
    }
}
