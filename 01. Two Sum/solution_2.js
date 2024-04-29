var twoSum = function(nums, target) 
{
   let numAndIndex = new Map();

    for (let i = 0; i < nums.length; ++i)
    {
        const curr = nums[i];
        const diff = target - curr;

        if (numAndIndex.has(diff))
            return [numAndIndex.get(diff), i];

        numAndIndex.set(curr, i);
    }

   return [];
};