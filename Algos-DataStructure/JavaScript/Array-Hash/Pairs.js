function pairs(k, arr) {
    // Write your code here
    let pair = new Map();
    var count = 0;
    arr.forEach(num => {
        pair.set(num, num); 
    });
    
    arr.forEach(num =>{
        let target = pair.get(num) - k;
        if(pair.has(target)){
            count++;
        }
    })
    return count;

}
// Add each into a pair and then create another arr to see if it has target and increase count