public class animal {
  //classfields of the class animal
  private String animalType;
  private String sex;
  private String species;
    //constructor of animal
  public animal(String animalType,String species,String sex){
    this.animalType=animalType;
    this.species=species;
    this.sex=sex;
  }
  //getters and setters
  public void setName(String animalType){
    this.animalType=animalType;
  }
  public void setAge(String sex){
    this.sex=sex;
  }
  public void setSpecies(String species){
    this.species=species;
  }
  public String getAnimalType(){
    return this.animalType;
  }
  public String getSpecies(){
    return this.species;
  }
  public String getSex(){
    return this.sex;
  }
}
