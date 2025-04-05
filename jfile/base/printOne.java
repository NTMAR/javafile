class printOne {
    public static void main(String[] args) {
        int i;
        i = 2;
        
        System.out.println(""+"-------------------");
        while (i <= 10) {
            System.out.print("1/"+i);
            if (i <= 9)
                System.out.print(""+"+");
            i = i + 1;
        }
        System.out.print(""+"\n");
        System.out.print(""+"-------------------");

    }
}
