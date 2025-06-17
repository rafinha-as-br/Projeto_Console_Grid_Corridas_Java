package org.edu.ifsc.Java_Grid_F1.Heranca;

public class Paciente extends AbstractPessoa {
    private String prontuário;
    private int matricula;

    public String getProntuário() {
        return prontuário;
    }

    public void setProntuário(String prontuário) {
        this.prontuário = prontuário;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getIdentidade() {
        return ""+ matricula;
    }
}
