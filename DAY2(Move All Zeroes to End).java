class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int count = 0 ;
        int n = arr.length ;
        for(int i = 0 ; i < n ; i ++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] =arr[count];
                arr[count]= temp ;
                count ++ ;
                
            }
        }
    }
}
