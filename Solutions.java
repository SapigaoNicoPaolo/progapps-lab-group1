//add solutions here
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
}
