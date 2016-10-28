package strarr;

import java.util.*;

public class IsomorphicString {
	public static boolean IsIsomorphic(String s,String t){	
		if(s.length()!=t.length()) return false;

		HashMap<Character,Integer>map1=new HashMap<>();
		HashMap<Character,Integer>map2=new HashMap<>();
		for(int i=0;i<s.length();i++){
			
			if(map1.put(s.charAt(i), i)!= map2.put(t.charAt(i), i)) return false;
			
}
return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="apple";
		String t="opple";
		System.out.println(IsIsomorphic(s,t));
	}

}
