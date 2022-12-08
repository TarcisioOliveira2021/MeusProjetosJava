package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    private Date dataNascimento;

    public Aluno(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Aluno{" + "dataNascimento=" + sdf.format(dataNascimento) + '}';
    }
}
