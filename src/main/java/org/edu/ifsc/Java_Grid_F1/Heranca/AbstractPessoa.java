package org.edu.ifsc.Java_Grid_F1.Heranca;

import java.time.LocalDate;

public abstract class AbstractPessoa {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    public abstract String getIdentidade();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
