package LoopingPrograms;

public class VowelsAndConsonantsInString {
    public static void main(String[] args) {
        String s = "This is a String with vowels and consonants";
        String s1=s.toLowerCase();
        int vcount=0,ccount=0;
        for(int i=0;i<s1.length();i++) {
            if (s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
            {
               vcount++;
            } else if(s1.charAt(i)>'a' && s1.charAt(i)<'z')
            {
                ccount++;
            }
        }

        System.out.println("Vowels are:" +vcount +  "Consonants are:" + ccount);
    }

    }

