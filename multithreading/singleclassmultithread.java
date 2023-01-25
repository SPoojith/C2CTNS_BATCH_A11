package multithreading;
class demo extends Thread{
    public void run(){
        if(Thread.currentThread().getName()=="number"){
            printnumber();   
        }else{
            charprint();
        }
    }
    void printnumber(){
        System.out.println("number printing");
        for(int i=1;i<=10;i++){
            try{
            System.out.println("  "+i);
            Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("number printing ended");
    }
    void charprint(){
        System.out.println("character printing started");
        for(int i=65;i<91;i++){
            try{
            System.out.println((char)i);
            Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("character printing ended");
    }
}

public class singleclassmultithread {
    public static void main(String[] args) {
        demo d1=new demo();
        demo d2=new demo();
        Thread t1=new Thread(d1);
        t1.setName("number");
        Thread t2=new Thread(d2);
        t2.setName("charater");
        t1.start();
        t2.start();

    }
    
}
