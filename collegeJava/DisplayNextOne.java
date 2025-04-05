class XSXN {
     
       XSXN(){
            this(20);
            System.out.println("Sai nath");
       }

       XSXN(int x){
             System.out.println(x);
       }
        
}

class DisplayNextOne{
     public static void main(String []args){
       XSXN obj = new XSXN();
     }
}