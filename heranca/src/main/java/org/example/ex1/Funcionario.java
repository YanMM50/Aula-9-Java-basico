package org.example.ex1;

public class Funcionario extends Pessoa{
    private int matricula;
    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, int matricula, String cargo, double salario) {
        super(nome, idade);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
