public class reverseString {
    public static void main(String[] args) {
            String str = "abc";
            String reversed = reverseString(str);
            System.out.println("The reversed string is: " + reversed);
            }

    public static String reverseString(String str)
    {
        if(str == null || str.length()<=1){
            return str;
        }

        return reverseString(str.substring(1))+ str.charAt(0);
    }
}
