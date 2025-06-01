package ifsc.poo.filaAtendimento;

import java.util.List;

public class Cliente {

    private String nome;
    private int idade;
    private String numTelefones;

    public Cliente(String nome, int idade, String numTelefone) {
        this.nome = nome;
        this.idade = idade;
        this.numTelefones = numTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNumTelefone() {
        return numTelefones;
    }

    @Override
    public String toString() {
        return "Cliente { " + " nome = '" + nome + '\'' + ", idade = " + idade + ", numTelefone = " + numTelefones + '}';
    }
}
