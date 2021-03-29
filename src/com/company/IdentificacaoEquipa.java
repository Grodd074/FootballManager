package com.company;

public class IdentificacaoEquipa extends Identificacao
{
    String cidade;

    public String getCidade () { return this.cidade; }
    public void setCidade (String cd)  { this.cidade = cd; }

    public IdentificacaoEquipa(String cidade) {
        this.cidade = cidade;
    }

    public IdentificacaoEquipa(String n, int i, String cidade) {
        super(n, i);
        this.cidade = cidade;
    }

    public IdentificacaoEquipa(Identificacao id, String cidade) {
        super(id);
        this.cidade = cidade;
    }

    public String toString() {
        return "IdentificacaoEquipa { " +
                "nome= '" + getNome() + "' " +
                "idade= '" + getIdade() + "' " +
                "cidade= '" + getCidade() + "' }";
    }
}
