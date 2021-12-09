package example.findChar;

import java.util.Scanner;

public class FindLetter {
   public void detectChar(){
       Scanner scanner = new Scanner(System.in);
       char [] charArr = new char[10];
       for (int i = 0; i < charArr.length; i++) {
           charArr[i] = scanner.nextLine().charAt(0);
       }
       for (int i = 0; i < charArr.length; i++) {
           if(charArr[i] == 'a' ||charArr[i] == 'e' ||charArr[i] == 'i' ||charArr[i] == 'o'||charArr[i] == 'u' ||charArr[i] == 'y'){
               System.out.println(charArr[i] + " - este vocala");
           } else {
               System.out.println(charArr[i] + " - este consoana");
           }
       }
   }


}
