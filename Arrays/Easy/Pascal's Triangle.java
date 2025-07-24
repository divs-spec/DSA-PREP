class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            if(i == 0){
                temp.add(1);
                ls.add(temp);
            }
            else{
                temp = func(temp);
                ls.add(temp);
            }
        }
        return ls;
    }
    public List<Integer> func(List<Integer> t){
        List<Integer> ls = new ArrayList<>();
        int x = 0;
        for(Integer e : t){
            ls.add(x+e);
            x = e;
        }
        ls.add(1);
        return ls;
    }
}
