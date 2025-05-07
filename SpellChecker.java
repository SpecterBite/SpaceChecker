import java.util.Scanner;
public class Sentence {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
  
        long counterender = 0;
        long counterletters = 0;
        long counterspaces = 0;
        int i = 0;
        int treedot = 0;
        System.out.println("Please paste your paragraph here.");
        String para = scnr.nextLine();
        for (i = 0; i <= para.length() - 1; i++){
          char ender = para.charAt(i);
          counterletters++;
        if(ender == '.'){
              treedot++;
           
              if (treedot == 3){counterender = counterender - 2; treedot = 0;}
  
          counterender++;
        }
        else if (ender == '?' || ender == '!'){ treedot = 0; counterender++;}
        
        else if (ender == ' '){
            treedot = 0;
            counterspaces++;
            counterletters--;
        }
        else{

        }
        }
        
      //char ender = scnr.nextLine().charAt(0);
        System.out.println("Number of Sentences: " + counterender);
        System.out.println("Number of Letters: " + counterletters);
        System.out.println("Number of Spaces: " + counterspaces);
        System.out.println(System.currentTimeMillis());
    }

}
