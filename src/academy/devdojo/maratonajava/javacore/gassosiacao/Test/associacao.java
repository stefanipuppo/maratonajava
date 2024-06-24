package academy.devdojo.maratonajava.javacore.gassosiacao.Test;

import academy.devdojo.maratonajava.javacore.gassosiacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.gassosiacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.gassosiacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.gassosiacao.dominio.Seminario;

public class associacao {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }

}
