package hu.szamalk.modell;

public class Festmeny extends Mukincs {
    private String stilus, technika;

    public Festmeny(String alkoto, String cim, String stilus, String technika) {
        super(alkoto, cim);
        this.stilus = stilus;
        this.technika = technika;
    }

    @Override
    public String toString() {
        return "Festmeny{" +
                "stilus='" + stilus + '\'' +
                ", technika='" + technika + '\'' +
                '}';
    }
}
