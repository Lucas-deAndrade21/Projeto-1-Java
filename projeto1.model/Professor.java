import java.util.ArrayList;

public class Professor {
    private String nome;
    private String materia;
    private ArrayList<Aluno> alunos;

    public Professor(String nome, String materia) {
        this.nome = nome;
        this.materia = materia;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getMateria() {
        return materia;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}
