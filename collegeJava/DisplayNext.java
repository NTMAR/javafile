class XSXN {
     
       XSXN(){
            System.out.println("Sai nath");
       }

       XSXN(int x){
           this();
           System.out.println(x);
       }
        
}

class DisplayNext{
     public static void main(String []args){
       XSXN obj = new XSXN(20);
     }
}