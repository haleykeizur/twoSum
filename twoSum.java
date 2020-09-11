import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

class twoSum {
    
    //inspiration for hashmap from callicoder
    //hash map tutorial from youtube: https://www.youtube.com/watch?v=70qy6_gw1Hc

    //create twoSum function that takes in the array numbers and the target sum
    public static int[] twoSum(int[] sum, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
       
        //use a for loop to iterate through each elements of the array, 
        //subtract the element from the target, and see if the remainder is in the array
        for (int i = 0; i < sum.length; i++) {
            int remainder = target - sum[i];
            if (numMap.containsKey(remainder)) {
                //make sure the two numbers are not the same
                if (remainder == sum[i]){
                     numMap.put(sum[i], i);
                    }
                else
                    //if it works, return an array with just two numbers
                    return new int[] { numMap.get(remainder), i };
            } else {
                //if it doesn't work, continue iterating through array
                numMap.put(sum[i], i);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //main function asks users to enter their array and target sum
        System.out.println("Please enter how many elements are in your array: ");
        int n = input.nextInt();
        int[] sum = new int[n];

        System.out.println("Please enter the elements in your array: ");
        for(int i = 0; i < n; i++) {
            sum[i] = input.nextInt();
        }

        System.out.println("Please enter your target sum: ");

        int target = input.nextInt();


        int[] indices = twoSum(sum, target);


        if (indices.length == 2) {
            System.out.println("The indices of the numbers that equal " + target + " are: [" + indices[0] + "] [" + indices[1] + "]");
        } else {
            System.out.println("-1, there are not two unique numbers that equal " + target + ".");
        }
    }

}