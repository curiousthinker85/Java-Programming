import java.util.*;

public class ArraysCC {
    // public static void update( int marks[]){
    //     for(int i=0; i<marks.length; i++){
    //         marks[i] = marks[i] + 1;
    //     }
    // }

    // public static int linearSearch(int numbers[], int key){
    //     for(int i=0; i<numbers.length; i++){
    //         if(numbers[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static int getlargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE;
    //     int samllest = Integer.MAX_VALUE;

    //     for(int i=0; i<numbers.length; i++){
    //         if(largest < numbers[i]){
    //             largest = numbers[i];
    //         }
    //         if(samllest > numbers[i]){
    //             samllest = numbers[i];
    //         }
    //     }
    //     System.out.println("Smallest value is: "+ samllest);
    //     return largest;
    // }  

    // //Binary search
    // public static int binarySearch(int numbers[], int key){
    //     int start = 0 ,end = numbers.length-1;

    //     while(start<=end){
    //         int mid = (start + end)/2;
    //         if(numbers[mid] == key){
    //             return mid;
    //         }
    //         if(numbers[mid] < key){
    //             start = mid + 1;
    //         }else{
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
    // }

    // public static void reverse(int numbers[]){
    //     int first = 0 , last = numbers.length-1;

    //     while(first < last){
    //         int temp = numbers[last];
    //         numbers[last] = numbers[first];
    //         numbers[first] = temp;

    //         first++;
    //         last--;
    //     }
    // }

    // public static void printPairs(int numbers[]){
    //     int tp = 0;
    //     for(int i=0; i<numbers.length; i++){
    //         int curr = numbers[i];
    //         for(int j=i+1; j<numbers.length; j++){
    //             System.out.print("(" + curr + "," + numbers[j] + ")");
    //             tp++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.print("Total pairs: " + tp);
    // }

    // public static void printSubarray(int numbers[]){
    //     for(int i=0; i<numbers.length; i++){
    //         for(int j=i; j<numbers.length; j++){
    //             for(int k=i; k<=j; k++){
    //                 System.out.print(numbers[k]+ " ");
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void maxSubarraySum(int numbers[]){
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;

    //     for(int i=0; i<numbers.length; i++){
    //         for(int j=i; j<numbers.length; j++){
    //             currSum = 0;
    //             for(int k=i; k<=j; k++){
    //                 currSum+= numbers[k];
    //             }
    //             System.out.println(currSum);
    //             if(maxSum < currSum){
    //                 maxSum = currSum;
    //             }
    //         }
            
    //     }
    //     System.out.print("Max Sum is: "+ maxSum);
    // }


    // public static void maxSubarraySumPrefixArray(int numbers[]){
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[numbers.length];

    //     //calculate prefix array
    //     prefix[0] = numbers[0];
    //     for(int i=1; i<prefix.length; i++){
    //         prefix[i] = prefix[i-1] + numbers[i];
    //     }

    //     for(int i=0; i<numbers.length; i++){
    //         for(int j=i; j<numbers.length; j++){
    //             currSum = i == 0 ? prefix[j] :prefix[j] - prefix[i-1];
        
    //             if(maxSum < currSum){
    //                 maxSum = currSum;
    //             }
    //         }
            
    //     }
    //     System.out.print("Max Sum is: "+ maxSum);
    // }


    // public static void kadanes(int numbers[]){
    //     int ms = Integer.MIN_VALUE;
    //     int cs = 0;

    //     for(int i=0; i<numbers.length; i++){
    //         cs = cs + numbers[i];
    //         if(cs < 0){
    //             cs = 0;
    //         }
    //         ms = Math.max(cs, ms);
    //     }
    //     System.out.println("Our max subarray sum is: " + ms);
    // }

    // public static int trappedRainwater(int height[]){

    //     int n = height.length;

    //     // Calculate leftmax boundaery array

    //     int leftMax[] = new int[n];
    //     leftMax[0] = height[0];
    //     for(int i=1; i<n; i++){
    //         leftMax[i] = Math.max(height[i], leftMax[i-1]);
    //     }

    //     // calculate rightmax boundary array

    //     int rightMax[] = new int[n];

    //     rightMax[n-1] = height[n-1];
    //     for(int i = n-2; i>=0; i--){
    //         rightMax[i] = Math.max(height[i], rightMax[i+1]);
    //     }

    //     int trappedWater = 0;

    //     for(int i=0; i<n; i++){
    //         int waterLevel = Math.min(leftMax[i],rightMax[i]);
            
    //         trappedWater += waterLevel - height[i];
    //         }

    //     return trappedWater;
    // }

    // public static int buyAndSellStocks(int prices[]){

    //     int buyPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;

    //     for(int i=0; i<prices.length; i++){
    //         if(buyPrice<prices[i]){
    //             int profit = prices[i] - buyPrice;
    //             maxProfit = Math.max(maxProfit, profit);
    //         }else{
    //             buyPrice = prices[i];
    //         }
    //     }
    //     return maxProfit;
    // }

    public static int LinearSearch(int numbers[], int key){
        for(int i = 0 ; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }return -1;
    }

    public static int maxNum(int numbers[]){
        int max = numbers[0];
        for(int i=0; i<numbers.length; i++){
             if(numbers[i] > max){
             max = numbers[i];
            }
        }return max;

    }

    public static int BinarySearch(int numbers[], int key){
        int start = 0,  end = numbers.length - 1; 

        while (start <= end) {
            int mid = (start + end)/2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;
            }else{
                end = mid - 1 ;
            }
            
        }return -1;
    }

    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length - 1;

