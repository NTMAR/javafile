class XSXN {
     
       void Show(){
            System.out.println("Sai nath");
       }

       void Disp(){
             this.Show();
             System.out.println("University");
       }
        
}

class DisplayThree{
     public static void main(String []args){
       XSXN obj = new XSXN();
       obj.Show();
       obj.Disp();
     }
}