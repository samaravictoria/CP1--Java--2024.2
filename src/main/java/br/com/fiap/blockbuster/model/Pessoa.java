package br.com.fiap.blockbuster.model;

    public abstract class Pessoa {
        private int id;
        private String nome;

        public Pessoa(int id, String s, String cpf, String nome) {
            this.id = id;
            this.nome = nome;
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

        public String exibirInformacoes() {
            return null;
        }
    }
