package Model;


public class Offerten {
    private int Id;
    private String Unternehmensname;
    private float Preis;
    private int Prozent;
    private String Adresse;
    private Ort Ort;

    void Offerten(Integer id, String name, Float preis, Integer prozent, String adresse, Model.Ort ort){
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

    public int getProzent() {
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

    public void setPreis(float preis) {
        Preis = preis;
    }

    public String getUnternehmensname() {
        return Unternehmensname;
    }

    public void setUnternehmensname(String unternehmensname) {
        Unternehmensname = unternehmensname;
    }
}
