package org.example.atv1;

public class Memoria extends PecaModelo{

    private String capacidadearmazenamento;

    public Memoria(String marca, String modelo, String capacidadearmazenamento) {
        super(marca, modelo);
        this.capacidadearmazenamento = capacidadearmazenamento;
    }

    public String getCapacidadearmazenamento() {
        return capacidadearmazenamento;
    }

    public void setCapacidadearmazenamento(String capacidadearmazenamento) {
        this.capacidadearmazenamento = capacidadearmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadearmazenamento='" + capacidadearmazenamento + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
