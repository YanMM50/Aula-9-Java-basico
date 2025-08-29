package org.example.atv1;

public class Main {
    public static void main(String[] args) {
        Processador processador1 = new Processador("Intel", "I9", "500hz");
        Memoria memoria1 = new Memoria("Vulcan", "DDR4", "16gb");

        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
    }
}
