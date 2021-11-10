public class SecondLarge {
    public static int second(int arr[]){
//        int first, second;
//        first = Integer.MIN_VALUE;
//        second = Integer.MIN_VALUE;
//
//        for(int i=0; i < arr.length; i++){
//            if(arr[i] > first){
//                second = first;
//                first = arr[i];
//            }else if(arr[i] > second && arr[i] != first){
//                second = arr[i];
//            }
//        }
//        return second;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i =0; i < arr.length; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String[] args){
        int arr[] = {2,2,1};
        int result = second(arr);
        System.out.println("Second large " + result);

    }
}
