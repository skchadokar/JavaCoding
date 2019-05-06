//multiple of 10  with 1,4,5,9,..wil be diff always so create array of them
//asked by google facebook

public class NumToRomanNumerals {

	static final String []ROMAN_NUM = {"C","XC","L","XL","X","IX","V","IV","I"};
	static final Integer []NUM = {100,90,50,40,10,9,5,4,1};
	public static void main(String[] args) {
		int num = 43;
		int i=0;
		StringBuilder sb = new StringBuilder();
		while(num>0) {
			if(num-NUM[i]>=0) {
				sb.append(ROMAN_NUM[i]);
				num = num-NUM[i];
			}else {
				i++;
			}
			
		}
		System.out.println(sb);
	}
}
