package hu.szamalk.modell;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gyujtemeny implements Serializable {
    private List<Mukincs> mutargyak;

    public Gyujtemeny() {
        this.mutargyak = new ArrayList<>();

        mutargyak.add(new Szobor("Michelangelo", "Dávid szobor", "márvány"));
        mutargyak.add(new Festmeny("Monet", "Tavirózsák", "impresszionista", "festék"));
        mutargyak.add(new Szobor("Rodin", "A gondolkodó", "bronz"));
        mutargyak.add(new Festmeny("Renoir", "Fürdőzők", "impresszionista", "ceruza"));
        mutargyak.add(new Festmeny("Dali", "Hattyúk", "szürrealista", "festék"));
    }

    public List<Mukincs> getMutargyak() {
        return Collections.unmodifiableList(mutargyak);
    }

    public List<Szobor> getSzobrok() {
        List<Szobor> szobrok = new ArrayList<>();
        for (Mukincs mukincs : mutargyak) {
            if (mukincs instanceof Szobor) {
                szobrok.add(new Szobor("Michelangelo", "Dávid szobor", "márvány"));
            }
        }
        return Collections.unmodifiableList(szobrok);
    }

    public List<Szobor> getSzobrokAlkotoRendez() {
        List<Szobor> szobrok = getSzobrok();
        Collections.sort(szobrok);
        return Collections.unmodifiableList(szobrok);
    }

    public void kiiras() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("gyujtemenyek.txt"));
            oos.writeObject(mutargyak);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void beolvasas() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("gyujtemenyek.txt"));
            Gyujtemeny gy = (Gyujtemeny) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
