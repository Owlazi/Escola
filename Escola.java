package Aulas_POO.IntroducaoClasses.Escola;

import java.util.ArrayList;

public class Escola {
    private String nome;
    private String telefone;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;

    public Escola() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
        disciplinas = new ArrayList<>();
    }

    // Métodos para adicionar Aluno e Professor
    public boolean adicionarAluno(Aluno aluno) {
        for (Aluno a : alunos) {
            if (a.getCpf().equals(aluno.getCpf())) {
                System.out.println("Esse aluno já está cadastrado.");
                return false;
            }
        }
        alunos.add(aluno);
        return true;
    }

    public boolean adicionarProfessor(Professor professor) {
        for (Professor p : professores) {
            if (p.getCpf().equals(professor.getCpf())) {
                System.out.println("Esse professor já está cadastrado.");
                return false;
            }
        }
        professores.add(professor);
        return true;
    }

    // Métodos para buscar por CPF
    public Aluno buscarAlunoCpf(String cpf) {
        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpf)) {
                return aluno;
            }
        }
        return null;
    }

    public Professor buscarProfessorCpf(String cpf) {
        for (Professor professor : professores) {
            if (professor.getCpf().equals(cpf)) {
                return professor;
            }
        }
        return null;
    }

    // Listar todas as pessoas (alunos e professores)
    public String listarPessoas() {
        StringBuilder sb = new StringBuilder();
        for (Aluno aluno : alunos) {
            sb.append("Aluno: ").append(aluno.toString()).append("\n");
        }
        for (Professor professor : professores) {
            sb.append("Professor: ").append(professor.toString()).append("\n");
        }
        return sb.toString().isEmpty() ? "Não há pessoas cadastradas." : sb.toString();
    }

    // Adicionar métodos para retornar a quantidade de alunos e professores
    public int getQuantidadeAlunos() {
        return alunos.size();
}

public int getQuantidadeProfessores() {
    return professores.size();
}


    // Métodos de Disciplinas (Adição e Busca)
    public boolean adicionarDisciplina(Disciplina disciplina) {
        for (Disciplina d : disciplinas) {
            if (d.getCodigo().equals(disciplina.getCodigo())) {
                System.out.println("Já existe uma disciplina com esse código.");
                return false;
            }
        }
        disciplinas.add(disciplina);
        return true;
    }

    public Disciplina buscarDisciplina(String codigo) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getCodigo().equals(codigo)) {
                return disciplina;
            }
        }
        return null;
    }

    // Matrícula e Desmatrícula
    public boolean matricular(String cpfAluno, String codigoDisciplina) {
        Aluno aluno = buscarAlunoCpf(cpfAluno); // Busca apenas alunos
        Disciplina disciplina = buscarDisciplina(codigoDisciplina);
        if (aluno != null && disciplina != null) {
            return disciplina.matricular(aluno);
        }
        System.out.println("Aluno ou disciplina não encontrados.");
        return false;
    }

    public boolean desmatricular(String cpfAluno, String codigoDisciplina) {
        Disciplina disciplina = buscarDisciplina(codigoDisciplina);
        if (disciplina != null) {
            return disciplina.desmatricular(cpfAluno);
        }
        return false;
    }

    // Listar todas as disciplinas
    public String listarDisciplinas() {
        StringBuilder sb = new StringBuilder();
        for (Disciplina disciplina : disciplinas) {
            sb.append(disciplina.toString()).append("\n");
        }
        return sb.toString().isEmpty() ? "Não há disciplinas cadastradas." : sb.toString();
    }
}
