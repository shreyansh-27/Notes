# Arguments object
Available inside every function
It's an array like object, has length but no push or pop method
Contains all the elements passed to the function
not available inside arrow function

```
function sum(){
    let total = 0;
    arguments.reduce((total, el)=> total + el);
}
```
This will not work
because arguments is not an array

Here comes the Rest Param

# Rest(...)
```
function sum(...nums){
    nums.reduce((total, el)=> total + el);
}
```
Now this is possible