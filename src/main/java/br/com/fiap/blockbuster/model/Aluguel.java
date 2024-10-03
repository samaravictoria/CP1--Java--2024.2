package br.com.fiap.blockbuster.model;
import java.time.LocalDate;

public class Aluguel {
    private int id; // ID do aluguel
    private Cliente cliente; // Cliente que realizou o aluguel
    private Filme filme; // Filme alugado
    private LocalDate dataAluguel; // Data do aluguel
    private LocalDate dataDevolucao; // Data de devolução

    public Aluguel(int id, Cliente cliente, Filme filme, LocalDate dataAluguel, LocalDate dataDevolucao) {
        this.id = id;
        this.cliente = cliente;
        this.filme = filme;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String exibirInformacoes() {
        return "ID do Aluguel: " + id +
                "\nCliente: " + cliente.getNome() +
                "\nFilme: " + filme.getNome() +
                "\nData do Aluguel: " + dataAluguel +
                "\nData de Devolução: " + dataDevolucao;
    }
}
