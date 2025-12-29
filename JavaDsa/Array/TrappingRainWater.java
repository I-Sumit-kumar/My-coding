package Array;

public class TrappingRainWater {
    public static int TrappingRainWater(int hight[]) {
        // left max array
        int lmax[] = new int[hight.length];
        lmax[0] = hight[0];
        for (int i = 1; i < hight.length; i++) {
            lmax[i] = Math.max(lmax[i - 1], hight[i]);
        }
        // right max array
        int rmax[] = new int[hight.length];
        rmax[rmax.length-1] = hight[hight.length-1];
        for (int i = hight.length-2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], hight[i]);
        }
        // loop
        int water=0;
        for (int i = 0; i < hight.length; i++) {
            int wat = Math.min(lmax[i], rmax[i]);
            water += wat - hight[i];
            
        }
        return water;
    }
    public static void main(String[] args) {
        int hight[] = {4,2,0,6,3,2,5};
        System.out.println(TrappingRainWater(hight));
    }
}
