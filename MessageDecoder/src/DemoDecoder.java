import java.util.Scanner;
public class DemoDecoder {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int choice;
	String text;
     int numberOfChange;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter text to be decode: ");
      text = input.nextLine();
      String decodedMsg = "";

          System.out.println("\n\n1.Substitution Cipher");
          System.out.println("2.Shuffle Cipher");
          System.out.println("3.Exit");

          do {
              System.out.print("Enter your choise: ");
              choice = input.nextInt();
              input.nextLine();

              if (choice == 3)
                  System.exit(0);

          } while (choice > 3 || choice < 1);

      switch (choice) {
      case 1: // using substitution cipher
          System.out.print("Enter shift value: ");
          numberOfChange = input.nextInt();
          input.nextLine();
          SubstitutionCipher subtitution = new SubstitutionCipher(numberOfChange);
          decodedMsg = subtitution.decode(text);
          System.out.println("Decoded Message: " + decodedMsg);
          break;
      case 2: // using shuffle cipher
          System.out.print("Enter number of shuffles: ");
          numberOfChange = input.nextInt();
          input.nextLine();
          ShuffleCipher shuffler = new ShuffleCipher(numberOfChange);
          decodedMsg = shuffler.decode(text);
          System.out.println("Actual Message: " + decodedMsg);
          break;
      } // inner switch to choose cipher type
	}
	}
