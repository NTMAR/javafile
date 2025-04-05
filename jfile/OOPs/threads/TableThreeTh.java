import java.io.*;

class TableThreeTh extends Thread {
    int no, i;

    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number:");
        no = Integer.parseInt(br.readLine());
    }

     public void run(){
        for (i = 1; i <= 10; i++) {
            try {
                Thread.sleep(300);
                System.out.println(no + "x" + i + "=" + no * i);
            } catch (InterruptedException ae) {
            }
        }
    }

    public static void main(String[] args) throws IOException {
        TableThreeTh table = new TableThreeTh();
        TableThreeTh tableOne = new TableThreeTh();
        TableThreeTh tableTwo = new TableThreeTh();
        System.out.println("Thread name is " + table.getName());
        table.input();
        table.start();
        try{
        table.join(5000);
        } catch(Exception e){}
        System.out.println("\nThread name is " + tableOne.getName());
        tableOne.input();
        tableOne.start();
        try{
            tableOne.join(5000);
            } catch(Exception e){}
        System.out.println("\nThread name is " + tableTwo.getName());
        tableTwo.input();
        tableTwo.start();
    }
}