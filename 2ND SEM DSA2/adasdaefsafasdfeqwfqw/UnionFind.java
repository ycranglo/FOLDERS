public class UnionFind {

  int unionset[] = new int[1000];
  int unionsetVer2[] = new int[500];
  int countver1;
  int countver2;

  public void Union(int num1, int num2) {
    if (unionset[0] == 0) {
      unionset[0] = num2;
      unionset[1] = num1;
      countver1 = 2;
    }
    if (findMatch(num1)) {
      unionset[countver1] = num2;
      unionset[countver1 + 1] = num1;
      countver1 += 2;
    } else {

    }
  }

  public boolean findMatch(int num1) {
    boolean finded = false;

    for (int a = 0; a < unionset.length; a++) {
      if (num1 == unionset[a]) {
        finded = true;
      }
    }
    return finded;
  }

  public boolean UnionFindd(int num1, int num2) {
    boolean Unionfinded = false;
    boolean num1Find = false;
    boolean num2find = false;
    for (int a = 0; a < unionset.length; a++) {
      if (unionset[a] == num1) {
        num1Find = true;
      }
      if (unionset[a] == num2) {
        num2find = true;
      }
    }
    if (num2find == true && num1Find == true) {
      Unionfinded = true;
    }
    return Unionfinded;
  }
}