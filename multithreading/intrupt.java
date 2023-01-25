package multithreading;

class demooi extends Thread{
public void run(){
    System.out.println("demo thread started execution");
    try{
    for(int i=0;i<20;i++){
            System.out.println("still here"+i);
            Thread.sleep(1000);
            if(i==5){
                Thread.currentThread().interrupt();//.stop()//.suspend(); // at some condition u want to stop the thread use intrupt to kill at sleep ,use stop to simple exit and suspend just simple pauses the thread
            }
    }
    }catch(Exception e){
            e.printStackTrace();
        }
    System.out.println("demo thread ended execution");
}
}

public class intrupt {
    public static void main(String[] args) {
        demooi d=new demooi();
        d.start();

    }
}
