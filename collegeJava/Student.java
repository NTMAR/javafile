class Student{

    private int id;
    private String name;
    private float marks;

    Student(int id,String name,float marks){
       id = id;
       name = name;
       marks = marks;
    }
    
    void Display(){
      System.out.println("id="+id+"\nname="+name+"\nmarks="+marks);
    }

    public static void main(String []args) {
       Student obj  = new Student(01,"Nitish",33);
       obj.Display();
    }
}