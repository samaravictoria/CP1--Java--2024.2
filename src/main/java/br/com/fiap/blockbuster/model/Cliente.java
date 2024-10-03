package br.com.fiap.blockbuster.model;
public class Cliente extends Pessoa {
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private String email;

    public Cliente(int id, String nome, String cpf, String dataNascimento, String endereco, String email) {
        super(id, nome, cpf, nome);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String exibirInformacoes() {
        return "Cliente: " + getNome() + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNascimento + "\nEndereço: " + endereco + "\nEmail: " + email;
    }
}

