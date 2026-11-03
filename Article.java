package techstore;

public class Article {
	 private static int compteur = 0;

	    private int id;
	    private String nom;
	    private String reference;
	    private double prix;

	    
	    public Article(String nom, double prix) {
	        this.id = ++compteur;
	        this.nom = nom;
	        this.prix = prix;
	        this.reference = genererReference();
}
	    private String genererReference() {
	        String nomS= nom.replace(" ", "");
	        String ref = "";

	        for (int i = 0; i < nomS.length(); i++) {
	            if (i % 5 == 0) {
	                ref += nomS.charAt(i);
	            }
	        }

	        return ref + id;
	    }
	    public int getId() {
	        return id;
	    }

	    public String getReference() {
	        return reference;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public double getPrix() {
	        return prix;
	    }

	    
	    public void setReference(String reference) {
	        this.reference = reference;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	        this.reference = genererReference();
	    }

	    public void setPrix(double prix) {
	        this.prix = prix;
	    }
	    public void modifier(String nom) {
	        this.nom = nom;
	        this.reference = genererReference();
	    }
	    public void modifier(String nom, double prix) {
	        this.nom = nom;
	        this.prix = prix;
	        this.reference = genererReference();
	    }
	    public String toString() {
	        return "id=" + id +
	               ", nom=" + nom +
	               ", reference=" + reference +
	               ", prix=" + prix;
	    }

public static void main(String[] args) {

    Article a1 = new Article("Apple iPad", 1269);

    System.out.println(a1);

    a1.modifier("Apple iPad 8e Generation", 1629);

    System.out.println(a1);
}
}
