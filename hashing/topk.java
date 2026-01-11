class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for(int i=0;i<freq.length;i++){
            freq[i] = new ArrayList<>();
        }

        for(int num : nums){
            hash.putIfAbsent(num, 0);
            hash.put(num, hash.get(num)+1);
        }

        for(Map.Entry<Integer, Integer> entry : hash.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;

        for(int i=freq.length-1;i>0 && index < k;i--){
            for(int n : freq[i]){
                res[index++] = n;
                if(index==k) return res;
            }
        }
        return res;
    }
}
