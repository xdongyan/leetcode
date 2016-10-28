package strarr;
/*More about math,find relationship between the index of char.
 * After zz convert:
 * rows:3   {0,  4,  8,   12,  16...}steps1=2*rows-2 =4 
 * 			{1,3,5,7,9,11,13.. 17...}steps2=step1-2*i||steps1
 *          {2,  6,  10,  14,  18...}steps3=steps=4
 * ...
 * 
 */
public class ZZconvert {
	public static String convert(String s,int numRows){
		if (numRows <= 1) {
	        return s;
	    }
	    int n = s.length();
	    int step = 2 * numRows - 2;
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < numRows; i++) {
	        for (int j = i; j < n; j += step) {
	            sb.append(s.charAt(j));
	            if (i != 0 && i != numRows - 1 && j + step - 2 * i < n) 
	            {
	                sb.append(s.charAt(j + step - 2 * i));
	            }
	        }
	    }
	    return sb.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="0123456789";
int numRows=11;
System.out.println(convert(s,numRows));
	}

}
