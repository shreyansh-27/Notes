# Loops

## For loop
The main thing to note is that in JS we have two additional type of for loops

### For of and For in
**For of**
This loop's main function is to loop through arrays
```
    for(let i of array){
        console.log(i);
    }
```
> *Remember to not use const instead of let*

**For in**
This loop was designed for iteration through objects
```
    for(const obj of object){
        console.log(obj)
    }
```
> *We can use const here because we're iterating through different objects*