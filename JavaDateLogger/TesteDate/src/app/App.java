package app;

import java.lang.System.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;

import Model.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = format.parse("01/01/2000");

        Aluno aluno = new Aluno(dataNascimento);
        Logger logger = System.getLogger("Aluno");
        logger.log(System.Logger.Level.INFO, aluno.toString());

    }
}
