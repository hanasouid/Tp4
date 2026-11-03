package techstore;

public class Test {
public static void main(String[] args) {
	Adresse adresse1 = new Adresse("Monastir",5000);
	Adresse adresse2 = new Adresse("Ben arous", 1133);
	
	System.out.println("Adresse 1:"+adresse1);
	System.out.println("Adresse 2:"+adresse2);
	
	Personne p1=new Personne("01111111","Kbayer","Jasser",adresse1);
	Personne p2=new Personne("02222222","Smida","Ghaith",adresse2);
	System.out.println("Personne 1:"+p1);
	System.out.println("Personne 2:"+p2);

	p1.Setnom("souid");
	p1.Setprenom("hana");
	Adresse a= new Adresse("Ben arous", 1145);
	p1.Setadresse(a);
	System.out.println(p1);
	
	
}


}
