package org.example.atv3;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua", "475", "casa", "40370006","Salvador");
        Endereco endereco2 = new Endereco("Rua", "187", "AP", "41568996","Salvador");
        Engenheiro engenheiro1 = new Engenheiro("Yan", "yan@gamil.com", 8.000, endereco1, "654645965");
        Medico medico1 = new Medico("Maria", "maria@gamil.com", 7.500, endereco2, "1156414");

        System.out.println(engenheiro1.toString());
        System.out.println(medico1.toString());
    }
}
