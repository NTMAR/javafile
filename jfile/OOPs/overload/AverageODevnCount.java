import java.io.*;

class Nextx {
    int i, ev, od, z, coq;

    //@ overloading
    void Show(int arr[]) {
        System.out.println("_______"+"\nEven" + "\tOdd");
        for (i = 0; i < 5; i++) {
            if (arr[i] % 2 == 0) {
                ev += 1;
                System.out.println(arr[i]);
            } else {
                od += 1;
                System.out.println("\t" + arr[i]);
            }
        }
        System.out.println("Number of Even elements = " + ev + "\nNumber of Odd elements = " + od);
    }

    //@ overloading
    void Show(int arr[], int x) {
        z = 0;
        while (z < 5) {
            coq = coq + arr[z];
            z += 1;
        }
        System.out.println("Addation of all Elments = " + coq + "\nAverage = " + coq / 5);
    }

}

class AverageODevnCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Nextx net = new Nextx();
        int arr[] = new int[5];
        int z;
        z = 0;
        System.out.println("Enter 5 elements");
        do {
            arr[z] = Integer.parseInt(br.readLine());
            z += 1;
        } while (z < 5);
        net.Show(arr);
        net.Show(arr,z);
    }
}