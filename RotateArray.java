public class RotateArray{
    public static void main(String[] args){
        int[] arr = { 1,2,3,4,5};
        int k = 12000;
        for(int  j=1; j<=k ; j++){
            int temp= arr[arr.length - 1];
        
            for(int i = arr.length -1 ; i>0 ; i--){
                 arr[i]= arr[i - 1];

        }
        arr[0] = temp;

        for(int i : arr){
            System.out.print(i + "  ");
        }
        System.out.println();
        
    }
    }
}
