package Model;


import java.util.Objects;

public class Offerten {
    private int Id;
    private String Unternehmensname;
    private int Preis;
    private float Prozent;
    private String Adresse;
    private Model.Ort Ort;


    public Offerten(int id, String name, int preis, float prozent, String adresse, Model.Ort ort){
        this.Id = id;
        this.Unternehmensname = name;
        this.Preis = preis;
        this.Prozent = prozent;
        this.Adresse = adresse;
        this.Ort = ort;
    }

    public float getPreis() {
        return Preis;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public float getProzent() {
        return Prozent;
    }

    public void setProzent(int prozent) {
        Prozent = prozent;
    }

    public Model.Ort getOrt() {
        return Ort;
    }

    public void setOrt(Model.Ort ort) {
        Ort = ort;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setPreis(int preis) {
        Preis = preis;
    }

    public String getUnternehmensname() {
        return Unternehmensname;
    }

    public void setUnternehmensname(String unternehmensname) {
        Unternehmensname = unternehmensname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offerten offer = (Offerten) o;
        return Objects.equals(Preis, offer.Preis);
    }

    @Override
    public String toString() {
        return "Offerten{" +
                "Id=" + Id +
                ", Unternehmensname='" + Unternehmensname + '\'' +
                ", Preis=" + Preis +
                ", Prozent=" + Prozent +
                ", Adresse='" + Adresse + '\'' +
                ", Ort=" + Ort +
                '}';
    }

    public int kleiner(Offerten o) {
        if((this.getPreis() + (this.getPreis()*this.getProzent())/100) < (o.getPreis() + (o.getPreis()*o.getProzent())/100))
            return 1;

        if((this.getPreis() + (this.getPreis()*this.getProzent())/100) >= (o.getPreis() + (o.getPreis()*o.getProzent())/100))
            return -1;

        return 0;
    }
}
