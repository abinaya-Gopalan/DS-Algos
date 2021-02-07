public class Solution{
  public static void main(String args[]){
    String str = "I like this course very much";
    char[] charArr = str.toCharArray();
        for (int i = charArr.length - 1; i >= 0; i--)
            System.out.print(charArr[i]);
  }
}
