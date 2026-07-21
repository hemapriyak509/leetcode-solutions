class Solution {
    public int numIdenticalPairs(int[] a) {
        int b = 0;
        for(int i = 0;i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[i]==a[j]){
                    b = b+1;
                }
            }
        }
        return b;
        
    }
}