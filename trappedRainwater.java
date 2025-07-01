public class trappedRainwater {
    public static int trappedRainwater1(int height[]) {
        int n = height.length;
        int leftMax[] = new int[n];                      // calculate leftMax boundary - array
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        } 

        int rightMax[] = new int[n];                     // calculate rightMax boundary - array
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        } 
        
        int trappedWater = 0;                            // loop
        for(int i=0; i<n; i++) {                         
            int waterLevel = Math.min(leftMax[i], rightMax[i]);            // waterLevel = min(leftMax bound, rightMax bound);   
            trappedWater += waterLevel - height[i];                        // trappedWater = waterLevel - height[i];
        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5}; 
        System.out.println(trappedRainwater1(height));
    }
}
