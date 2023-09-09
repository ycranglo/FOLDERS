public class hashTable {

  String hash[] = new String[20];
  int hashIndex=0;

  //
  public int hashAscii(String messsage) {
    int count = 0;
    for (int i = 0; i < messsage.length(); i++) {
      count++;
      hashIndex = hashIndex + (((int) messsage.charAt(i)) * count);
    }
    hashIndex = hashIndex % 20;
    return hashIndex;
  }
  //
  public void addNewKey(String message){
    hashAscii(message);
    int counterIndex=0;

    if(hash[hashIndex]!=null){
      while(hash[hashIndex]!=null){
        counterIndex++;
        hashIndex+=counterIndex;
      }
    }
    if(hash[hashIndex]==hash[19]&&hash[19]!=null){
      hashIndex=0;
    
      while(hash[hashIndex]!=null){
        counterIndex++;
        hashIndex+=counterIndex;
      }
    }

  

    // if((hash[hashIndex]==hash[19])&&hash[19]!=null&&hash[0]==null){
    //   hash[0]=message;
    // }else{
    //   if(hash[hashIndex]!=null){
    //     hash[hashIndex+1]=message;
    //   }else if(hash[hashIndex]==null){
    //     hash[hashIndex]=message;
    //   } 

    hash[hashIndex]=message;
    counterIndex=0;
    hashIndex=0;
  }
  public void displayhashTable(){
    System.out.println("HASH TABLE");
    for(int i=0;i<hash.length;i++){
      if(hash[i]==null){
        hash[i]="";
      }
      System.out.println("index["+i+"]"+"  ="+hash[i]);
    }
  }
  public void search(String message){
    hashAscii(message);
    if (hash[hashIndex].equals(message)){
      System.out.println("user type was found at  :"+hashIndex);
    }else{
      System.out.println("no user iput found");
    }
    hashIndex=0;
  }
  public void delete(String message){
    hashAscii(message);
    if(hash[hashIndex].equals(message)){
      hash[hashIndex]="";
      System.out.println("successfully delete");
    }else{
      System.out.println("no same message to be deleted");
    }
    hashIndex=0;
  }

}