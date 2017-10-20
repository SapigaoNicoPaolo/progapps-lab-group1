//add solutions here
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

<<<<<<< HEAD
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

=======
>>>>>>> ecd776330669db67e02dd54d6b94fa004943cc00
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
