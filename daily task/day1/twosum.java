class twosum{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> Map=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            int com=target-nums[i]; //[2,7,11,15]
            if(Map.containsKey(com))
                return new int[]{Map.get(com),i};
            Map.put(nums[i],i);
        }
            return null;
        
    }
}