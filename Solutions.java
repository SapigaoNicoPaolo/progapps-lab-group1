//add solutions here
import java.util.Scanner;

public class Solutions{

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print(NewYear(s.nextInt(),s.nextInt()));
		
	}

	public static int NewYear(int n, int k){
        int total=0;
	    for(int i = 0; i <= n; i++){
	        total += i * 5;
	        if(total+k > 240 - ((i + 1)*5)){
	            return i;
	        }
	    }
	    
	    return n;
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
}
