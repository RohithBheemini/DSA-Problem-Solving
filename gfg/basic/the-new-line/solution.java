class GFG {
    public static void main(String[] args) {

        // code here
        String gfg = "Geeks for Geeks";
        for(int i=0;i<gfg.length();i++){
            if(gfg.charAt(i)==' ')System.out.println();
            else System.out.print(gfg.charAt(i));
        }
    }
}