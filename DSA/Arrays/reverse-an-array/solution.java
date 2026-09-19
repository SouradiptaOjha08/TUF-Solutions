class Solution {
    public void reverse(int[] arr, int n) {
        int forward=0;
        int backward=n-1;
       
       while(forward < backward){
        int temp=arr[forward];
        arr[forward]=arr[backward];
        arr[backward]=temp;
        forward++;
        backward--;
       }
   
    }
}

