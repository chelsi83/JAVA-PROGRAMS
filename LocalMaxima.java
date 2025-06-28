import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LocalMaxima {
    // Function to return the index of the local Maxima
    static int localMaxima(int[] array){
        int low,mid,high;
        low = 0;
        high = array.length-1;
        int ans;
        while(low<=high){
            mid = (low + high)/2;
            if((mid == 0 || array[mid-1] < array[mid])
                    && (mid == array.length-1 || array[mid+1] < array[mid])){
                return mid;
            }
            else if(mid > 0 && array[mid-1] > array[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    // Function to read input
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the size of the array");
        try {
            size = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        int[] array = new int[size];
        System.out.println("Enter array elements");
        int i;
        for (i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("An error occurred");
                return;
            }
        }
        int index = localMaxima(array);
        System.out.println("The local maxima is " + array[index]);
    }
}