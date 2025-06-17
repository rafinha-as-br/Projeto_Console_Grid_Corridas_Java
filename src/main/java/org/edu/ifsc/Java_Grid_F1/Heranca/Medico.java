package org.edu.ifsc.Java_Grid_F1.Heranca;

public class Medico extends AbstractPessoa {
    private String crm;

    @Override
    public String getIdentidade() {
        return crm;
    }
}
