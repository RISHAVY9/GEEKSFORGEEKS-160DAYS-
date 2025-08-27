class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
     int largest = -1 ;
     int secondlargest = -1 ;
     int n = arr.length ;
     for(int i = 0 ; i < n ; i ++){
         if( arr[i] > largest){
             largest = arr[i];
         }
     
         
     }
     for (int i = 0 ; i < n ; i++){
         if(arr[i]>secondlargest && arr[i] != largest){
             secondlargest = arr[i];
             
         }
     } return secondlargest ;
     
    }
}
