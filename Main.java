public class Main {

  public static void main(String[] args) {

    int count = 0, num = 0003452;

    while (num != 0) {
      // num = num/10
      num /= 10;
      ++count;
    }
//adding some line to chek fit fetch and git pull affect.
    System.out.println("Number of digits: " + count);
  }
}
