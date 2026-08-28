class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        int exp=b*b-4*a*c;
        if(exp<0) return new ArrayList<>(List.of(-1));
        int m =-b/(2*a);
        if(exp==0) return new ArrayList<>(List.of(m,m));
        double sqrt = Math.sqrt(exp);
        int x=(int)Math.floor((-b+sqrt)/(2.0*a));
        int y=(int)Math.floor((-b-sqrt)/(2.0*a));
        return new ArrayList<>(List.of(x,y));
    }
}