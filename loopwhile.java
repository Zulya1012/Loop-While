public class loopwhile {
  public static void main(String[] arg) {
    int i = 1;
    while (i <= 10) {
      if (i % 2 != 0) {
        if (i == 5) {
          i++;
          continue;

        }
        System.out.println(i);
      }
      i++;

    }

  }

}
