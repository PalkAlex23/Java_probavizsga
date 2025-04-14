package hu.szamalk.modell;

public class NagyobbMint21Exception extends Exception {
    public NagyobbMint21Exception() {
        System.out.println("A szobornak megadott század száma nagyobb mint 21!");
    }
}
