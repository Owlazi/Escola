package Aulas_POO.IntroducaoClasses.Escola;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String email;

    // Construtor
    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Sobrescrita do toString
    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", E-mail: " + email;
    }
}
