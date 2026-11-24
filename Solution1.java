class Solution1 {
    public int trap(int[] height) {
        int l= height.length;
        int[] L= new int[l];
        int[] R= new int[l];
        L[0]=height[0];
        R[l-1]=height[l-1];
        
        for(int i=1;i<l;i++){
            L[i]=Math.max(L[i-1],height[i]);
        }
        for(int i=l-2;i>=0;i--){
            R[i]=Math.max(R[i+1],height[i]);
        }
        int count=0;
        for(int i=0;i<l;i++){
           count+=(Math.min(L[i],R[i])-height[i]);
        }
         return count;

    }
}