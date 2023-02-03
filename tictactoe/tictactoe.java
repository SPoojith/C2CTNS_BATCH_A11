package tictactoe;

public class tictactoe {
    static char [][] board;
    static int [][] dboard;
    char mark;
    
    public tictactoe(){
        board=new char[3][3];
        dboard=new int[3][3];
        int count=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++,count++){
                board[i][j]=' ';
                dboard[i][j]=count;
            }
        }
    }

    void displayBoard(){
        System.out.println();
        int row=0;
        for(int i=0;i<5;i++){
            int col=0;
            int dcol=0;
            for(int j=0;j<5;j++){
                if(i%2 == 1 || j%2==1){
                    if(j%2==1 && i%2==1)
                        System.out.print(" + ");
                    else if(j%2==1)
                        System.out.print(" | ");
                    else if(i%2==1)
                        System.out.print(" - ");
                }else{
                    System.out.print(" "+board[row][col++]+" ");
                }
            }
            System.out.print("          ");
            for(int j=0;j<5;j++){
                if(i%2 == 1 || j%2==1){
                    if(j%2==1 && i%2==1)
                        System.out.print(" + ");
                    else if(j%2==1)
                        System.out.print(" | ");
                    else if(i%2==1)
                        System.out.print(" - ");
                }else{
                    System.out.print(" "+dboard[row][dcol++]+" ");
                }

            }
            if(i%2==0){
                row++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    static boolean winRow(){
        for(int i=0;i<3;i++)
            if(board[i][0]==board[i][1] && board[i][0]==board[i][2] && board[i][0] != ' '){
                System.out.println("win condition is ( "+ i +" 0), ("+ i+" 1), ("+ i +" 2 )");
                return true;
            }
        return false;
    }

    static boolean winCol(){
        for(int j=0;j<3;j++){
            if(board[0][j]==board[1][j] && board[0][j]==board[2][j] && board[0][j] != ' '){
                System.out.println("win condition is ("+" 0, "+ j+") ( 1, "+ j +") ( 2 "+ j+" )");
                return true;
            }
        }
        return false;
    }

    static boolean winDia(){
        if(board[0][0]==board[1][1] && board[0][0]==board[2][2] && board[0][0] != ' ') {
            System.out.println(" win condition is (0,0) (1,1) (2,2)");
            return true;
        }
        else if(board[0][2]==board[1][1] && board[0][2]==board[2][0] && board[0][2] != ' '){
            System.out.println(" win condition is (0,2) (1,1) (2,0)");
            return true;
        }
        return false;
    }

    static boolean checkWin(){
        if(winRow()||winCol()||winDia()){
            return true;
        }
        return false;
    }

    static void placeMark(int row,int col,char Mark){
        board[row][col]=Mark;
    }

    static boolean vaildMove(int row,int col){
        if((row>2 && row<-1 || col>2 && col<-1)){
            System.out.println("enter valid move by selecting pos between 1-9");
            return false;
        }
        if( board[row][col]!=' '){
            System.out.println("pos already taken");
            return false;
        }
        return true;
    }
    static boolean vaildMove(int row,int col,player p){
        if((row>2 && row<-1 || col>2 && col<-1)){
            //System.out.println("enter with in 1-9");
            return false;
        }
        if( board[row][col]!=' '){
            //System.out.println("pos already taken");
            return false;
        }
        return true;
    }

    static boolean checkdraw(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]==' '){
                    return false;
                }
            }
        }
        return true;
    }
}
