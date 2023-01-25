package exception;     //throw throws finally try catch
class exception extends Exception {
    public String getMessage(){
        return "this is a custom exception message";    
    }
    static void te() throws exception{
        System.out.println("custom exception invoked");
        exception e=new exception();
            throw e;
        
    }
}
class main{
    public static void main(String[] args) throws Exception{
        try{
            System.out.println("hi");
            exception.te();
            // we can use line 7 and 8 here only but if we do so it gives error unreable 
            //line so i used te() which in trun throw ecpention
            System.out.println("after exception this line will not be printed");
        }catch(ArithmeticException |NullPointerException  n){
            System.out.println("exception occured, it will be fine no worries");
            System.out.println(n);
        }
        catch(Exception e){
            System.out.println("i am the default exption handler");
            e.printStackTrace();
        }
        finally{
            System.out.println("no matter what i will printed");
        }
    }
}