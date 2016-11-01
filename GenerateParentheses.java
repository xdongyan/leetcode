package strarr;
import java.util.*;
public class GenerateParentheses {
	public static List<String> generateParenthesis(int n){
		List<String> result=new ArrayList<String>();
		if(n==0) return result;
		helper(result,"",n,n);
		return result;
	}
	public static void helper(List<String> result,String par,int left,int right){//recursion!
		if(left>0){
			helper(result,par+'(',left-1,right);
		}
		if(right>left){
			helper(result,par+')',left,right-1);
		}
		if(right==0){
			result.add(par);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int l=1/2;
		System.out.println(l);
		System.out.println(generateParenthesis(n));
		//[((())), (()()), (())(), ()(()), ()()()]
	}

}
