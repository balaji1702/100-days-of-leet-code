const containsDuplicate = (arr) => {
    if([...new Set(arr)].length !== arr.length){
        return true
    } else {
        return false
    }
}

console.log(containsDuplicate([2,14,18,22]
    ));
