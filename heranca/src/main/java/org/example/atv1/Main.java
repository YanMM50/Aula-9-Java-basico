package org.example.atv1;

public class Main {
    public static void main(String[] args) {
        Processador processador1 = new Processador("Intel", "I9", "5.4Ghz");
        Memoria memoria1 = new Memoria("Vulcan", "DDR4", "16gb");
        PlacaMae placamae1 = new PlacaMae("Tuf Gaming", "B550m", "AMD");
        DispositivoArmazenamento dispositivoArmazenamento1 = new DispositivoArmazenamento("Kingston", "Ssd", "Nvem.2", "1T");


        System.out.println(processador1.toString());
        System.out.println(memoria1.toString());
        System.out.println(placamae1.toString());
        System.out.println(dispositivoArmazenamento1.toString());
    }
}
