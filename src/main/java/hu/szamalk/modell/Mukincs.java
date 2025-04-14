package hu.szamalk.modell;

import java.util.UUID;

public class Mukincs {
    private UUID azonosito;
    private String alkoto, cim;
    public enum kategoria {EREDETI, MASOLAT, KIS_ERTEKU};

    public Mukincs(String alkoto, String cim) {
        this.azonosito = UUID.randomUUID();
        this.alkoto = alkoto;
        this.cim = cim;
    }

    public UUID getAzonosito() {
        return azonosito;
    }

    public String getAlkoto() {
        return alkoto;
    }

    public String getCim() {
        return cim;
    }

    public void setAzonosito() {
        this.azonosito = UUID.randomUUID();
    }

    public void setAlkoto(String alkoto) {
        this.alkoto = alkoto;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    @Override
    public String toString() {
        return "Mukincs{" +
                "azonosito=" + azonosito +
                ", alkoto='" + alkoto + '\'' +
                ", cim='" + cim + '\'' +
                '}';
    }
}
