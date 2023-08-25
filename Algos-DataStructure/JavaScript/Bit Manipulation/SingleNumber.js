var singleNumber = function(nums) {
    let unique;

    nums.forEach(number =>{
        unique ^= number;
    })

    return unique;
};