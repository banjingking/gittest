import java.util.Arrays;

public class Anagram {

        public static boolean isAnagram(String str1, String str2) {
//            String s1 = str1.replaceAll("\\s","");
//            String s2 = str2.replaceAll("\\s", "");
//
//
//            char[] array1 = s1.toLowerCase().toCharArray();
//            char[] array2 = s2.toLowerCase().toCharArray();
//            Arrays.sort(array1);
//            Arrays.sort(array2);
//
//            boolean rs2 = Arrays.equals(array1,array2);
//            return  rs2;

            String str1_c = str1.replaceAll("\\s","");
            String str2_c = str2.replaceAll("\\s","");

            char[] array1 = str1_c.toLowerCase().toCharArray();
            char[] array2 = str2_c.toLowerCase().toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);
            return Arrays.equals(array1,array2);



        }

        public static void main(String[] args) {
            System.out.println(isAnagram("Ke ep", "Peek"));

            //isAnagram("Mother In Law", "Hitler Woman");
        }


}
