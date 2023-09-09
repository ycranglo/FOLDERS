
public class main {

  public static void main(String args[]){

    //initializing the array for species
    species speciesArray[]= new species[5];
    //declaring the content of the species by thier index
    speciesArray[0]= new species("Dog", "Mammal", "male", "Bulldog", 9, "faye");
    speciesArray[1]= new species("Cat", "Mammal", "Female", "Sphynx", 4, "yeonjin");
    speciesArray[2]= new species("Frog", "Amphibians", "Femaale", "Golden Poison Frog", 5, "thea");
    speciesArray[3]= new species("Snake", "Reptile", "male", "Pythons", 2, "josh");
    speciesArray[4]= new species("Fish", "Fish", "Female", "Tilapya", 9, "faye");

    // a for each loop for displaying the content
    for(species species : speciesArray) {
      //displaying each content
      species.display();
    }
  }
}

