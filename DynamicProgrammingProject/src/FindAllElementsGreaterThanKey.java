public class FindAllElementsGreaterThanKey {
    public static void main(String[] args) {
        Integer[] inputArray = {2,3,4,7,7,9,10};
        int r = 0;
        int l = inputArray.length-1;
        int indexOfKey= getAllElementsGreaterThanKey(r,l,inputArray,7);
        System.out.println("no. of greater elements are : "+ (inputArray.length - indexOfKey));

    }
    private static int getAllElementsGreaterThanKey(int r,int l,Integer[] inputArray, int key) {
        int mid  = r + (l-r)/2;
        if(key == inputArray[mid]){
            return mid;
        }
        if(key >= inputArray[mid]){
            getAllElementsGreaterThanKey(mid+1,l,inputArray,key);
        }else{
            getAllElementsGreaterThanKey(r,mid-1,inputArray,key);
        }
        return 0;
    }
}
