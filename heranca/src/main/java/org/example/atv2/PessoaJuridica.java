package org.example.atv2;

public class PessoaJuridica extends Pessoa{
    private String cpnj;
    private String inscricaoEstadual;

    public PessoaJuridica(String nome, String telefone, String cpnj, String inscricaoEstadual) {
        super(nome, telefone);
        this.cpnj = cpnj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cpnj='" + cpnj + '\'' +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
