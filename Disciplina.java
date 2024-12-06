package Aulas_POO.IntroducaoClasses.Escola;

import java.util.ArrayList;

public class Disciplina {
    private String codigo;
    private String nome;
    private int cargaHoraria;
    private int limiteAlunos;
    private ArrayList<Aluno> alunosMatriculados;

    // Construtor
    public Disciplina(String codigo, String nome, int cargaHoraria, int limiteAlunos) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.limiteAlunos = limiteAlunos;
        this.alunosMatriculados = new ArrayList<>();
    }

    // Métodos

    public boolean matricular(Aluno aluno) {
        if (alunosMatriculados.size() < limiteAlunos) {
            alunosMatriculados.add(aluno);
            return true;
        } else {
            System.out.println("Não há vagas para esta disciplina.");
            return false;
        }
    }

    public boolean desmatricular(String cpf) {
        for (Aluno aluno : alunosMatriculados) {
            if (aluno.getCpf().equals(cpf)) {
                alunosMatriculados.remove(aluno);
                return true;
            }
        }
        System.out.println("Aluno não matriculado nesta disciplina.");
        return false;
    }

    public String listarAlunos() {
        if (alunosMatriculados.isEmpty()) {
            return "Nenhum aluno matriculado.";
        }
        StringBuilder sb = new StringBuilder();
        for (Aluno aluno : alunosMatriculados) {
            sb.append(aluno.toString()).append("\n");
        }
        return sb.toString();
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
