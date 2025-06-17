package org.edu.ifsc.Java_Grid_F1.Heranca;

public class MedicoEspecialista extends Medico{
    private String rqe;

    @Override
    public String getIdentidade() {
        return super.getIdentidade() + rqe;
    }
}
