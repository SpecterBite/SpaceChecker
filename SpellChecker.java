import java.util.Scanner;
public class SpellChecker {

    public static void main(String[] args) {
            File file = new File(args[0]); // Pretty much makes it so you pass the file the program will read
      FileReader reader = new FileReader(args[0]);
      Scanner scnr = new Scanner(reader);         // Actually reads said file
     
      long counterender = 0; 
      long counterletters = 0;
      long counterspaces = 0;
      int i = 0, treedot = 0, kiwi = 0;
      // Counts special characters in the file
      String q = scnr.next();
      while (scnr.hasNext()){ 
        q = scnr.next();
      System.out.print(q +" ");
      kiwi++;
      System.out.println(kiwi);
      } // Tracks total letters
      
      System.out.println(kiwi);
        System.exit(0);

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
