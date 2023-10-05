class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();


        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        
       for(int key : map.keySet()){

           int value = map.get(key);

        if(value > n/3){

            list.add(key);


        }

       }

        
        
        return list;
    }
}
