
// Provided that you have a given number of small rice bags (1 kilo each) and 
// big rice bags (5 kilos each), 
// write a method that returns the minimum number of small bags 
// necessary to package goal kilos of rice. Return -1 if it is not possible to 
// package the required rice amount with the bags provided.

class GetNumberOfSmallBags{
    public int getNumberSmallBags(int bigbag,int smallbag,int goalkilo){
        int result = -1;
        // System.out.println(bigbag);
        if (bigbag * 5 >= goalkilo) {
            if (smallbag >= goalkilo % 5){
                result = goalkilo % 5;
            }
                
        } else {
            if (smallbag >= goalkilo - bigbag * 5) {
                result = goalkilo - bigbag * 5;
            }
        }
        return result;
    }
}
class ricebag{
    public static void main(String[] args){
        GetNumberOfSmallBags g1=new GetNumberOfSmallBags();
        System.out.println(g1.getNumberSmallBags(1,4,10));
        System.out.println(g1.getNumberSmallBags(1,5,10));
    }
}