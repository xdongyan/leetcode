package strarr;

public class ReverseString {
public static String reverseString(String s){
	char[] arr=s.toCharArray();//conver stirng to array
	int i=0,j=s.length()-1;//the first and last pointer.
	while(i<j){
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	return new String(arr);//return string
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello";
System.out.println(reverseString(s));
	}

}
