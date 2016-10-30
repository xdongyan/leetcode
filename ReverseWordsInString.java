package strarr;

public class ReverseWordsInString {
		public static String reverseWords(String s){
		
			String[]sarray=s.trim().split("\\s+");//split the string by space(s)
			StringBuilder str=new StringBuilder();
				for(int i=sarray.length-1;i>0;i--){
					str.append(sarray[i]+" ");//append the words&space
			
		}
			str.append(sarray[0]);//append the first word of the original string
		return str.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="a b c d";

//System.out.println(s.length());
System.out.println(reverseWords(s));
	}

}
