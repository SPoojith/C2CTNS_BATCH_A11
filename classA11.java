import java.util.Arrays;

public class classA11{
    private static final String sclass="A 11";
    public String toString(){
        return this.toString()+"\n"+"class : "+sclass;  
    }
    
    public static void main(String[] args) {
        student s1=new student(1, 22,"abhi");
        student s2=new student(2, 22,"aish");
        student s3=new student(3, 22,"rajeev");
        student s4=new student(4, 22,"shail");
        student s5=new student(5, 22,"yeshwanth");
        student s6=new student(6, 22,"poojith");
        student[] sarray={s1,s2,s3,s4,s5,s6};
        System.out.println(Arrays.toString(sarray));
        Arrays.sort(sarray);
        System.out.println(Arrays.toString(sarray));
    }

    
    
}
