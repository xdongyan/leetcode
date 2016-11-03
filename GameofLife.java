package strarr;

public class GameofLife {
	public static void gameOfLife(int[][]board){
		int colunn =board.length;
		int row=board.length;
		int[][]next=new int[colunn][row];
		
		int life=0;
		for(int i=0;i<row;i++){
			for(int j=0;j<colunn;j++){
				if(i==0&&j!=0){
					life=board[i][j-1]+board[i][j+1]+board[i+1][j-1]+board[i+1][j]+board[i+1][j+1];
				}
				if(i==row){
					life=board[i-1][j-1]+board[i-1][j]+board[i-1][j+1]+board[i][j-1]+board[i][j+1];
				}
				if(j==0)
				if(i>0&&j>0){
				life=board[i-1][j-1]+board[i-1][j]+board[i-1][j+1]+board[i][j-1]+board[i][j+1]+board[i+1][j-1]+board[i+1][j]+board[i+1][j+1];
				}
				
				if(life>2&&board[i][j]==1) next[i][j]=0;
				if(life==2||life==3&&board[i][j]==1) next[i][j]=1;
				if(life>3&&board[i][j]==1) next[i][j]=0;
				if(life==3&&board[i][j]==0) next[i][j]=1;
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][]board={{0,1,1,0},{1,0,0,1},{1,1,0,1},{1,0,0,1}};

	
	}
}
