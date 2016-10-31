package strarr;

public class ValidPalindrome {
	public static boolean isPalindrome(String str){
		char[]nstr=str.toLowerCase().replaceAll("[^A-Za-z0-9]", "").toCharArray();
		int i=0,j=nstr.length-1;
		if(nstr.length==0||nstr.length==1)return true;
		while(i<j){
			if(nstr[i]==nstr[j]){
				i++;
				j--;
			}
			else return false;
		
	}
	return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc d,ed:c.ba";
		System.out.println(isPalindrome(str));
	}

}
