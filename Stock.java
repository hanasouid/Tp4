package techstore;
import java.util.ArrayList;
public class Stock {
	    private ArrayList<Element> articleList;

	    public Stock() {
	        articleList = new ArrayList<>();
	    }

	    public Stock(ArrayList<Element> articleList) {
	        this.articleList = articleList;
	    }

	    public Stock(ArrayList<String> noms,ArrayList<Double> prix,
                ArrayList<Long> quantites) {

	        articleList = new ArrayList<>();

	        for (int i = 0; i < noms.size(); i++) {
	            articleList.add(
	                new Element(noms.get(i),prix.get(i),quantites.get(i))
	    	            );
	                         
	        }
	    }

	   
	    public ArrayList<Element> getArticleList() {
	        return articleList;
	    }

	    
	    public int getArticleNb() {
	        return articleList.size();
	    }

	    public void setArticleList(ArrayList<Element> articleList) {
	        this.articleList = articleList;
	    }

	    
	    public void ajouterArticle(Article article, long quantite) {
	        articleList.add(new Element(article, quantite));
	    }

	   
	    public void ajouterArticle(String nom,
	                               double prix,
	                               long quantite) {

	        articleList.add(new Element(nom, prix, quantite));
	    }

	    public Element trouverArticle(String reference) {

	        for (Element e : articleList) {
	            if (e.equals(reference)) {
	                return e;
	            }
	        }

	        return null;
	    }

	   
	    public void modifierArticle(String reference,String nNom,double nPrix,
	     long nQuantite) {

	        Element e = trouverArticle(reference);

	        if (e != null) {
	            e.modifier(nNom,nPrix, nQuantite);
	                
	        }
	    }

	   
	    public void supprimerArticle(String reference) {

	        Element e = trouverArticle(reference);

	        if (e != null) {
	            articleList.remove(e);
	        }
	    }

	    
	    public void incrementerQuantiteArticle(
	            String reference,
	            long quantite) {

	        Element e = trouverArticle(reference);

	        if (e != null) {
	            e.incrementerQuantite(quantite);
	        }
	    }

	    
	    public void decrementerQuantiteArticle( String reference,long quantite) {

	        Element e = trouverArticle(reference);

	        if (e != null) {
	            e.decrementerQuantite(quantite);
	        }
	    }

	
	    public String toString() {

	        String ch = "";

	        for (Element e : articleList) {
	            ch += e.toString() + "\n";
	        }

	        return ch;
	    }
	

    public static void main(String[] args) {

        Stock stock = new Stock();

        stock.ajouterArticle("PC Portable", 2500, 5);
        stock.ajouterArticle("Souris", 30, 20);
        stock.ajouterArticle("Clavier", 60, 15);

        System.out.println(" Stock: ");
        System.out.println(stock);

        String ref = stock.getArticleList().get(0).getReferenceArticle();
                          
        stock.incrementerQuantiteArticle(ref, 10);

        System.out.println(" incrémentation");
        System.out.println(stock);

        stock.modifierArticle(ref, "PC Gamer",3000, 8);
   
        System.out.println(" modification ");
        System.out.println(stock);

        stock.supprimerArticle(ref);

        System.out.println(" suppression");
        System.out.println(stock);
    }
}

