import java.io.*;

class jacMarksNext {
   public static void main(String[] args)
         throws IOException {
      InputStreamReader is = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(is);
      int Hindi = 0, English = 0, Maths = 0, Science = 0, SocialScience = 0;
      double ToTalMarks, PercenTage;
      System.out.println("\t\t\tEnter marks out of 100 marks");
      System.out.println("Enter the Marks of Hindi.");
      Hindi = Integer.parseInt(br.readLine());
      if (Hindi >= 0 && Hindi <= 100) {
         System.out.println("Enterd tha Marks of English.");
         English = Integer.parseInt(br.readLine());
         if (English <= 100 && English >= 0) {
            System.out.println("Enter The Marks Of Maths.");
            Maths = Integer.parseInt(br.readLine());
            if (Maths <= 100 && Maths >= 0) {
               System.out.println("Enter the Marks Of SocialScience.");
               SocialScience = Integer.parseInt(br.readLine());
               if (SocialScience <= 100 && SocialScience >= 0) {
                  System.out.println("Enter the Marks Of Sceince.");
                  Science = Integer.parseInt(br.readLine());
                  if (Science <= 100 && Science >= 0) {
                     ToTalMarks = Hindi + English + Maths + Science + SocialScience;
                     PercenTage = (ToTalMarks / 500) * 100;
                     if (PercenTage >= 33) {
                        if (PercenTage >= 45) {
                           if (PercenTage >= 60) {
                              if (PercenTage >= 75)
                                 System.out.println("Percantage=" + PercenTage + "%\nDistinction");
                              else
                                 System.out.println("Percentage=" + PercenTage + "%\n1st Division");
                           } else
                              System.out.println("Percentage=" + PercenTage + "%\n2nd Division");
                        } else
                           System.out.println("Percentage=" + PercenTage + "%\n3rd Division.");
                     } else
                        System.out.println("Percentage=" + PercenTage + "%\nYou are fail.");
                  } else
                     System.out.println("You Entered Wrong Marks Of Science.");
               } else
                  System.out.println("You Entered Wrong Marks Of SocialScience.");
            } else
               System.out.println("You Entered Wrong Marks Of Maths.");
         } else
            System.out.println("You Entered Wrong Marks Of English.");
      } else
         System.out.println("You Entered Wrong Marks Of Hindi.");

   }
}