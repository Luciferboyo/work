package work.src;
/*
 * 
 * Question : Given a positive integer num consisting only of digits 3 and 5.
 * Return the minimum number you can get by changing at most two digit (3 becomes 5, or 5 becomes 3).
 * 
 * Example 1 :
 * Input : num = 3535
 * Output : 3333
 * 
 * Example 2 :
 * Input: num = 5555
 * Output: 3355
*/
public class JavaQuest17 {

  public static void main(String[] args) {
    System.out.println(minimum35Number(3355)); // Output : 3333
    System.out.println(minimum35Number(5353));// Output : 3333
    System.out.println(minimum35Number(3535));// Output : 3333
    System.out.println(minimum35Number(5555));// Output : 3355
    System.out.println(minimum35Number(3333));// Output : 3333
    System.out.println(minimum35Number(3353));// Output : 3333
    System.out.println(minimum35Number(5535));// Output : 3335

  }

  // finish the code
  // Hints : int -> String -> array
  public static int minimum35Number(int num) {

      String str = String.valueOf(num);
      char[] charArr = new char[str.length()];
      int count = 0;
      int result = 0;

      for(int i = 0; i < charArr.length; i++){
        charArr[i] = str.charAt(i);
        if (charArr[i] == '5' && count < 2) {
          charArr[i] = '3';
          count++;
        }
        result = result * 10 + (charArr[i] - '0');
      }
      
      return result;
  }
}
