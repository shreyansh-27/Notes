
# Effects

A function in programming is said to have a "side effect" if it interacts with anything outside its local scope, such as modifying the browser's DOM, making a network request, or using timers. 

Effects are used to keep a component synchronised with some external system

# UseEffect Dependency array

We pass a dependency array to the useEffect hook
It tells it when to run itself

if array is empty -> run when app mounted
else we need to provide every prop and state to it
It's like a event listener for the props and state

```
useEffect(fn, [a,b,c])
mounts on render and re-renders triggered by updating a, b and c

useEffect(fn, [])
runs on mount(initial render)

useEffect(fn)
runs on every render, sync with everything
```

## When are effects executed 
Mount 
commit -> result of rendering commited to dom
browser paint -> result of above painted on browser
effect -> after paint effect execute

some effect happens

re-render
commit
LAYOUT EFFECT
BROWSER PAINT
CLEANUP
EFFECT

Unmount
Cleanup -> optional Function that we can return from an effect

WHY? Because the effect may contains a fetch that will take time so user will see an old version for a long time
also
**If effect sets state another render will take place, so don't overuse them**

### Cleanup

Runs two times
1. before effect executed again
2. component unmounted

Neccesary when side effects keep happening after the component has been re-rendered or unmounted

To use cleanup function
```
useEffect(fn{
    return cleanUpfunc(); // with our logic
}, [])
```

> Each effect should only do one thing

## Abort Controller
used to abort request whenever a new keystroke is pressed
used with fetch

```
useEffect(function(){

    async function fetchMovies(){
        const res = await fetch('http://ww.mewo.com', {signal: controller.signal});

    }

    fetchMovies();
    
    return function(){
        controller.abort();
    } // this function will be called whenever a rerender happens
}
, []);

```