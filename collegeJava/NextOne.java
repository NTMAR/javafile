class NextOne {

     NextOne(){
        System.out.println("It is You");
     }

     void Act(){
        System.out.println("It is Method");
     }

     public static void main(String []args) {
        NextOne net = new NextOne();
        net.Act();
     }
}