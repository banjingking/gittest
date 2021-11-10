public class amstrongnumber {
    public static void main(String[] args)  {
//        int c=0,a,temp;
//        int n=153;//It is the number to check armstrong
//        temp=n;
//        while(n>0)
//        {
//            a=n%10;
//            System.out.println("a"+ a);
//            n=n/10;
//            c=c+(a*a*a);
//        }
//        if(temp==c)
//            System.out.println("armstrong number");
//        else
//            System.out.println("Not armstrong number");

        int N = 153;
        System.out.println(isArmstrong(N));




    }
    public static boolean isArmstrong(int N){

        int num = N;
        if(num < 0){
            return false;
        }


        int rem =0, res =0;
        int pow = (Integer.toString(num)).length();
        while(num!=0){
            rem = num %10;
            System.out.println("rem "+ rem);
            res += Math.pow(rem, pow);
            System.out.println("res " +res);
            System.out.println("/=  " +(num /= 10));
            num /= 10;
        }
        if (res == N){
            return true;
        }else{
            return false;
        }
    }
}
