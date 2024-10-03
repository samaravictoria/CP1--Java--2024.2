package br.com.fiap.blockbuster.model;
public class Filme {
    private int id;
    private String nome;
    private String diretor;
    private String anoLancamento;
    private String genero;
    private String sinopse;
    private int duracao;
    private String classificacao; // Classificação etária

    public Filme(int id, String nome, String diretor, String anoLancamento, String genero, String sinopse, int duracao, String classificacao) {
        this.id = id;
        this.nome = nome;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.classificacao = classificacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String exibirInformacoes() {
        return "ID: " + id + "\nNome: " + nome + "\nDiretor: " + diretor + "\nAno de Lançamento: " + anoLancamento +
                "\nGênero: " + genero + "\nSinopse: " + sinopse + "\nDuração: " + duracao + " minutos\nClassificação: " + classificacao;
    }
}
