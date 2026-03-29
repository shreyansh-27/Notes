# Window
The top level object in javascript inside which everything lives, even object

Whenever we define a function like this: 
```
function scream(){
    console.log("aaahhhh");
}
```
and then call it
```
scream();
```
What we are actually doing is:
```
window.scream();
```
It auto gets added to the window object

So if we do this:
```
const sc = scream();
// and lets say the scream func has this: console.log(this);
// it will call the window function 
```

