import java.util.Scanner;

public class ClosestMinMax {
    public static int MinSubarray(int[] arr, int n) {
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        int latestMinIndex=-1;
        int latestMaxIndex=-1;
        int result=n;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==min){
                latestMinIndex=i;
                if(latestMaxIndex>=0){
                    result=Math.min(result, i-latestMaxIndex+1);
                }
            }
            if(arr[i]==max){
                latestMaxIndex=i;
                if(latestMinIndex>=0){
                    result=Math.min(result, i-latestMinIndex+1);
                }
            }

        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(MinSubarray(arr, n));
    }
}
