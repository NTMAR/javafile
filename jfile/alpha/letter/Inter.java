interface pr{  
void put();  
}  

class A6 implements pr {  
public void put(){ 
    System.out.println("Hello");
    }  
}

class Inter{
 public static void main(String args[]){  
A6 obj = new A6();  
obj.put();  
 }  
}