//add solutions here
import java.util.*;
public class Solutions{

	public static void main(String[] args) {
		
	}

	public int NewYear(int n, int k){
    
	    for(int i = 0; i <= n; i++){
	        total += i * 5;
	        if(total+k > 240 - ((i + 1)*5)){
	            return 0;
	        }
	    }
	    
	    return n;
	}

	public int limakBob(int limak, int bob){
    	int years = 0;
    	int Limak = limak;
        int Bob = bob;

        while(Limak <= Bob){
            Limak = Limak * 3;
            Bob = Bob * 2;
            counter++;
        }


        return years;
    	}

	public static String antonAndDanik(int n,  String input) {
       	 int winsA = 0;
        int winsD = 0;
        if(input.length() != n)
            System.exit(0);
        for(int i = 0; i < n; i++) {
            if(input.charAt(i) == 'A')
                winsA++;
            else if(input.charAt(i) == 'D')
                winsD++;
        }

        if(winsA > winsD)
            return "Anton";
        else if(winsA < winsD)
            return "Danik";
        else
            return "Friendship";
        }

	public void Hulk(String ih, String il){
	int n = Integer.parseInt(kbd.nextLine());
	boolean f = false;
	String ih = "I hate";
	String il = "I love";

	while(n-- > 0){
		if(f){
			System.out.print(il);
		}else{
			System.out.print(ih);
		}

			if(n != 0){
				System.out.print(" that ");
			}else{
				System.out.print(" it");
			}

			f = !f;
		}
	}
}

  public void Polyhedrons(String[] poly) {
       Scanner x = new Scanner(System.in);

       int iterations;
       int total = 0;
       iterations = Integer.parseInt(x.nextLine());
       String[] poly = new String[iterations];

       for (int i = 0; i < iterations; i++){
		poly[i] = x.nextLine();
    }

       for (int j = 0; j < iterations; j++){
       	switch (poly[j]){
       		case "Tetrahedron":
       			total += 4;
       			break;
       		case "Cube":
       			total += 6;
       			break;
       		case "Octahedron":
       			total += 8;
       			break;
       		case "Dodecahedron":
       			total += 12;
       			break;
       		case "Icosahedron":
       			total += 20;
       			break;
       	}
       }
       System.out.print(total);

}
}
