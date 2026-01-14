class Solution {
    public int maxArea(int[] heights) {
        int l=0; int r=heights.length-1;
        int area = (r-l) * Math.min(heights[l],heights[r]);
        while(l<r){
            int comp = (r-l) * Math.min(heights[l],heights[r]);
            if(comp > area) area = comp;

            if(heights[r] > heights[l]) l++;
            else r--;
        }

        return area;
    }
}
