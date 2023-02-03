package tictactoe;

import java.util.Random;
import java.util.Scanner;

abstract class player {
    String name;
    char mark;
    int score;

    public player(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }
    abstract void getpos();
    void displayscore(){
        System.out.println(name+" "+score+"/3");
    }  
}

class human extends player{

    human(String name,char mark){
        super(name, mark);
    }
    @Override
    void getpos() {
        Scanner sc=new Scanner(System.in);
        while(true){
            int row;
            int col;
            System.out.println("enter pos");
            int pos=sc.nextInt();
            if(pos==1){
                row=0;
                col=0;
            }else if(pos==2){
                row=0;
                col=1;
            }else if(pos==3){
                row=0;
                col=2;
            }
            else if(pos==4){
                row=1;
                col=0;
            }
            else if(pos==5){
                row=1;
                col=1;
            }
            else if(pos==6){
                row=1;
                col=2;
            }
            else if(pos==7){
                row=2;
                col=0;
            }
            else if(pos==8){
                row=2;
                col=1;
            }
            else if(pos==9){
                row=2;
                col=2;
            }else{
                row=-1;
                col=-1;
            }

            if(tictactoe.vaildMove(row, col)){
                tictactoe.placeMark(row, col, this.mark);
                break;
            }
        }
    }

}

class computer extends player{

    computer(){
        super("computer",'O');
    }

    @Override
    void getpos() {
        while(true){
            Random r=new Random();
            int row =r.nextInt(3);
            int col=r.nextInt(3);
            if(tictactoe.vaildMove(row, col,this)){
                tictactoe.placeMark(row, col, this.mark);
                break;
            }
        }
    }

}
