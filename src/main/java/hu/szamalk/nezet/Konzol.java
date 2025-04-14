package hu.szamalk.nezet;

import hu.szamalk.modell.Gyujtemeny;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Konzol {
    public static void main(String[] args) {
        new Konzol();
    }

    public Konzol() {
        /* feladatok IDE kerülnek! */
        Gyujtemeny gy = new Gyujtemeny();
        konzolraIr(gy.getMutargyak().toString());
        fajbaIr(gy.getMutargyak().toString());

        /* serializálás */
        gy.kiiras();
    }

    private void konzolraIr(String uzenet) {
        System.out.println(uzenet);
    }

    private void fajbaIr(String gy) {
        String kiirandoTartalom = gy;
        try {
            Files.write(Path.of("technikafestmeny.txt"), kiirandoTartalom.getBytes());
            konzolraIr(kiirandoTartalom);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void statisztika() {
        String szoveg = "";
        Gyujtemeny gyujtemenyek = new Gyujtemeny();
    }
}
