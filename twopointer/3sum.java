class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sum = new ArrayList<>();

        Arrays.sort(nums);
        
        //[-4,-1,-1,0,1,2]
        //  a  l        r
        for(int i =0; i<nums.length;i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i-1] == nums[i]) continue;

            int l = i+1;
            int r = nums.length -1;
            while(l<r){
                int sum3 = nums[i] + nums[l] + nums[r];
                if(sum3 > 0) r--;
                else if(sum3 < 0) l++;
                else{
                    sum.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++; r--;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
            }
        }
        return sum;
    }
}
