class student implements Comparable<student>{
    private int sid;
    private int age;
    private String name;
    private static String school="TNS C2C";

    
    public student(int sid, int age, String name) {
        this.sid = sid;
        this.age = age;
        this.name = name;
    }

    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    public String toString(){
        return "Student details :\n"+
        "sid :"+this.getSid()+"  "+
        "name :"+this.getName()+"  "+
        "age :"+this.getAge()+"  "+
        "school :"+school+"\n\n"; 

    }

    public static String getSchool() {
        return school;
    }

    @Override
    public int compareTo(student o) {
       student s1=this;
       student s2=o;
        if(s1.getName().compareTo(s2.getName()) == 0){
            if(Integer.compare(s1.getAge(), s2.getAge()) == 0){
                return Integer.compare(s1.getSid(), s2.getSid());
            }else{
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        }else{
            return s1.getName().compareTo(s2.getName());
        }
    }

}
