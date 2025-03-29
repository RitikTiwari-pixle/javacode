public class Arrayhandling
{ 
    public static void main(String args[]) { 
        // Initialize an array of integers
 
        int[] numbers = {5, 3, 8, 6, 2, 7, 4, 1}; 
         
        // Calculate the sum and find the max and min values 
        int sum = 0, max = numbers[0], min = numbers[0]; 
        for (int num : numbers) { 
            sum += num; 
            if (num > max) max = num; 
            if (num < min) min = num; 
        } 
        double average = (double) sum / numbers.length; 
         
        // Search for an element in the array 
        int target = 6; 
        boolean found = false; 
        for (int num : numbers) 
        { 
            if (num == target){
                found = true; 
                break; 
            }
        } 
         
        // Display results 
        System.out.println("Sum: " + sum); 
        System.out.println("Average: " + average); 
        System.out.println("Max: " + max); 
        System.out.println("Min: " + min); 
        System.out.println("Is " + target + " found? " + found); 
    } 
}