package org.example.atv1;

public class DispositivoArmazenamento extends PecaModelo{
    private String capacidadearmazenamento;
    private String tipodeconexao;


    public DispositivoArmazenamento(String marca, String modelo, String tipodeconexao, String capacidadearmazenamento) {
        super(marca, modelo);
        this.tipodeconexao = tipodeconexao;
        this.capacidadearmazenamento = capacidadearmazenamento;
    }

    public String getCapacidadearmazenamento() {
        return capacidadearmazenamento;
    }

    public void setCapacidadearmazenamento(String capacidadearmazenamento) {
        this.capacidadearmazenamento = capacidadearmazenamento;
    }

    public String getTipodeconexao() {
        return tipodeconexao;
    }

    public void setTipodeconexao(String tipodeconexao) {
        this.tipodeconexao = tipodeconexao;
    }

    @Override
    public String toString() {
        return "DispositivoArmazenamento{" +
                "capacidadearmazenamento='" + capacidadearmazenamento + '\'' +
                ", tipodeconexao='" + tipodeconexao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
