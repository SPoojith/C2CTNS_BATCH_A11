package multithreading;

class charprinting implements Runnable{
    void charq()
    {
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
        public void run(){
        charq();
        }
}

class numberprinting implements Runnable{
    void number(){
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
    public void run(){
        number();
        }
}

public class implementsrunnable {
    public static void main(String[] args) {
    charprinting c=new charprinting();
    Thread t1=new Thread(c);
    t1.start();
    
    numberprinting n=new numberprinting();
    Thread t2=new Thread(n);
    t2.start();
    }

    
}
