package Aulas_POO.IntroducaoClasses.Escola;

import java.util.Scanner;

public class AppEscola {
    public static void main(String[] args) {
        Escola escola = new Escola();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma das opções abaixo:\n");
            System.out.println("1. Aluno");
            System.out.println("2. Professor");
            System.out.println("3. Disciplinas");
            System.out.println("4. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    // Menu de Aluno
                    while (true) {
                        System.out.println("\nEscolha uma ação de Aluno:");
                        System.out.println("1. Adicionar Aluno");
                        System.out.println("2. Buscar Aluno por CPF");
                        System.out.println("3. Listar Alunos");
                        System.out.println("4. Matricular Aluno em Disciplina");
                        System.out.println("5. Desmatricular Aluno de Disciplina");
                        System.out.println("6. Voltar");
                        int alunoOpcao = scanner.nextInt();
                        scanner.nextLine();

                        switch (alunoOpcao) {
                            case 1:
                                System.out.println("Digite o nome do aluno: ");
                                String nomeAluno = scanner.nextLine();
                                System.out.println("Digite o CPF do aluno: ");
                                String cpfAluno = scanner.nextLine();
                                System.out.println("Digite o e-mail do aluno: ");
                                String emailAluno = scanner.nextLine();
                                System.out.println("Digite o ano de nascimento do aluno: ");
                                int anoNascimento = scanner.nextInt();
                                scanner.nextLine();

                                Aluno novoAluno = new Aluno(nomeAluno, cpfAluno, emailAluno, anoNascimento);
                                if (escola.adicionarAluno(novoAluno)) {
                                    System.out.println("Aluno adicionado com sucesso.");
                                } else {
                                    System.out.println("Falha ao adicionar aluno.");
                                }
                                break;
                            case 2:
                                System.out.println("Digite o CPF do aluno: ");
                                String cpfBuscaAluno = scanner.nextLine();
                                Pessoa alunoEncontrado = escola.buscarAlunoCpf(cpfBuscaAluno);
                                if (alunoEncontrado != null && alunoEncontrado instanceof Aluno) {
                                    System.out.println("Aluno encontrado: " + alunoEncontrado);
                                } else {
                                    System.out.println("Aluno não encontrado.");
                                }
                                break;
                                case 3:
                                System.out.println("\nLista de Alunos:");
                                System.out.println("Total de alunos: " + escola.getQuantidadeAlunos());
                                System.out.println(escola.listarPessoas());
                                break;
                            
                            case 4:
                                System.out.println("Digite o CPF do aluno: ");
                                String cpfMatricula = scanner.nextLine();
                                System.out.println("Digite o código da disciplina: ");
                                String codigoDisciplinaMatricula = scanner.nextLine();

                                if (escola.matricular(codigoDisciplinaMatricula, cpfMatricula)) {
                                    System.out.println("Aluno matriculado com sucesso.");
                                } else {
                                    System.out.println("Falha ao matricular aluno.");
                                }
                                break;
                            case 5:
                                System.out.println("Digite o CPF do aluno: ");
                                String cpfDesmatricula = scanner.nextLine();
                                System.out.println("Digite o código da disciplina: ");
                                String codigoDisciplinaDesmatricula = scanner.nextLine();

                                if (escola.desmatricular(codigoDisciplinaDesmatricula, cpfDesmatricula)) {
                                    System.out.println("Aluno desmatriculado com sucesso.");
                                } else {
                                    System.out.println("Falha ao desmatricular aluno.");
                                }
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }

                        if (alunoOpcao == 6) break;
                    }
                    break;

                case 2:
                    // Menu de Professor
                    while (true) {
                        System.out.println("\nEscolha uma ação de Professor:");
                        System.out.println("1. Adicionar Professor");
                        System.out.println("2. Buscar Professor por CPF");
                        System.out.println("3. Listar Professores");
                        System.out.println("4. Voltar");
                        int professorOpcao = scanner.nextInt();
                        scanner.nextLine();

                        switch (professorOpcao) {
                            case 1:
                                System.out.println("Digite o nome do professor: ");
                                String nomeProfessor = scanner.nextLine();
                                System.out.println("Digite o CPF do professor: ");
                                String cpfProfessor = scanner.nextLine();
                                System.out.println("Digite o e-mail do professor: ");
                                String emailProfessor = scanner.nextLine();
                                System.out.println("Digite o salário do professor: ");
                                double salario = scanner.nextDouble();
                                System.out.println("Digite a carga horária do professor: ");
                                int cargaHoraria = scanner.nextInt();
                                scanner.nextLine();

                                Professor novoProfessor = new Professor(nomeProfessor, cpfProfessor, emailProfessor, salario, cargaHoraria);
                                if (escola.adicionarProfessor(novoProfessor)) {
                                    System.out.println("Professor adicionado com sucesso.");
                                } else {
                                    System.out.println("Falha ao adicionar professor.");
                                }
                                break;
                            case 2:
                                System.out.println("Digite o CPF do professor: ");
                                String cpfBuscaProfessor = scanner.nextLine();
                                Pessoa professorEncontrado = escola.buscarProfessorCpf(cpfBuscaProfessor);
                                if (professorEncontrado != null && professorEncontrado instanceof Professor) {
                                    System.out.println("Professor encontrado: " + professorEncontrado);
                                } else {
                                    System.out.println("Professor não encontrado.");
                                }
                                break;
                                case 3:
                                System.out.println("\nLista de Professores:");
                                System.out.println("Total de professores: " + escola.getQuantidadeProfessores());
                                System.out.println(escola.listarPessoas());
                                break;
                            
                            case 4:
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }

                        if (professorOpcao == 4) break;
                    }
                    break;

                case 3:
                    // Menu de Disciplinas
                    while (true) {
                        System.out.println("\nEscolha uma ação de Disciplina:");
                        System.out.println("1. Adicionar Disciplina");
                        System.out.println("2. Listar Disciplinas");
                        System.out.println("3. Buscar Disciplina");
                        System.out.println("4. Listar Alunos Matriculados");
                        System.out.println("5. Voltar");
                        int disciplinaOpcao = scanner.nextInt();
                        scanner.nextLine();

                        switch (disciplinaOpcao) {
                            case 1:
                                System.out.println("Digite o código da disciplina: ");
                                String codigoDisciplina = scanner.nextLine();
                                System.out.println("Digite o nome da disciplina: ");
                                String nomeDisciplina = scanner.nextLine();
                                System.out.println("Digite a carga horária da disciplina: ");
                                int cargaHoraria = scanner.nextInt();
                                scanner.nextLine();

                                Disciplina novaDisciplina = new Disciplina(codigoDisciplina, nomeDisciplina, cargaHoraria, 30); // limite de 30 alunos
                                if (escola.adicionarDisciplina(novaDisciplina)) {
                                    System.out.println("Disciplina adicionada com sucesso.");
                                } else {
                                    System.out.println("Falha ao adicionar disciplina.");
                                }
                                break;
                            case 2:
                                System.out.println("\nLista de Disciplinas:");
                                System.out.println(escola.listarDisciplinas());
                                break;
                            case 3:
                                System.out.println("Digite o código da disciplina: ");
                                String codigoBusca = scanner.nextLine();
                                Disciplina disciplina = escola.buscarDisciplina(codigoBusca);
                                if (disciplina != null) {
                                    System.out.println("Disciplina encontrada: " + disciplina);
                                } else {
                                    System.out.println("Disciplina não encontrada.");
                                }
                                break;
                            case 4:
                                System.out.println("Digite o código da disciplina: ");
                                String codigoDisciplinaAlunos = scanner.nextLine();
                                Disciplina disciplinaMatricula = escola.buscarDisciplina(codigoDisciplinaAlunos);
                                if (disciplinaMatricula != null) {
                                    System.out.println("Alunos matriculados na disciplina: ");
                                    System.out.println(disciplinaMatricula.listarAlunos());
                                } else {
                                    System.out.println("Disciplina não encontrada.");
                                }
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }

                        if (disciplinaOpcao == 5) break;
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
