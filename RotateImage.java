package strarr;

public class RotateImage {
	
	public static void rotate(int[][] matrix){
		int len = matrix.length;
		int layer=(len-1)/2;//the layers we need to rotate
		int l=0;
		while(l<=layer){
			for(int i=l + 1; i<len; i++){
                swap(matrix, l, i, i, len - 1);//swap right-top and right-bottom
            }
            for(int i=l + 1; i<len; i++){
                swap(matrix, l, i, len - 1, len - i - 1 + l);//swap right-top and left-bottom
            }
            for(int i=l + 1; i<len; i++){
                swap(matrix, l, i, len - i - 1 + l, l);//swap left top and right top
            }
            //go rotate the inside "circle"
            l += 1;
            len -= 1;
        }
		
	}
	public static void swap(int[][] matrix, int x1, int y1, int x2, int y2){
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]matrix = new int[2][2];
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[1][0]=3;
		matrix[1][1]=4;
		int l=matrix.length;
		rotate(matrix);
		for(int i = 0; i<2; i++)
		{
		    for(int j = 0; j<2; j++)
		    {
		        System.out.print(matrix[i][j]);
		    }
		    System.out.println();
		}
		//System.out.println(matrix);
		System.out.println();
	}

}
