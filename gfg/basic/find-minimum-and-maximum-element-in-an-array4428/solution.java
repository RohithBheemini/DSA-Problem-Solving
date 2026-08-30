class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return new ArrayList<>(List.of(min,max));
    }
}
