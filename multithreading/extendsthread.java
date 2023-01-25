package multithreading;
class numberprint extends Thread{
    public void run(){
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
class charprint extends Thread{
    public void run(){
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
}

public class extendsthread {
    static void printcharacter(){
        System.out.println("character printing started");
            for(int i=97;i<123;i++){
                try{
                System.out.println((char)i);
                Thread.sleep(500);
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            System.out.println("character printing ended");
    }
     static void printnumber(){
        System.out.println("number printing");
        for(int i=100;i<=110;i++){
            try{
            System.out.println("  "+i);
            Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("number printing ended");
    }
    public static void main(String[] args) {
        Long start=System.currentTimeMillis();
        System.out.println("sequential execution");
        extendsthread.printcharacter();
        extendsthread.printnumber();
        System.out.println("sequential execution completed it took "+(System.currentTimeMillis()-start)+" milliseconds");
        Long cstart=System.currentTimeMillis();
        System.out.println("concurent execution");
        numberprint np=new numberprint();
        np.start();
        charprint cp=new charprint();
        cp.start();
        System.out.println("concurent execution completed it took "+(System.currentTimeMillis()-cstart)+" milliseconds");
    }

    
}
