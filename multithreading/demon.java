package multithreading;
class demo implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            try{
                System.out.println(i);
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
           
        }
        
    }

}
class demodemon implements Runnable{
    @Override                               //even though it an infite loop its demon thread life is valid only till the other 
    public void run() {                     // thread is executing...   asume exclips as we are typing it will be main thread 
        for(;;){                               // auto save will be demon thread if typing is closed auto save should auto matically close 
            try{                                   //then we use demon thread
            System.out.println("saving");
            Thread.sleep(300);
        }catch(Exception e){
            e.printStackTrace();
        }
        }
        
    }

}
public class demon {
    public static void main(String[] args) {
        demo d1=new demo();
        demodemon d2=new demodemon();
        Thread t1=new Thread(d1);
        t1.setName("maindemo");
        Thread t2=new Thread(d2);
        t2.setName("demon");
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
    
}
