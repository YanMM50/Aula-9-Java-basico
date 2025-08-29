package org.example.atv2;

public class Main {
    public static void main(String[] args) {
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Maria", "7199999-9999","44.900.356/0001-57", "5545936-49");
        PessoaFisica pessoaFisica1 = new PessoaFisica("Yan", "71985242246", "555.666.444-33", "1452654-12","18/12/2000");

        System.out.println(pessoaFisica1.toString());
        System.out.println(pessoaJuridica1.toString());
    }
}
