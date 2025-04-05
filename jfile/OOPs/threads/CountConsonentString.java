import java.io.*;

class CountConsonentString {
   public static void main(String [] args) throws IOException {
       int vowel = 0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       char vow[] = {'a','e','i','o','u','A','E','I','O','U'};
       System.out.println("Enter your name");
       String sc = br.readLine();
      try{
       for(int i = 0; i < sc.length(); i++){
          for(int k = 0; k < 10; k++){
              if(sc.charAt(i) == vow[k])
                vowel++;
          }
       }
       } catch (Exception e){}
      System.out.println("Vowels are "+vowel);
      System.out.println("Consonent are "+(sc.length() - vowel));
   }
}
// charAt() is method that return index of String.