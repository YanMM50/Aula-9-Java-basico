package org.example.ex1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Yan", 22,"28/08/2025", "Cartão de credito");
        Funcionario funcionario1 = new Funcionario("Maria", 30, 3324, "Supervisor", 3.600);


        System.out.println(cliente1.toString());
        System.out.println(funcionario1.toString());

    }
}


