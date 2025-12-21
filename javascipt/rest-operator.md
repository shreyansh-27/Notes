# Rest Operator(...)

Sometimes when we can't use arrays for some reasons to pass data
Or maybe we don't know how many arguments we might be recieving, so we use the rest operator

```
function func(...data){
    for(const num of data){
        console.log(num);
    }
}
```

The rest operator must be used at the end of the parameters list
```
function func(...data, a){} -> ❌
function func(a, ...data){} -> ✅
```

## Argument keyword

Before we had rest operator, we had the argument keyword
```
function func(){
    for(const num of argument){
        console.log(num);
    }
}
```
We don't even pass it as an argument, we just use it
> Note that it is not being used nowadays

