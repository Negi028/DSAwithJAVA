class  {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> smallList=new ArrayList<>();
        List<List<Integer>> finalList=new ArrayList<>();//for dynamic array 
        helper(nums,smallList,finalList);
        return finalList;
    }
    void helper(int [] nums, List<Integer> smallList , List<List<Integer>> finalList){
        //Base case
        if(nums.length==smallList.size()){
            finalList.add(new ArrayList<Integer>(smallList));
            return;
        }
        //firstly iterate 1,2,3
        for(int i=0;i<nums.length;i++){
            if(!smallList.contains(nums[i])){
                smallList.add(nums[i]);//modify the smallList
                helper(nums,smallList,finalList);//recursive call but we need to eliminate
                //stack fall
                smallList.remove(smallList.size()-1); 
            }
        }
    }
}
