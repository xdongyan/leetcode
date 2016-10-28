package strarr;

public class CompareVersion {
	public static int compareVersion(String version1, String version2) {
		char[]v1=version1.toCharArray();
		char[]v2=version2.toCharArray();
		int i=0,j=0;
		while(i<version1.length()||j<version2.length()){
			int c1=0,c2=0;
			while(i<version1.length() &&v1[i]!='.') c1=c1*10+v1[i++];
			while(j<version2.length() &&v2[j]!='.') c2=c2*10+v2[j++];
			if(c1>c2) return 1;
			if(c1<c2) return -1;
			//compare before.
			i++;
			j++;
			
		    
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="13.2";
		String t="13.3";
		System.out.println(compareVersion(s,t));

	}

}
