package StringPrograms;

public class ReverseAStringWithoutInbuilt {
    public static void main(String[] args) {

        String str = "Java with Selenium";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
         rev=rev+str.charAt(i);
        }
          System.out.println(rev);
    }
}
