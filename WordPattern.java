package strarr;
import java.util.*;
public class WordPattern {
	public static boolean wordPattern(String str,String pattern){
		String[]charstr=str.split(" ");
		//char[] charpattern=pattern.toCharArray();
		if(charstr.length!=pattern.length()) return false;
		Map<String,Integer>map1 = new HashMap<>();
		Map<Character,Integer>map2 = new HashMap<>();
		for(Integer i =0;i<pattern.length();i++){
			if(map1.put(charstr[i],i)!=(map2.put(pattern.charAt(i), i))) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="abba";
		String str="dog cat cat dog";
		System.out.println(wordPattern(str,pattern));
	}

}
