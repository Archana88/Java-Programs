public class Bitwiseop{
	public static void main(String args[]){
		String binary[]={"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
		int a=3;
		int b=6;
		int c=a|b;
		int d=a^b;
		int e=~a;
		int f=a&b;
		int g=(~a&b)|(a&~b);
		int h=~a&0x0f;
		System.out.println("The result is : " +c+" "+d+" "+e+" "+f+" "+g+" "+h);
		System.out.println("The result is : " +binary[c]+" "+binary[d]+" "+binary[e]+" "+binary[f]+" "+binary[g]+" "+binary[h]);
	}
	}