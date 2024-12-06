package Aulas_POO.IntroducaoClasses.Escola;

public class Aluno extends Pessoa {
    private int anoNascimento;

    public Aluno(String nome, String cpf, String email, int anoNascimento) {
        super(nome, cpf, email);
        this.anoNascimento = anoNascimento;
    }

    // Getter e Setter
    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ano de Nascimento: " + anoNascimento;
    }
}
