package multithreading;
class pri implements Runnable{

    @Override
     public void run() {
        try{
       String s=Thread.currentThread().getName();
       System.out.println(s+" started printing");
       Thread.sleep(1000);
       synchronized(this)
       {
            System.out.println(s+"is printing");
            Thread.sleep(1000);
            System.out.println(s+"is printing");
            Thread.sleep(1000);
            System.out.println(s+"is printing");
            Thread.sleep(1000);
            System.out.println(s+"has finished printing");
            Thread.sleep(1000);
        }
        }catch(Exception e){
            e.printStackTrace();
        }        
    }

}

public class synk {
    public static void main(String[] args) {
        System.out.println("Main printer is on");
        pri p=new pri();
        Thread t1=new Thread(p);
        t1.setName("ashi");
        Thread t2=new Thread(p);
        t2.setName("mint");
        Thread t3=new Thread(p);
        t3.setName("valka");
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("main printer is empty truning off");
        
    }
    
}
