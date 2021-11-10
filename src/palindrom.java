public class palindrom {
    static boolean isPalindrome(String str)
    {
        boolean result = true;
        for(int i =0; i <str.length(); i++){
            int index = str.length()-1-i;
            System.out.println(index + "i: " + i);
            if(str.charAt(i) != str.charAt(index)){
                result = false;
                break;
            }
        }
        return result;
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "madam";

        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
