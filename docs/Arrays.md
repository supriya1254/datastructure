# Arrays
- is a fixed size sequenced collection of data items of same data type.
- stored in 'one contiguous block' in memory.
- static length
- every element occupies the same amount of space in memory
  - Q : what if we store the array as string? because string can have different length of size.
  - A : String is an object in java, when we try to store array as type string, it stored as a reference in memory and 
  each reference of a string object has same size.
- calculate the memory address of ith element 
  - formula : x + i * y where x is base or start address, y is size, 'i' is an element.
- its memory efficient.
- Types of array
  - Single dimensional (single row or single column)
    - 1-D [] 
  - multi-dimensional (multiple row and multiple column)
    - 2-D array [] []
    - 3-D array

# to access an array?
- arrayName[index]

# here are some operations in array:
- Traversal 
- Insertion
- Deletion
- Searching
- Sorting

# matrix and jagged array : 
- when no. of row and columns are fixed but in case of jagged array no. column are not fixed.

# Retrieve element from an array
- no matter how many elements are we retrieving,  we just need 3 steps. Hence, it is constant time complexity or O(1).
    1. Multiply the size of the element by its index.
    2. Get the start address of the array. 
    3. Add the start address to the result of the multiplication.


# big-O of array with respect to algorithm
- when we don't know the index of element then its linear manner (O(n)). Hence 'Searching' because code requires the loop.
- when we know the index of the element then it's constant (O(1)). Hence 'Retrieving' because code doesn't require the loop.
