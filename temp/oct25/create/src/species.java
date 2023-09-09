public class species extends animal {
  //classfields of class species
  private String breed;
  private int age;
  private String name;
  //constructor of class species
  public species(String animalType,String species,String sex,String breed, int age,String name){
    super(animalType, species, sex);
    this.breed=breed;
    this.age=age;
    this.name=name;
  }
  //getters and setters
  public void setBreed(String breed){
    this.breed=breed;
  }
  public void setAge(int age){
    this.age=age;
  }
  public void setName(String name){
    this.name=name;
  }
  public String getBreed(){
    return this.breed;
  }
  public int getAge(){
    return this.age;
  }
  public String getName(){
    return this.name;
  }
  //method for displaying the array of species
  public void display(){
    System.out.println("---------------------------------------");
    System.out.println("ANIMAL TYPE :"+super.getAnimalType());
    System.out.println("SPECIES :"+super.getSpecies());
    System.out.println("GENDER :"+super.getSex());
    System.out.println("BREED :"+breed);
    System.out.println("AGE :"+age+" yrs old");
    System.out.println("NAME :"+name);
    System.out.println("---------------------------------------");
  }
}
