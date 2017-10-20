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
}
