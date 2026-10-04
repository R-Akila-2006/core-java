import java.util.Scanner;
public class BinarySearch {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Binary Search");
        System.out.println("Enter a size of the array:");
        // n ->size of the array//
        int n= s.nextInt();
        //a->array//
        int[]  a= new int[n];
        System.out.println("Enter a array element:");
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]+ " ");
        }
        System.out.println("Enter a value for search:");
        int k = s.nextInt();
        int low =0;
        int high =n-1;
        int found = -1;
        while(low<=high){
            int mid = (low+high) /2;
            if(a[mid]==k){
                found=mid;
                break;
            }
            else if(k>a[mid]){
                low = mid+1;

            }
            else{
                high = mid-1;
            }
        }
        if(found!= -1){
            System.out.println("Element found at :"+found);
        }
        else{
            System.out.println("Element not found");
        }


    }
    

    
}
