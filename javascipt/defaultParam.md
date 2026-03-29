# Default param
We can pass default params in case no value is passed to the function
```
function rollDie(sides = 6){
    return Math.floor(Math.random() * sides) + 1;
}
```

> But make sure the default param is the last param in the param list

```
function meow(name, greet = "Hello"){
    console.log(`${greet}, ${name}`)
}

```