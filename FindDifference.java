package strarr;

public class FindDifference {
public static char finddifference(String s,String t){
	char[]sarr=s.toCharArray();
	char[]tarr=t.toCharArray();
	char c=0;
	for(char c1:sarr){
		c^=c1;
	}
	for(char c1:tarr){
		c^=c1;
		
	}
	return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		String t="abcde";
		System.out.print(finddifference(s,t));
		
	}

}
