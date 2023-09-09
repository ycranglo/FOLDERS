public class Pet {
  // declares: properties
  public int id;
  public String name = "";
  public String type = "";
  public String breed = "";
  public String color = "";
  public int age = 0;
  public String sex = "";
  public String ownerName = "";

  // overload: the default constructor for 3 parameters
  public Pet(int id, String name, String type) {
    this.id = id;
    this.name = name;
    this.type = type;
  }

  // overload: the default constructor for 4 parameters
  public Pet(int id, String name, String type, String breed) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.breed = breed;
  }

  // overload: the default constructor for 5 parameters
  public Pet(int id, String name, String type, String breed, String color) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.breed = breed;
    this.color = color;
  }

  // overload: the default constructor for 6 parameters
  public Pet(int id, String name, String type, String breed, String color, int age) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.breed = breed;
    this.color = color;
    this.age = age;
  }

  // overload: the default constructor for 7 parameters
  public Pet(int id, String name, String type, String breed, String color, int age, String sex) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.breed = breed;
    this.color = color;
    this.age = age;
    this.sex = sex;
  }

  // overload: the default constructor for 8 parameters
  public Pet(int id, String name, String type, String breed, String color, int age, String sex, String ownerName) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.breed = breed;
    this.color = color;
    this.age = age;
    this.sex = sex;
    this.ownerName = ownerName;
  }

  // prints: an object's different properties
  public void ShowDetails() {
    // prints: pet ID
    System.out.println("Pet ID: " + this.id);

    // prints: pet name
    System.out.println("Pet Name: " + this.name.toUpperCase());

    // prints: pet type
    System.out.println("Pet Type: " + this.type.toUpperCase());

    // checks: this pet object's breed if empty or not
    if(!this.breed.isBlank() && !this.breed.isEmpty())
      // prints: pet breed
      System.out.println("Pet Breed: " + this.breed.toUpperCase());

    // checks: this pet object's color if empty or not
    if(!this.color.isBlank() && !this.color.isEmpty())
      // prints: pet color
      System.out.println("Pet Color: " + this.color.toUpperCase());

    // checks: this pet object's age if empty or not
    if(this.age != 0 && this.age > 0)
      // prints: pet age
      System.out.println("Pet Age: " + this.age);

    // checks: this pet object's sex if empty or not
    if(!this.sex.isBlank() && !this.sex.isEmpty())
      // prints: pet sex
      System.out.println("Pet Sex: " + this.sex.toUpperCase());

    // checks: this pet object's owner name if empty or not
    if(!this.ownerName.isBlank() && !this.ownerName.isEmpty())
      // prints: pet owner
      System.out.println("Pet Owner: " + this.ownerName.toUpperCase());
  }
}
