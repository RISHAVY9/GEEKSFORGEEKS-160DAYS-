class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n = arr.length ;
        HashMap<Integer , Integer> freq = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int ele : arr)
        freq.put(ele , freq.getOrDefault(ele , 0 )+1);
        
        for(Map.Entry<Integer , Integer > it : freq.entrySet()){
            if(it.getValue() > n/3)
            res.add(it.getKey());
        }
        if(res.size() == 2 && res.get(0) > res.get(1)){
            int temp = res.get(0);
            res.set(0 , res.get(1));
            res.set(1 , temp);
        }
        return res ;
        
    }
}
