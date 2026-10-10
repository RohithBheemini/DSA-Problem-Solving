class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            if (b[i]>max){
                max=b[i];
            }
            for(int j=0;j<n;j++){
                if(i==j){
                    sum+=a[i][j];
                }
            }
        }
        return new ArrayList<>(List.of(sum,max));
    }
}