        while(first < last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int numbers[]){
        int tp = 0;
        for(int i = 0 ; i< numbers.length; i++){
            int curr = numbers[i];

            for(int j = i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j]+ ")");
                tp++;
            }
            System.out.println();
            
        }System.out.print(tp);
    }

    public static void printSubarray(int numbers[]){
        
        for(int i = 0 ; i< numbers.length; i++){

            for(int j = i; j<numbers.length; j++){
                int sum = 0;
                for(int k = i; k <= j ; k++){
                    sum = sum + numbers[k];
                    System.out.print(numbers[k]+ " " );
                }

                System.out.print("Sum :" + sum);
                
                System.out.println();
            }
            System.out.println();
            
        }
    }

    public static void printMaxSubarray(int numbers[]){
        int max_sum = 0;
        int curr_sum = 0;
        for(int i = 0 ; i< numbers.length; i++){
            
            for(int j = i; j<numbers.length; j++){
                curr_sum = 0;
                for(int k = i; k <= j ; k++){
                    curr_sum = curr_sum + numbers[k];
                    }
                    if(curr_sum > max_sum){
                        max_sum = curr_sum;
                       
                }
              
            }
        }
        System.out.print("Max Sum of subarray is :" + max_sum);
    }

    public static boolean distinct_count(int numbers[]){
        for(int i=0; i< numbers.length - 1; i++){
            for(int j=i+1; j< numbers.length; j++){
                if(numbers[i] == numbers[j]){
                  return true;
                }
            }
        }
        return false;

    }

    public static int findTarget(int nums[], int target) {
        int start = 0, end = nums.length - 1;
    
            while (start <= end) {
                int mid = (start + end) / 2;
    
                if (nums[mid] == target) {
                    return mid;
                }
    
                // Check which side is sorted
                if (nums[start] <= nums[mid]) { // Left side is sorted
                    if (nums[start] <= target && target < nums[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else { // Right side is sorted
                    if (nums[mid] < target && target <= nums[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
    
            return -1;
        }


    public static void main(String arg[]){

        // int marks[] = new int[100];

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the Physics marks: ");
        // marks[0] = sc.nextInt();

        // System.out.println("enter the Chemistry marks: ");
        // marks[1] = sc.nextInt();

        // System.out.println("enter the maths marks: ");
        // marks[2] = sc.nextInt();

        // System.out.println("Physics: "+ marks[0]);
        // System.out.println("Chemistry: "+ marks[1]);
        // System.out.println("Maths: "+ marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("percentage: " + percentage + "%");

        // System.out.println("Lenght of array: "+ marks.length);

        // int marks[] = {97, 98, 99};
        // update(marks);

        // for(int i=0 ;i <marks.length; i++){
        //     System.out.print(marks[i] + " ");
      
        // }
        // System.out.println();

        // int numbers[] = {2,4,6,8,10,12,14,16};
        // int key = 20;

        // int index = linearSearch(numbers, key);
        // if(index==-1){
        //     System.out.println("NOT FOUND");
        // }else{
        //     System.out.println("Key is at index: " + index);
        // }
        
        // int numbers[] = {1,2,6,8,9,4};

        // System.out.println(numbers.length);

        // System.out.println("Largest value is : " + getlargest(numbers));

        // int numbers[] = {2,4,6,8,10,12,14};
        // int key = 4;

        // System.out.println("index for key is: " + binarySearch(numbers, key));

        // int numbers[] = {2,4,6,8,9,10,24,35};
        // reverse(numbers);

        // for(int i=0; i<numbers.length; i++){
        //     System.out.print(numbers[i]+ " ");
        // }
        // System.out.println();

        // int numbers[] = {2,4,6,8,10,12};
        // printPairs(numbers);
        // printSubarray(numbers);
        // printMaxSubarray(numbers);

        // maxSubarraySum(numbers);
        // maxSubarraySumPrefixArray(numbers);
        // kadanes(numbers);

        // int height[] = {4,2,0,6,3,2,5};

        // int prices[] = {7,1,5,3,6,4};
        // System.out.println(buyAndSellStocks(prices));

    // int numbers[] = {2,3,4,5,4,6,8,10,12,14};
    // int key = 14;

    // int index = LinearSearch(numbers,key);
    // if(index == -1){
    //     System.out.println("Index Not found");
    // }else{
    //     System.out.println("Key found at the index: " + index);
    // }

//     int numbers[] = {2,3,4,12,34,56,34,23};

//    int maximum = maxNum(numbers);
//    System.out.println("Maximum Number is: " + maximum);
   
    // int numbers[] = {2,4,5,6,7,8,9,10,12,14,15};
    // int key = 6;
    
    // System.out.println("index for key : " + key + " is " + BinarySearch(numbers, key));
     
    // int numbers[] = {2,4,5,6,7,8,9,10,12,14,15};
    
    // reverse(numbers);

    // for(int i = 0; i< numbers.length; i++){
    //     System.err.print(numbers[i]+ " ");
    // }
    // System.out.println();

    // int numbers[] = {2,4,5,6,7,8,9,10};

    // printMaxSubarray(numbers);

    // int numbers[] = {2,4,5,6,7,8,9,10,2,4};
    
    // System.out.println(distinct_count(numbers));

    int nums[] = {4,  5, 6, 7, 0, 1, 2}, target = 0;

    System.out.println("target value is at index : " + findTarget(nums, target));

    }  
}
