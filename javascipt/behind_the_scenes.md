# EcmaScript 

It's the way everything in modern JS is modeled after
It's the specification that every JS engine needs to implement
That doesn't mean every engine does include every feature present in EcmaScript, they can choose what to and what not to keep


## EcmaScript 5
The first important version of Ecmascript was ES5
It was the progenitor of what is now called the modern javascript

Supported by every browser there is, including Internet explorer
**One important thing to note is that it only had var, no let and const**

## EcmaScript 6
The modern Javascript
Introduced in 2015 
Has many features that help us write better, cleaner and faster code.
Can be transpiled into ES5
Still under development 

## var vs let vs const

| var | let | const |
|-----|-----|-------|
|Creates a variable|Creates a variable|Creates a variable|
|Available since beginning|since ES6|since ES6|
|Function and global scope|Block Scope|Block Scope|


### let


```
let name = "Max";
let name = "Meow"; // This too will throw an error

function greet(){
    let age = 30;
    console.log(name, age);
    // This will print name and age: Max, 30
}

console.log(name, age);
// name will be printed but age will throw a
> Uncaught ReferenceError: age is not defined

```

### const
```
const name = "Max";
const name = "Meow"; // This too will throw an error

function greet(){
    const age = 30;
    console.log(name, age);
    // This will print name and age: Max, 30
}

console.log(name, age);
// name will be printed but age will throw a
> Uncaught ReferenceError: age is not defined

```

### var

```
var name = "Max";
var name = "Meow"; 
> This will not throw an error, instead change name to Meow

function greet(){
    var age = 30;
    console.log(name, age);
    // This will print name and age: Max, 30
}

console.log(name, age);
// This too will print name and age: Max, 30
// Even though age is defined in block scope
```
