// classe pessoa
class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String enviarEmail(String mensagem) {
        return "Olá " + nome + "!\n\n" + mensagem;
    }
}

// classe professor que vai estar herdando a pessoa
class Professor extends Pessoa {
    public Professor(String nome) {
        super(nome);
    }

    public String enviarEmail(String mensagem) {
        return "Olá Prof. " + nome + "!\n\n" + mensagem;
    }
}

// classe aluno que vai estar herdando a pessoa
class Aluno extends Pessoa {
    public Aluno(String nome) {
        super(nome);
    }

    public String enviarEmail(String mensagem) {
        return "Olá Aluno " + nome + "!\n\n" + mensagem;
    }
}

// classe principal que vai estar executando os comandos
public class Main {
    public static void main(String[] args) {
        // Criando um professor e um aluno
        Professor professor = new Professor("Alan Turing");
        Aluno aluno = new Aluno("Joseph");

        // vai enviar as mensagens no caso via email
        String mensagemProfessor = "Sua aula começa as 19h.";
        String mensagemAluno = "Hoje teremos prova.";

        System.out.println(professor.enviarEmail(mensagemProfessor));
        System.out.println(aluno.enviarEmail(mensagemAluno));
    }
}
