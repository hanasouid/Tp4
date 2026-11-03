package techstore;
import java.util.Scanner;
public class Personne {
     private static String cin;
     private static String nom;
     private static String prenom;
     private static Adresse adresse;
     
     public  Personne(String cin, String nom, String prenom, Adresse adresse) {
    	 this.cin=cin;
    	 this.nom=nom;
    	 this.prenom=prenom;
    	 this.adresse=adresse;
     }
     public Personne(String cin, String nom, String prenom, String gouvernorat, int codepostal) {
    	 this.cin=cin;
    	 this.nom=nom;
    	 this.prenom=prenom;
    	 this.adresse= new Adresse(gouvernorat, codepostal);
      }
     public void Setcin(String cin) {
    	 this.cin=cin;
     }
     public String getcin() {
    	 return cin;
     }
     public String getnom() {
    	 return nom;
     }
     public String getprenom() {
    	 return prenom;
     }
     public Adresse getAdresse() {
    	 return adresse;
     }
     public void Setnom(String nom) {
    	 this.nom=nom;
     }
     public void Setprenom(String prenom) {
    	 this.prenom=prenom;
     }
     public void Setadresse(Adresse adresse) {
    	 this.adresse=adresse;
     }
     public String toString() {
     	return "Personne [ cin = " +this.cin +", nom=" +this.nom+",prenom="+this.prenom+","+this.adresse; 
     }
     public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
     	System.out.println("donner le numero cin:");
     	String cin=scanner.nextLine();
     	System.out.println("donner le nom:");
     	String nom= scanner.nextLine();
     	System.out.println("donner le prenom:");
     	String prenom= scanner.nextLine();
     	
     	Personne p=new Personne(cin,nom,prenom,adresse);
     	System.out.println("donner le gouvernorat:");
     	String gouvernorat= scanner.nextLine();
     	System.out.println("donner le codepostal:");
     	int codepostal=scanner.nextInt();
		Adresse adresse = new Adresse(gouvernorat, codepostal);
     	p.Setcin(cin);
     	p.Setnom(nom);
     	p.Setprenom(prenom);
     	p.Setadresse(adresse);
     	System.out.println(p);
     	
     }
}
