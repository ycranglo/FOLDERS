import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    
    List<Dad> listDad= new ArrayList<Dad>();
    List<Mom> listMom= new ArrayList<Mom>();

    listDad.add( new Dad("rommel", "octaviano", 20, "softDev", "computer", 40000));
    listDad.add( new Dad("rommel1", "octaviano", 20, "softDev", "computer", 40000));
    listDad.add( new Dad("rommel2", "octaviano", 20, "softDev", "computer", 40000));
    listDad.add( new Dad("rommel3", "octaviano", 20, "softDev", "computer", 40000));
    listDad.add( new Dad("rommel4", "octaviano", 20, "softDev", "computer", 40000));

    listMom.add(new Mom("yvenne", "santos", 21, "laba", 5.8, 2));
    listMom.add(new Mom("yvenne1", "santos", 21, "laba", 5.8, 2));
    listMom.add(new Mom("yvenne2", "santos", 21, "laba", 5.8, 2));
    listMom.add(new Mom("yvenne3", "santos", 21, "laba", 5.8, 2));
    listMom.add(new Mom("yvenne4", "santos", 21, "laba", 5.8, 2));
    listMom.add(new Mom("yvenne5", "santos", 21, "laba", 5.8, 2));

    for(Dad objDad:listDad){
      objDad.printDetails();
    }
    System.out.println();
    for(Mom objMom:listMom){
      objMom.printDetails();
    }
  }
  
}
