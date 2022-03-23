package org.example;

public class Sort {

    /**
     * Should take in an array of two ints and changes it
     * to array with the numbers from smallest to largest.
     * @param nums
     */
    public static void sortTwo(int[] nums) {
        int temp = 0;
        if(nums[0] >= nums[1]){
            temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }
    }

    /**
     * This function should take the two arrays and merge them into the inputArray.
     * The result should be in order from smallest to largest, with all the numbers from both arrays included.
     * @param inputArray - The original array that will come back changed.
     * @param array1 - A sorted list of numbers that is the size of half the length of the inputArray
     * @param array2 - A sorted list of numbers that is the size of half the length of the inputArray
     */
    public static void merge(int[] inputArray, int[] array1, int [] array2) {
        int i = 0;
        while(i < array1.length){
            inputArray[i] = array1[i];
            i++;
        }
        int j = 0;
        while(i < array2.length + array1.length){
            inputArray[i] = array2[j];
            i++;
            j++;
        }
        for(int k = 1; k < inputArray.length; k++){
            int temp = inputArray[k];
            int l = k-1;

            while(l >= 0 && temp < inputArray[l]){
                inputArray[l+1] = inputArray[l];
                l--;
            }
            inputArray[l+1] = temp;
        }
    }
}
