package fr.Nudgeoring.dataviz;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "televiseurs")
public class TV {

    @Id
    private String id;

    private String marque;
    private int taille;
    private double prix;

    // Getters & setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }

    public int getTaille() { return taille; }
    public void setTaille(int taille) { this.taille = taille; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }
}
