package com.company;

public class Identificacao
{
    protected String nome;
    protected int idade;

    public Identificacao ()
    {
        this ("???", 0);
    }

    public Identificacao (String n, int i)
    {
        this.nome = n;
        this.idade = i;
    }

    public Identificacao (Identificacao id)
    {
        this.nome = id.getNome();
        this.idade = id.getIdade();
    }

    public String getNome ()        { return this.nome; }
    public int getIdade ()          { return this.idade; }
    public void setNome (String n)          { this.nome = n; }
    public void setIdade (int i)            { this.idade = i; }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        Identificacao id = (Identificacao) o;
        return (this.nome.equals(id.getNome()) &&
                this.idade == id.getIdade() );
    }
    public String toString () { return this.nome + " tem " + this.idade + " anos de idade";}
    public Identificacao clone () { return new Identificacao(this); }
}

