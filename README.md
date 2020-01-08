# rope-kata
This kata aims at practicing:
* using the powerful *Visitor Pattern*, 
* working with immutable data structures, and 
* writing pretty simple tests.

The task is to implement the missing methods in the Rope class.

Example tests and a single method are included, ready to go.

# About ropes
Strings are a very useful programming tool, but in many languages they are immutable, this usually means that inserting or deleting is quite slow, as we have to copy the entire string. An alternative to strings is ropes. Ropes represent strings as a binary tree, with native strings on the leafs and store the length of all the strings in the left subtree on each node. Example:
```
            _11_
          _/    \_
         /        \
       _6_    "_Sailor":7
     _/   \__
    /        \
"Hello_":6 "there":5 
```