class Solution {
    public String encode(List<String> strs) {
        StringBuilder holder = new StringBuilder();

        for(String str : strs){
            holder.append(str.length()).append('#').append(str);
        }
        return holder.toString();
    }

    public List<String> decode(String str) {
        List<String> holder = new ArrayList<>();

        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            i = j + 1;
            j = i + length;

            holder.add(str.substring(i,j));
            i=j;
        }
        return holder;
    }
}
