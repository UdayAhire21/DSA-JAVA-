class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        if(size == 0 || size == 1 ){
            return;
        }

        int z = 0;
        int nz = 0;
        while(nz<nums.length){
            if(nums[nz]!=0){
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                nz++;
                z++;
            }
            else 
            nz++;
        }
    }
}