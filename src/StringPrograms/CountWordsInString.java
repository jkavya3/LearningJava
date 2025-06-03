package StringPrograms;

public class CountWordsInString {
    public static void main(String[] args) {
        String s1= "Java with Selenium is Interesting";
        String s2[]=s1.split(" ");
        String s3=" ";

        int count=0;
        for(int i=0;i<=s2.length-1;i++) {
           count++;
           s3=s2[i];
           System.out.println(s3);

        }
        System.out.println(count);
           }
}
