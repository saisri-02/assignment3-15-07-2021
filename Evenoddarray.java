class Evenoddarray 
{
public int[] sortArrayByParityII(int[] nums) 
{
ArrayList<Integer> even=new ArrayList<Integer>();
ArrayList<Integer> odd=new ArrayList<Integer>();
for(int i=0;i<nums.length;i++)
{
if(nums[i]%2==0)
{
even.add(nums[i]);
}
else
{
odd.add(nums[i]);
}
}
int i=0;
for(Integer value:even)
{
nums[i]=value;
i=i+2;
}
i=1;
for(Integer value:odd)
{
nums[i]=value;
i=i+2;
}
return nums;
}
}

output:

Your input [4,2,5,7]
Output     [4,5,2,7]
Expected   [4,5,2,7]