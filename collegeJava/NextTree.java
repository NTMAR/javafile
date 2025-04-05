class NextTree {

    NextTree(int j){
       System.out.println(j);
    }

    void Act(){
       System.out.println("It is Method");
    }

    public static void main(String []args) {
       NextTree net = new NextTree(10);
       net.Act();
    }
}