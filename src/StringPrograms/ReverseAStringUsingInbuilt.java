package StringPrograms;

public class ReverseAStringUsingInbuilt {
    public static void main(String[] args) {

        String str= new String("Java programming");
        String str2=" ";
        StringBuffer sb = new StringBuffer(str);
        str2=str2+sb.reverse();
       System.out.println(str2);
    }
}
