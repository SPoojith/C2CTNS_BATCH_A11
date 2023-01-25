package multithreading;

class resource extends Thread{
    String mint="topper";
    public void run(){
        if(Thread.currentThread().getName()=="t1"){
            print();
        }else{
            write();
        }
    }
    void print(){
        synchronized(mint){
            System.out.println(mint+"is locked by t1");
            try {
                Thread.sleep(5000);
                System.out.println(mint+"is realized");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    void write(){
        synchronized(mint){
            System.out.println(mint+"is locked by t2 and changed to ");
            mint="super topper";
            try {
                //System.out.println(mint);
                Thread.sleep(5000);
                System.out.println(mint+" and t2 realized the lock");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class synkvariable {
    public static void main(String[] args) {
        resource r1=new resource();
        r1.setName("t1");
        resource r2=new resource();
        r2.setName("jkj");
        r1.start();
        r2.start();
          
    }
    


}
