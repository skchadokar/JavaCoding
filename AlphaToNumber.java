
public class AlphaToNumber {
//A=1 Z=26.....ZY=701
	public static void main(String[] args) {
		int result = 0; 
		String s ="ZY";
	    for (int i = 0; i < s.length(); i++) 
	    { 
	        result = result *26; 
	        result = result+ s.charAt(i) - 'A' + 1; 
	    } 
	    System.out.println(result); 
	}
}
