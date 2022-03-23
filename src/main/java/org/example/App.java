package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] startingArray = new int[] {19,5,34,81,17,22,6};
        int[] leftHalf = new int[] {5,19,34,81};
        int[] rightHalf = new int[] {6,17,22};

        Sort.merge(startingArray,leftHalf,rightHalf);

        for(int i = 0; i<startingArray.length; i++){
            System.out.println(startingArray[i]);
        }

        System.out.println("-");

        int[] unorderedArray = new int[] {82, 19};

        Sort.sortTwo(unorderedArray);

        for(int i = 0; i<startingArray.length; i++){
            System.out.println(unorderedArray[i]);
        }
    }
}
