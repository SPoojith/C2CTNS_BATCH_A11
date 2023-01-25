package multithreading;

class demoo extends Thread{
public void run(){
    System.out.println("demo thread started execution");
    for(int i=0;i<20;i++){
        try{
            System.out.println("still here");
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    System.out.println("demo thread ended execution");
}
}

public class jointhread {
    public static void main(String[] args) {
        System.out.println("main execute");
        demoo d1=new demoo();
        d1.start();
        try{
            d1.join();          //join() is used to make the current thread to wait till the complete execution of child thread 
        }catch(Exception e){       // just comment the line 24 and see the difference
            e.printStackTrace();
        }
        System.out.println("main completed execution");
    }
    
}
