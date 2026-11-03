package techstore;
import java.util.Scanner;

public class TestStock {
	
	
	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        Stock stock = new Stock();

	        int choix;

	        do {
	            System.out.println("Menu Gérant");
	            System.out.println("0. Ajouter un article");
	            System.out.println("1. Augmenter la quantité d'un article");
	            System.out.println("2. Modifier un article");
	            System.out.println("3. Supprimer un article");
	            System.out.println("4. Consulter le stock");
	            System.out.println("5. Quitter");
	            System.out.print("Votre choix : ");

	            choix = scanner.nextInt();
	            scanner.nextLine();

	            switch (choix) {

	                case 0:

	                    System.out.print("Nom : ");
	                    String nom = scanner.nextLine();

	                    System.out.print("Prix : ");
	                    double prix = scanner.nextDouble();

	                    System.out.print("Quantité : ");
	                    long qte = scanner.nextLong();
	                    scanner.nextLine();

	                    stock.ajouterArticle(nom, prix, qte);

	                    System.out.println("Article ajouté ");
	       
	                    break;

	                case 1:

	                	 System.out.print("Référence de l'article : ");
		                    String refI = scanner.nextLine();

		                    System.out.print("Quantité à ajouter : ");
		                    long qteI = scanner.nextLong();
		                    scanner.nextLine();

		                    stock.incrementerQuantiteArticle(refI, qteI);

		                    System.out.println("nouvelle quantité");
		                    break;

	                case 2:

	                	 System.out.print("Référence de l'article : ");
		                    String refM = scanner.nextLine();

		                    System.out.print("Nouveau nom : ");
		                    String nomM = scanner.nextLine();

		                    System.out.print("Nouveau prix : ");
		                    double prixM = scanner.nextDouble();

		                    System.out.print("Nouvelle quantité : ");
		                    long qteM = scanner.nextLong();
		                    scanner.nextLine();

		                    stock.modifierArticle(refM, nomM, prixM, qteM);

		                    System.out.println("Article est modifié");
		                    break;

	                case 3:

	                    System.out.print("Référence à supprimer : ");
	                    String refS = scanner.nextLine();

	                    stock.supprimerArticle(refS);

	                    System.out.println("Article est  supprimé ");
	                    break;

	                case 4:

	                   System.out.println("les articles en stock:");
	                   for (Element a : stock. getArticleList()) {
	                       System.out.println(a);
	                   }

	                   break;

	                   
	                case 5:

	                    System.out.println("Quitter");
	                    break;

	                default:

	                    System.out.println("Choix non valide");
	            }

	        } while (choix != 5);

	        scanner.close();
	    }

		
			
		}
	

