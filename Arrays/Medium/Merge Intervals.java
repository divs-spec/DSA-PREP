class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> ls = new ArrayList<>();
        int x1 = intervals[0][0];
        int x2 = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            List<Integer> ls1 = new ArrayList<>();
            if(intervals[i][0] <= x2){
                x2 = Math.max(x2,intervals[i][1]);
            }
            else
            {
                ls1.add(x1);
                ls1.add(x2);
                ls.add(ls1);
                x1 = intervals[i][0];
                x2 = intervals[i][1];
            }
        }
        List<Integer> ls1 = new ArrayList<>();
        ls1.add(x1);
        ls1.add(x2);
        ls.add(ls1);
        int[][] arr = new int[ls.size()][2];
        int id = 0;
        for(List<Integer> row : ls){
            arr[id][0] = row.get(0);
            arr[id][1] = row.get(1);
            ++id;
        }
        return arr;
    }
}
