package ifsc.poo.catalogo;

public class Filme {

    private int anoLancamento;
    private String nome;
    private String generoFilme;

    // construtor do filmes
    public Filme(int anoLancamento, String nome, String generoFilme) {
        this.anoLancamento = anoLancamento;
        this.nome = nome;
        this.generoFilme = generoFilme;
    }

    public String getNome() {
        return nome;
    }

    public String getGeneroFilme () { // ta pegando o valor do género
        return generoFilme;
    }

    public int getAnoLancamento() { // pega o valor de ano
        return anoLancamento;
    }

    // aqui ele vai imprimir certinho no terminar de um jeito que não fique visualmete confuso
    public String toString() {
        return nome + " (" + anoLancamento + ") - " + generoFilme;
    }
    
}
