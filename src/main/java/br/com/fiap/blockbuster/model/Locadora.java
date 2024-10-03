package br.com.fiap.blockbuster.model;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Locadora {
    private int id;
    private String nome;
    private String endereco;
    private int telefone;

    private List<Filme> filmes;
    private List<Cliente> clientes;

    public Locadora(int id, String nome, String endereco, int telefone) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.filmes = new ArrayList<>();
        this.clientes = new ArrayList<>();
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    // Adicionar ou Remover ou Buscar Filmes:
    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void removerFilme(Filme filme) {
        filmes.remove(filme);
    }

    public Filme buscarFilmePorNome(String nome) {
        for (Filme filme : filmes) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        return null;
    }

    // Classificação de filmes por gênero
    public List<Filme> classificarFilmesPorGenero(String genero) {
        return filmes.stream()
                .filter(filme -> filme.getGenero().equalsIgnoreCase(genero))
                .collect(Collectors.toList());
    }

    // Classificação de filmes por diretor
    public List<Filme> classificarFilmesPorDiretor(String diretor) {
        return filmes.stream()
                .filter(filme -> filme.getDiretor().equalsIgnoreCase(diretor))
                .collect(Collectors.toList());
    }

    // Adicionar ou Remover ou Buscar Cliente:
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public Cliente buscarClientePorNome(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;
    }

    public String exibirInformacoes() {
        return "ID: " + id + "\nNome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone;
    }
}
