public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private Professor professor;

    public Aluno(String nome, int idade, String matricula, Professor professor) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public Professor getProfessor() {
        return professor;
    }
}