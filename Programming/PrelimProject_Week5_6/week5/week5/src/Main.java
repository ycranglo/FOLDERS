import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  // Declarations for variables and instances needed for crucial processes
  public static Pet userPet;
  public static int petID = 1;
  public static String petName = "";
  public static String petType = "";
  public static String petBreed = "";
  public static String petColor = "";
  public static int petAge = 0;
  public static String petSex = "";
  public static String petOwnerName = "";
  public static String petRecords = "";

  public static BufferedReader inputGetter = new BufferedReader(new InputStreamReader(System.in));
  public static byte userInput = 0;
  public static Date date = new Date();
  public static SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
  public static Timestamp timestamp = new Timestamp(System.currentTimeMillis());

  public static void main(String[] args) throws IOException {
    // handles: potential errors (empty input, new line, etc.)
    try {
      // prints: informational messages
      System.out.println("WELCOME TO FURS LOUNGE!");
      System.out.println("All animals deserved to be loved.");
      System.out.println(new Timestamp(date.getTime()) + " GMT+8 Philippine Standard Time");
      System.out.println("Copyright (c) 2022 Furs Lounge Ltd. All rights reserved.\n");

      // prompts: as long as userInput is equal to 1
      do {
        // prints: a menu for users to choose an operation
        System.out.println("OPERATIONS");
        System.out.println("1: NEW PET INFORMATION");
        System.out.println("2: EXIT\n");

        // prompts: users to choose an operation
        System.out.print("[" + simpleDate.format(timestamp) + "]" + " Please select an operation $ ");
        userInput = Byte.parseByte(inputGetter.readLine());

        if (userInput == 1) {
          // prompts: a menu for users to choose what set of pet information to enter
          System.out.println("\n1: PET NAME, PET TYPE (DOG OR CAT)");
          System.out.println("2: PET NAME, PET TYPE (DOG OR CAT), BREED");
          System.out.println("3: PET NAME, PET TYPE (DOG OR CAT), BREED, COLOR");
          System.out.println("4: PET NAME, PET TYPE (DOG OR CAT), BREED, COLOR, AGE");
          System.out.println("5: PET NAME, PET TYPE (DOG OR CAT), BREED, COLOR, AGE, SEX");
          System.out.println("6: PET NAME, PET TYPE (DOG OR CAT), BREED, COLOR, AGE, SEX, OWNER NAME\n");

          // prompts: users to choose a set
          System.out.print("[" + simpleDate.format(timestamp) + "]" + " Please select the data to be inserted $ ");
          userInput = Byte.parseByte(inputGetter.readLine());

          // checks: if userInput equals to 1
          if (userInput == 1) {
            System.out.println("");
               // prompts: user to enter the pet name as long as it's empty, blank or contain invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Name (Alphabet characters only) $ ");
              petName = inputGetter.readLine();
            } while (petName.isEmpty() || petName.isBlank() || petName.matches(".*[0-9].*"));
               // prompts: user to enter the pet type as long as it's empty, blank or contain invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Type (Alphabet characters (Dog/Cat)) $ ");
              petType = inputGetter.readLine();
            } while (!petType.equalsIgnoreCase("DOG") && !petType.equalsIgnoreCase("CAT") || petType.matches(".*[0-9].*"));

            userPet = new Pet(petID, petName, petType);
             // stores: every pet record on every transaction
            petRecords += "Pet ID: " + petID + "\n" +
              "Pet Name: " + petName.toUpperCase() + "\n" +
              "Pet Type: " + petType.toUpperCase() + "\n" +
              "------------------\n";
            // calls: displaySummary method
            Main.displaySummary(userPet);
            // calls: changeFields method
            Main.changeFields();
              // checks: if userInput equals to 2
          } else if (userInput == 2) {
            System.out.println("");
              // prompts: user to enter the pet name as long as it's empty, blank or contain invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Name (Alphabet characters only) $ ");
              petName = inputGetter.readLine();
            } while (petName.isEmpty() || petName.isBlank() || petName.matches(".*[0-9].*"));

              // prompts: user to enter the pet type as long as it's empty, blank or contain invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Type (Alphabet characters (Dog/Cat)) $ ");
              petType = inputGetter.readLine();
            } while (!petType.equalsIgnoreCase("DOG") && !petType.equalsIgnoreCase("CAT") || petType.matches(".*[0-9].*"));

              // prompts: user to enter the pet breed as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Breed (Alphabet characters only) $ ");
              petBreed = inputGetter.readLine();
            } while (petBreed.isEmpty() || petBreed.isBlank() || petBreed.matches(".*[0-9].*"));

            userPet = new Pet(petID, petName, petType, petBreed);

              // stores: every pet record on every transaction
            petRecords += "Pet ID: " + petID + "\n" +
              "Pet Name: " + petName.toUpperCase() + "\n" +
              "Pet Type: " + petType.toUpperCase() + "\n" +
              "Pet Breed: " + petBreed.toUpperCase() + "\n" +
              "------------------\n";

              // calls: displaySummary method
            Main.displaySummary(userPet);
             // calls: changeFields method
            Main.changeFields();
              // checks: if userInput equals to 3
          } else if (userInput == 3) {
            System.out.println("");
              // prompts: user to enter the pet name as long as it's empty, blank or contain invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Name (Alphabet characters only) $ ");
              petName = inputGetter.readLine();
            } while (petName.isEmpty() || petName.isBlank() || petName.matches(".*[0-9].*"));
            // prompts: user to enter the pet type as long as it's empty, blank or contain invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Type (Alphabet characters (Dog/Cat)) $ ");
              petType = inputGetter.readLine();
            } while (!petType.equalsIgnoreCase("DOG") && !petType.equalsIgnoreCase("CAT") || petType.matches(".*[0-9].*"));
             // prompts: user to enter the pet breed as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Breed (Alphabet characters only) $ ");
              petBreed = inputGetter.readLine();
            } while (petBreed.isEmpty() || petBreed.isBlank() || petBreed.matches(".*[0-9].*"));
            // prompts: user to enter the pet color as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Color (Alphabet characters only) $ ");
              petColor = inputGetter.readLine();
            } while (petColor.isEmpty() || petColor.isBlank() || petColor.matches(".*[0-9].*"));

              // stores: every pet record on every transaction
            petRecords += "Pet ID: " + petID + "\n" +
              "Pet Name: " + petName.toUpperCase() + "\n" +
              "Pet Type: " + petType.toUpperCase() + "\n" +
              "Pet Breed: " + petBreed.toUpperCase() + "\n" +
              "Pet Color: " + petColor.toUpperCase() + "\n" +
                "------------------\n";
              
            userPet = new Pet(petID, petName, petType, petBreed, petColor);
            
            // calls: displaySummary method
            Main.displaySummary(userPet);
             // calls: changeFields method
            Main.changeFields();
              // checks: if userInput equals to 4
          } else if (userInput == 4) {
            System.out.println("");
             // prompts: user to enter the pet name as long as it's empty, blank or contain invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Name (Alphabet characters only) $ ");
              petName = inputGetter.readLine();
            } while (petName.isEmpty() || petName.isBlank() || petName.matches(".*[0-9].*"));
             // prompts: user to enter the pet type as long as it's empty, blank or contain invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Type (Alphabet characters (Dog/Cat)) $ ");
              petType = inputGetter.readLine();
            } while (!petType.equalsIgnoreCase("DOG") && !petType.equalsIgnoreCase("CAT") || petType.matches(".*[0-9].*"));
             // prompts: user to enter the pet breed as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Breed (Alphabet characters only) $ ");
              petBreed = inputGetter.readLine();
            } while (petBreed.isEmpty() || petBreed.isBlank() || petBreed.matches(".*[0-9].*"));
            // prompts: user to enter the pet color as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Color (Alphabet characters only) $ ");
              petColor = inputGetter.readLine();
            } while (petColor.isEmpty() || petColor.isBlank() || petColor.matches(".*[0-9].*"));
            // prompts: user to enter the pet age as long as it's less than 0
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Age (Numerical characters only) $ ");
              petAge = Integer.parseInt(inputGetter.readLine());
            } while (petAge < 0);

            userPet = new Pet(petID, petName, petType, petBreed, petColor, petAge);
                // stores: every pet record on every transaction
            petRecords += "Pet ID: " + petID + "\n" +
              "Pet Name: " + petName.toUpperCase() + "\n" +
              "Pet Type: " + petType.toUpperCase() + "\n" +
              "Pet Breed: " + petBreed.toUpperCase() + "\n" +
              "Pet Color: " + petColor.toUpperCase() + "\n" +
              "Pet Age: " + petAge + "\n" +
              "------------------\n";
             // calls: displaySummary method
            Main.displaySummary(userPet);
            // calls: changeFields method
            Main.changeFields();
              // checks: if userInput equals to 5
          } else if (userInput == 5) {
            System.out.println("");
             // prompts: user to enter the pet name as long as it's empty, blank or contain invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Name (Alphabet characters only) $ ");
              petName = inputGetter.readLine();
            } while (petName.isEmpty() || petName.isBlank() || petName.matches(".*[0-9].*"));
              // prompts: user to enter the pet type as long as it's empty, blank or contain invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Type (Alphabet characters (Dog/Cat)) $ ");
              petType = inputGetter.readLine();
            } while (!petType.equalsIgnoreCase("DOG") && !petType.equalsIgnoreCase("CAT") || petType.matches(".*[0-9].*"));
              // prompts: user to enter the pet breed as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Breed (Alphabet characters only) $ ");
              petBreed = inputGetter.readLine();
            } while (petBreed.isEmpty() || petBreed.isBlank() || petBreed.matches(".*[0-9].*"));
              // prompts: user to enter the pet color as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Color (Alphabet characters only) $ ");
              petColor = inputGetter.readLine();
            } while (petColor.isEmpty() || petColor.isBlank() || petColor.matches(".*[0-9].*"));
              // prompts: user to enter the pet age as long as it's less than 0
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Age (Numerical characters only) $ ");
              petAge = Integer.parseInt(inputGetter.readLine());
            } while (petAge < 0);
            // prompts: user to enter the pet sex as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Sex (Alphabet characters only) $ ");
              petSex = inputGetter.readLine();
            } while (petSex.isEmpty() || petSex.isBlank() || petSex.matches(".*[0-9].*"));

            userPet = new Pet(petID, petName, petType, petBreed, petColor, petAge, petSex);
             // stores: every pet record on every transaction
            petRecords += "Pet ID: " + petID + "\n" +
              "Pet Name: " + petName.toUpperCase() + "\n" +
              "Pet Type: " + petType.toUpperCase() + "\n" +
              "Pet Breed: " + petBreed.toUpperCase() + "\n" +
              "Pet Color: " + petColor.toUpperCase() + "\n" +
              "Pet Age: " + petAge + "\n" +
              "Pet Sex: " + petSex.toUpperCase() + "\n" +
              "------------------\n";
               // calls: displaySummary method
            Main.displaySummary(userPet);
                // calls: changeFields method
            Main.changeFields();

            // checks: if userInput equals to 6
          } else if (userInput == 6) {
            System.out.println("");

            // prompts: user to enter the pet name as long as it's empty, blank or contain invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Name (Alphabet characters only) $ ");
              petName = inputGetter.readLine();
            } while (petName.isEmpty() || petName.isBlank() || petName.matches(".*[0-9].*"));

            // prompts: user to enter the pet type as long as it's empty, blank or contain invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Type (Alphabet characters (Dog/Cat)) $ ");
              petType = inputGetter.readLine();
            } while (!petType.equalsIgnoreCase("DOG") && !petType.equalsIgnoreCase("CAT") || petType.matches(".*[0-9].*"));

            // prompts: user to enter the pet breed as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Breed (Alphabet characters only) $ ");
              petBreed = inputGetter.readLine();
            } while (petBreed.isEmpty() || petBreed.isBlank() || petBreed.matches(".*[0-9].*"));

            // prompts: user to enter the pet color as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Color (Alphabet characters only) $ ");
              petColor = inputGetter.readLine();
            } while (petColor.isEmpty() || petColor.isBlank() || petColor.matches(".*[0-9].*"));

            // prompts: user to enter the pet age as long as it's less than 0
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Age (Numerical characters only) $ ");
              petAge = Integer.parseInt(inputGetter.readLine());
            } while (petAge < 0);

            // prompts: user to enter the pet sex as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Sex (Alphabet characters only) $ ");
              petSex = inputGetter.readLine();
            } while (petSex.isEmpty() || petSex.isBlank() || petSex.matches(".*[0-9].*"));

            // prompts: user to enter the pet owner name as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Owner Name (Alphabet character only) $ ");
              petOwnerName = inputGetter.readLine();
            } while (petOwnerName.isEmpty() || petOwnerName.isBlank() || petOwnerName.matches(".*[0-9].*"));

            // instantiates: a new pet object
            userPet = new Pet(petID, petName, petType, petBreed, petColor, petAge, petSex, petOwnerName);

            // stores: every pet record on every transaction
            petRecords += "Pet ID: " + petID + "\n" +
              "Pet Name: " + petName.toUpperCase() + "\n" +
              "Pet Type: " + petType.toUpperCase() + "\n" +
              "Pet Breed: " + petBreed.toUpperCase() + "\n" +
              "Pet Color: " + petColor.toUpperCase() + "\n" +
              "Pet Age: " + petAge + "\n" +
              "Pet Sex: " + petSex.toUpperCase() + "\n" +
              "Pet Owner Name: " + petOwnerName.toUpperCase() + "\n" +
              "------------------\n";

            // calls: displaySummary method
            Main.displaySummary(userPet);

            // calls: changeFields method
            Main.changeFields();
          }
          // calls: displayMessage method with a specific message
          else
            displayMessage("Invalid choice.");
          // calls: displayMessage method with a specific message
        } else if (userInput == 2)
          displayMessage("Exit successfully.");
        // calls: displayMessage method with a specific message
        else
          displayMessage("Invalid choice.");
      } while (userInput != 2);
      // calls: displayMessage method with a specific message
    } catch (Exception error) {
      displayMessage("Invalid character. Restart application.");
    }
  }

  // displays: list of every pet information entered on every transaction
  public static void displaySummary(Pet newPetRecord) {
    // prints: a successful message
    System.out.println("\nNew pet record was added successfully.");

    // prints: a successful message for entered pet name
    System.out.println("- Added pet name");

    // prints: a successful message for entered pet type
    System.out.println("- Added pet type");

    // checks: a pet's breed if emtpy or not
    if (newPetRecord.breed.length() > 0)
      // prints: a successful message for entered pet breed
      System.out.println("- Added pet breed");

    // checks: a pet's color if emtpy or not
    if (newPetRecord.color.length() > 0)
      // prints: a successful message for entered pet color
      System.out.println("- Added pet color");

    // checks: a pet's age if emtpy or not
    if (newPetRecord.age > 0)
      // prints: a successful message for entered pet age
      System.out.println("- Added pet age");

    // checks: a pet's sex if emtpy or not
    if (newPetRecord.sex.length() > 0)
      // prints: a successful message for entered pet sex
      System.out.println("- Added pet sex");

    // checks: a pet's owner name if emtpy or not
    if (newPetRecord.ownerName.length() > 0)
      // prints: a successful message for entered pet owner name
      System.out.println("- Added pet owner name");

    System.out.println("\nNEW PET RECORD");

    // calls: ShowDetails() method of a new pet object
    newPetRecord.ShowDetails();

    System.out.println("\nPET RECORDS");

    // prints: all entered pet records
    System.out.println(Main.petRecords);
  }

  // changes: variables in relation to the main functionalities
  public static void changeFields() {
    // reset: this variable
    Main.userInput = 0;

    // increment: this variable
    Main.petID++;

    // reset: this variable
    Main.petName = null;

    // reset: this variable
    Main.petType = null;

    // checks: a pet's breed if emtpy or not
    if (Main.petBreed.length() > 0)
      // reset: this variable
      Main.petBreed = null;

    // checks: a pet's color if emtpy or not
    if (Main.petColor.length() > 0)
      // reset: this variable
      Main.petColor = null;

    // checks: a pet's age if emtpy or not
    if (Main.petAge > 0)
      // reset: this variable
      Main.petAge = 0;

    // checks: a pet's sex if emtpy or not
    if (Main.petSex.length() > 0)
      // reset: this variable
      Main.petSex = null;

    // checks: a pet's owner name if emtpy or not
    if (Main.petOwnerName.length() > 0)
      // reset: this variable
      Main.petOwnerName = null;
  }

  // prints: a passed message
  public static void displayMessage(String message) {
    System.out.println("\n" + "Error: " + message + "\n");
  }
}
