# Set Timeout

SetTimeout function let us delay the call of something

```
SetTimeout(()=>Console.log("meow"), 3000)
```
This will run after 3 sec

# Set Interval

This will run somrthing after each interval
To stop this 
store it in a var or let or const, it returns the id
use stopInterval(id) to stop it