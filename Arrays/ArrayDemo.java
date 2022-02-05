import java.util.*;//for importing scanner object
class ArrayDemo{
    public static void main(String[] args){
        int[] arr=new int[5];
        int[] arr1={12,23,22};//valid
        int arr2[]=new int[]{1,32,4};//valid
        // int arr3[]=new int[5]{12,23,4};//invalid
        //declaring,instantiating,initalizing
        //create an object of scanner 
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("\nEnter Number:");
            arr[i]=sc.nextInt();

        }
        System.out.println("Data in Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print("\nElement at "+i+" :"+arr[i]);
        }
    }
}
