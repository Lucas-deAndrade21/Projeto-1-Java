public class Main {
    public static void main(String[] args) {
        //Instanciando professores
        Professor professor1 = new Professor("Marcelo Perantoni", "POO em Java");
        Professor professor2 = new Professor("Maria Silva", "Estruturas de Dados");

        //Instanciando alunos do professor 1
        Aluno aluno1 = new Aluno("Lucas Andrade", 20, "123123123", professor1);
        Aluno aluno2 = new Aluno("Carlos Edurado", 20, "99665588", professor1);

        //Instanciando alunos do professor 2
        Aluno aluno3 = new Aluno("Victor Leon", 20, "11223344", professor2);
        Aluno aluno4 = new Aluno("Pedro Silva", 20, "55667788", professor2);

        //Adicionando alunos aos professores
        professor1.adicionarAluno(aluno1);
        professor1.adicionarAluno(aluno2);
        professor2.adicionarAluno(aluno3);
        professor2.adicionarAluno(aluno4);

        //Exibindo informações dos professores e seus alunos
        System.out.println("Professor: " + professor1.getNome() + "\nMatéria: " + professor1.getMateria());
        for (Aluno aluno : professor1.getAlunos()) {
            System.out.println(aluno.getNome() + " - " + aluno.getMatricula());
        }

        System.out.println("\nProfessor: " + professor2.getNome() + "\nMatéria: " + professor2.getMateria());
        for (Aluno aluno : professor2.getAlunos()) {
            System.out.println(aluno.getNome() + " - " + aluno.getMatricula());
        }
    }
}