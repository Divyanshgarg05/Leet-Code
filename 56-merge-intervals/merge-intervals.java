class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        for(int[] curr : intervals){
            if(res.isEmpty()){
                res.add(curr);
                continue;
            }
            int[] last = res.get(res.size() - 1);
            if(curr[0] <= last[1]){
                last[1] = Math.max(last[1],curr[1]);
            }else{
                res.add(curr);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}