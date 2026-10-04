import java.util.Scanner;;
public class linearSearch {
    public static void main(String args[]){
        System.out.println("LinearSearch");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a size of the Array:");
        //n->n is size of the array//
        int n= s.nextInt();
        //a->a is array//
        int[] a = new int[n];
        //for loop used to get the array element form the user//
        System.out.println("Enter a array Element");
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("Enter a value for search: ");
        // k->searching element 
        int k = s.nextInt();
        int f = -1;
        for(int i=0;i<n;i++){
            if(k==a[i]){
                f=i;

            }
        }
        if(f!= -1){
            System.out.println("Element found at:"+f);
        }
        else{
            System.out.println("Element not found please try again .........");
        }

    }
    
}
