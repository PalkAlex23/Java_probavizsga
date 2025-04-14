package hu.szamalk.modell;

public class Szobor extends Mukincs implements Comparable<Szobor> {
    private String anyag;
    private int szazad;

    public Szobor(String alkoto, String cim, String anyag) {
        this(alkoto, cim, anyag, 20);
    }

    public Szobor(String alkoto, String cim, String anyag, int szazad) {
        super(alkoto, cim);
        this.anyag = anyag;
        if (szazad > 21) {
            try {
                throw new NagyobbMint21Exception();
            } catch (NagyobbMint21Exception e) {
                throw new RuntimeException(e);
            }
        }
        this.szazad = szazad;
    }

    public String getAnyag() {
        return anyag;
    }

    public int getSzazad() {
        return szazad;
    }

    @Override
    public String toString() {
        return "Szobor{" +
                "anyag='" + anyag + '\'' +
                ", szazad='" + szazad + '\'' +
                '}';
    }

    @Override
    public int compareTo(Szobor masik) {
        return this.getAlkoto().compareTo(masik.getAlkoto());
    }
}
