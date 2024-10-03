package br.com.fiap.blockbuster.model;
public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;
    private String dataAdmissao;

    public Funcionario(int id, String nome, String cpf, String endereco, String cargo, double salario, String dataAdmissao) {
        super(id, nome, cpf, endereco);
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String exibirInformacoes() {
        return super.exibirInformacoes() + "\nCargo: " + cargo + "\nSalário: " + salario + "\nData de Admissão: " + dataAdmissao;
    }
}
