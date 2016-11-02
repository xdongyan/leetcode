package strarr;

import java.util.*;

public class LetterCombinationsofaPhoneNumber {
	public static List<String> letterCombinations(String digits){
		String[] key = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		if(digits == null || digits.length()==0) return new ArrayList<String>();
		List res = new ArrayList<String>();
		helper(digits,key,"",res);
		return res;
		
	}
	public static void helper(String digits,String[]key,String str,List<String> res){
		if (digits.length() == 0) {
            res.add(str); 
        } else {
            int num = Integer.parseInt(digits.substring(0, 1)); 
            String vals = key[num]; 
            for (int i = 0; i < vals.length(); i++) { 
                helper(digits.substring(1), key, str + vals.substring(i, i+1), res);
            }
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "23";
		System.out.println(letterCombinations(digits));
	}

}
