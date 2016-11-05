
public class GameofLife {
	public static void gameOfLife(int[][]board){
		int width=board[0].length;
		int height=board.length;
		int[][]next=new int[height][width];
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				int life=0;
				if(i-1>=0 && j-1>=0 && board[i-1][j-1]==0 ) life++;//topleft;
				if(i-1>=0 && board[i-1][j]==1) life++; //top
				if(i-1>=0 && j+1<width && board[i-1][j+1]==1) life++;//topright
				if(j-1>=0 && board[i][j-1]==1) life++;//left
				if(j+1<width && board[i][j+1]==1) life++;//right
				if(i+1<height && j-1>=0 && board[i+1][j-1]==1)life++;//botleft
				if(i+1<height && board[i+1][j]==1)life++;//bot
				if(i+1<height && j+1<width && board[i+1][j+1]==1) life++;//botright
				
				if(board[i][j]==1){
					if(life<2 || life>3) next[i][j]=0;
					else next[i][j]=1;
				}
				if(board[i][j]==0){
					if(life==3) next[i][j]=1;
					else next[i][j]=0;
				}
				
			}
		}
			for(int i=0;i<height;i++){
				for(int j=0;j<width;j++){
					board[i][j]=next[i][j];
			}
				}	
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]board={{1,1},{1,0}};
		gameOfLife(board);
		System.out.println(board[0].length);
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				System.out.println(board[i][j]);
			}
		}
	}

}
