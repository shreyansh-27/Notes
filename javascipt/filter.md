# Filter

Creates a new array with the elements that pass the test implemented in the provided function

```
nums.filter(n => {return n % 2 ==0;})
```
# Some and Every
Always return true or false
## Some 
Similar to every but returns true if any of the array elements pass the test function

## every
returns true if all elemts pass the test in function


# Reduce
Executes a reducer function on every element, resulting in a single value
```
array.reduce((accumulator, curElement)=>{
    return accumulator + curElement;
})
```
