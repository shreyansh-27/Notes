# React hooks
Special built-in functions that let us hook into react internals

    * Creating and accessing state from fibre tree
    * registering side effects in fibre tree
    * Manual DOM selection
  
## Rules of hooks
1. only call hooks at top level(not in conditionals, loops, nested func)
    This is neccesary so that hooks are called in the same order(hooks rely on this)
2. Can only be called from react functions
    i.e. in a functional component or a custom hook

> These rules are automatically enforced by a linter

### Hooks rely on call order
When our apps run, a virtual dom is created
On initial render, a fibre tree is also created of each element
Each fibre element contains props and a linked list of hooks
so each hooks points to the next
If a conditional exists in between two hooks and in case the condition is false
It will not be the part of the linked list but it contained the address to the next hook which is now inaccessible 