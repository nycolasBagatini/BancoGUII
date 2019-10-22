package model;

public class Produto {
    public String nome;
    public Double preço;

    public Produto(String nome, Double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "model.Produto{" +
                "nome='" + nome + '\'' +
                ", preço=" + preço +
                '}';
    }
}
