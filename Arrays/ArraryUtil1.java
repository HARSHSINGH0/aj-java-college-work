//design a class Arrayutilities with following functionality
//1) Find maximum of an Array
//2) Find minimum of an Array
import java.util.*;
import java.lang.*;
class ArrayUtiltest{
    //constructor
    int[] data;
    ArrayUtiltest(int size){
        data=new int[size];
    }
    //setter
    void setData(int[] data1){
        data=data1;
    }
    int findMax(){
        int max;
        max=data[0];
        for(int i=1;i<data.length;i++){
            if (max<data[i]){
                max=data[i];
            }

        }
        return max;
    }
    int findMin(){
        int min;
        min=data[0];
        for(int i=1;i<data.length;i++){
            if (min>data[i]){
                min=data[i];
            }

        }
        return min;
    }
    double sumElement(){
        int sum=data[0];
        for(int i=1;i<data.length;i++){
            sum+=data[i];
        }
        return sum;
    }
    double findMean(){
        double mean=data[0];
        
        mean=(this.sumElement()/data.length);
        return mean;
    }
    double calStdDev(){
        double stdval=0;
        double mean=findMean();
        for(int i=0;i<data.length;i++){
            stdval=stdval+Math.pow(data[i]-mean,2);

        }
        stdval=stdval/data.length;
        return (Math.sqrt(stdval));
        

    }

}
class ArrayUtil1{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        ArrayUtiltest au=new ArrayUtiltest(arr.length);
        au.setData(arr);
        System.out.println("Maximum element:"+au.findMax());
        System.out.println("Minimum element:"+au.findMin());
        System.out.println("Mean of element:"+au.findMean());
        System.out.println("SD of element:"+au.calStdDev());
    }
    
}
