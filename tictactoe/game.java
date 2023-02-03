package tictactoe;

import java.util.Scanner;

public class game {
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("select choice");
    System.out.println("choice 1: human vs human");
    System.out.println("choice 2: human vs computer");
    String ch=sc.next();
    human p1;
    player p2;
    player cp;
    int matchnumber=1;
    switch(ch)
    {
        case "1":System.out.println("best of 3");
                p1=new human("Poojith", 'X');
                p2=new human("harry",'O');
                cp=p2;
                break;
        case "2":
            p1=new human("Poojith", 'X');
            p2=new computer();
            cp=p2;
            break;
        default :System.out.println("by default its human vs comp");
            p1=new human("Poojith", 'X');
            p2=new computer();
            cp=p2;
            break;
    }
        while(p1.score < 2 && p2.score < 2){
            System.out.println("Match number:"+matchnumber);
            System.out.println("---------------------------------------------------------------------------");
            tictactoe t=new tictactoe();
            t.displayBoard();
            do{
                System.out.println("------------------------------------"); 
                System.out.println(cp.name+" its ur turn");
                t.displayBoard();
                cp.getpos();
                if(tictactoe.checkWin()){
                    System.out.println(cp.name +" won");
                    cp.score++;
                    t.displayBoard();
                    p1.displayscore();
                    p2.displayscore();
                    if(cp==p1){
                        cp=p2;
                    }else{
                        cp=p1;
                    }
                    break;
                }else if(tictactoe.checkdraw()){
                    System.out.println("the game is draw");
                    t.displayBoard();
                    if(cp==p1){
                        cp=p2;
                    }else{
                        cp=p1;
                    }
                    break;
                }else{
                    if(cp==p1){
                        cp=p2;
                    }else{
                        cp=p1;
                    }
                }
            }while(true);
            matchnumber++;
        }
        if(p1.score>p2.score){
            System.out.println(p1.name+" won the bet");
        }else{
            System.out.println(p2.name+" won the bet");
        }
        
    }
}

