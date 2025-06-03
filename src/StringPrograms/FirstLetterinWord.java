package StringPrograms;

public class FirstLetterinWord {
    public static void main(String[] args) {
        String s1 = "Java Programming is key to job hunt";
        String s2[]=s1.split(" ");
        String s3=" ";
        for(int i=0;i<=s2.length-1;i++)
        {
           System.out.println(s2[i].charAt(0));
        }

    }
}
