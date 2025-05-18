package JavaBasics;

public class LargestofNumbers {
    public static void main(String[] args) {
        int N1=8,N2=9,N3=3;
        String result="";
        result = (N1>N2 && N1>N3) ? "N1 is the Largest" : ((N2>N3) ?"N2 is the Largest" :"N3 is the Largest");
        System.out.println(result);
    }
}
