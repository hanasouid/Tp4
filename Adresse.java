package techstore;
import java.util.Scanner;
public class Adresse {
    private static String gouvernorat;
    private static int codepostal;
     
	public Adresse ( String gouvernorat, int codepostal) {
    	this.gouvernorat=gouvernorat;
    	this.codepostal=codepostal;
    	
    }
    public String toString() {
    	return "Adresse [ gouvernorat = " +this.gouvernorat +", codepostal=" +this.codepostal+"]";
    }
    public String getGouvernorat() {
    	return gouvernorat;
    }
    public int getcodepostal() {
    	return codepostal;
    }
    public void SetGouvernorat(String gouv) {
    	this.gouvernorat=gouv;
    }
    public void Setcodepostal(int codepostal) {
    	this.codepostal=codepostal;
    }
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("donner le gouvernorat:");
    	String gouvernorat=scanner.nextLine();
    	System.out.println("donner le code postal:");
    	int codepostal= scanner.nextInt();
    	Adresse  a = new Adresse(gouvernorat, codepostal);
    	a.SetGouvernorat(gouvernorat);
    	a.Setcodepostal(codepostal);
    	System.out.println(a);
    
    }
}
