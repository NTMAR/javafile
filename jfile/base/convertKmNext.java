import java.io.*;
class convertKmNext{
    public static void main(String[] args)
    throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        double cm,m,km;
        System.out.println("Enter length in cm.");
        cm=Double.parseDouble(br.readLine());
        if(cm>=100){
            m=cm/100;
            if(m>=1000){
                km=m/1000;
                System.out.println(km+" km");
            }
            else{
                System.out.println(m+" m");
            }
        }

    }
}
