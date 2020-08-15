
// Java program to find all elements
// in array which have at least
// two greater elements itself.

import java.util.Arrays;
import java.util.List;

public class FindAllElementsTwoElementsGreaterThanItself {

    public static void main(String[] args) {
        Integer [] array = { 2, -6, 3, 5, 1};

      //  printGreaterElements(array);


        List<Integer> lst = Arrays.asList(1,2,3);

        lst.set(1,4);
      //  lst.add(1,5);

        for(Integer i : lst){
            System.out.println(i);
        }

    }

    private static void printGreaterElements(Integer[] array) {
        Integer max = Integer.MIN_VALUE;
        Integer secondMax = Integer.MIN_VALUE;
        for(Integer element : array){
            if(element > max){
                secondMax = max;
                max = element;
            }
        }
        for(Integer element : array){
            if(element < secondMax){
                System.out.print(" "+element);
            }
        }
    }
}
