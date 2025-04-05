import java.io.*;

class Take {
    int arr[] = new int[5];

    void Input() throws IOException {
        arr = new int[5];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (i < 5) {
            System.out.println("Enter " + (i + 1) + " element");
            arr[i] = Integer.parseInt(br.readLine());
            i += 1;
        }
    }
}

class Act extends Take {
    int k;

    void call() {
        k = 1;
        do {
            arr[0] += arr[k];
            k += 1;
        } while (k < 5);
        System.out.println("Sum is " + arr[0]);
    }
}

class ArrayAdd {
    public static void main(String[] arc) throws IOException {
        Act vet = new Act();
        vet.Input();
        vet.call();
    }
}
