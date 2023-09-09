public class extra {
  
  System.out.println("");

            // prompts: user to enter the pet name as long as it's empty, blank or contain invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Name (Alphabet characters only) $ ");
              userPet.name = inputGetter.readLine();
            } while (userPet.name.isEmpty() || userPet.name.isBlank() || userPet.name.matches(".*[0-9].*"));

            // prompts: user to enter the pet type as long as it's empty, blank or contain invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Type (Alphabet characters (Dog/Cat)) $ ");
              userPet.type = inputGetter.readLine();
            } while (!userPet.type.equalsIgnoreCase("DOG") && !userPet.type.equalsIgnoreCase("CAT") || userPet.type.matches(".*[0-9].*"));

            // prompts: user to enter the pet breed as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Breed (Alphabet characters only) $ ");
              userPet.breed = inputGetter.readLine();
            } while (userPet.breed.isEmpty() || userPet.breed.isBlank() || userPet.breed.matches(".*[0-9].*"));

            // prompts: user to enter the pet color as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Color (Alphabet characters only) $ ");
              userPet.color = inputGetter.readLine();
            } while (userPet.color.isEmpty() || userPet.color.isBlank() || userPet.color.matches(".*[0-9].*"));

            // prompts: user to enter the pet age as long as it's less than 0
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Age (Numerical characters only) $ ");
              userPet.age = Integer.parseInt(inputGetter.readLine());
            } while (userPet.age < 0);

            // prompts: user to enter the pet sex as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Sex (Alphabet characters only) $ ");
              userPet.sex = inputGetter.readLine();
            } while (userPet.sex.isEmpty() || userPet.sex.isBlank() || userPet.sex.matches(".*[0-9].*"));

            // prompts: user to enter the pet owner name as long as it's empty, blank or contains invalid inputs
            do {
              System.out.print("[" + simpleDate.format(timestamp) + "]" + " Pet Owner Name (Alphabet character only) $ ");
              userPet.ownerName = inputGetter.readLine();
            } while (userPet.ownerName.isEmpty() || userPet.ownerName.isBlank() || userPet.ownerName.matches(".*[0-9].*"));

            // stores: every pet record on every transaction
            petRecords += "Pet ID: " + petID + "\n" +
              "Pet Name: " + userPet.name.toUpperCase() + "\n" +
              "Pet Type: " + userPet.type.toUpperCase() + "\n" +
              "Pet Breed: " + userPet.breed.toUpperCase() + "\n" +
              "Pet Color: " + userPet.color.toUpperCase() + "\n" +
              "Pet Age: " + userPet.age + "\n" +
              "Pet Sex: " + userPet.sex.toUpperCase() + "\n" +
              "Pet Owner Name: " + userPet.ownerName.toUpperCase() + "\n" +
              "------------------\n";

            // calls: displaySummary method
            Main.displaySummary(userPet);

            // calls: changeFields method
            Main.changeFields();
}
