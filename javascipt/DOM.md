# DOM (Document Object Model)

Browser Api that lets us communicate with the different html elements present 
Can be accessed through document
which is actually window.document but the way JS works it automatically adds the window in front of document

```
document -> correct
window.document -> correct
```

## How is DOM created
For each tag in the html file
An element node is created
It starts with the html node, then head node and so on
In between these bigger nodes, the space between the nodes are also present as a node but not visible

Chrome dev tools gives us a way to select the last element we selected in the elements tab using $0

# Document
Document is an object in javascript
It is our entry point into the world of DOM
It contains representations of all the content on a page, plus tons of useful methods and properties