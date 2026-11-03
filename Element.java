package techstore;

public class Element {
private Article article ;
private long quantite;
public Element(Article article, long quantite) {
	this.article= article;
	this.quantite= quantite;
	
	}
public Element(String nom, double prix, long quantite ) {
	this.article=new Article( nom,  prix);
	this.quantite= quantite;
}
public Article getArticle() {
	return article;
}
public long getquantite() {
	return quantite;
}
public String getReferenceArticle(){
	return this.article.getReference();
}

public String getNomArticle() {
	return this.article.getNom();
}
public double getPrixArticle() {
	return this.article.getPrix();
}

public void setArticle(Article article) {
	this.article= article;
}

public void  setQuantite(long quantite) {
	this.quantite= quantite;
}
public void incrementerQuantite(long qt) {
	if(qt>=0) {
		this.quantite+=qt;
	}else {
		System.out.println("erreur");
	}
}
public void decrementerQuantite(long qt) {
	if(qt>=0 && qt<=quantite) {
		this.quantite-=qt;
	}else {
		System.out.println("erreur");
	}
}
public void modifier(String nom, double prix, long quantite) {
    this.article = new Article(nom, prix);
    this.quantite = quantite;
}
public boolean equals(String reference) {
    return article.getReference().equals(reference);
}
public boolean equals(Article a) {
    return article.equals(a);
}
public String toString() {
    return article.toString() + "Quantité : " + quantite;
}



    public static void main(String[] args) {

        
        Element e1 = new Element("Clavier", 50.0, 10);

        
        System.out.println("Element  :");
        System.out.println(e1);

        
        e1.incrementerQuantite(5);
        System.out.println(" incrémentation :");
        System.out.println(e1);

        
        e1.decrementerQuantite(3);
        System.out.println("décrémentation :");
        System.out.println(e1);

        
        e1.modifier("Souris", 25.0, 20);
        System.out.println(" modification :");
        System.out.println(e1);

        
        System.out.println("Nom : " + e1.getNomArticle());
        System.out.println("Prix : " + e1.getPrixArticle());
        System.out.println("Référence : " + e1.getReferenceArticle());
        System.out.println("Quantité : " + e1.getquantite());

        
        String ref = e1.getReferenceArticle();
        System.out.println("Equals(String) : " + e1.equals(ref));

        
        Article a = new Article("Souris", 25.0);
        System.out.println("Equals(Article) : " + e1.equals(a));
    }
}