# Bubble sort : 
- It's an in-place algorithm
- time complexity is O(n2) or quadratic algo.
- not suitable for large data sets as its average and worst-case time complexity is quite high.
- works by repeatedly swapping the adjacent elements if they are in the wrong order.
- algorithm degrades quickly

# how it works?
- compare executive items
- if they are not in correct place then swap them
- repeat the iteration until we get the right order

# stable and unstable sort
- stable sort algorithm preserves the relative ordering of duplicate items.
- unstable sort algorithm does not.

--------------------------------------------------------------------------------------------------------

# Selection Sort :
- It's an in-place algorithm
- time complexity is O(n2) or quadratic algo.
- Doesn't require much swapping like bubble sort
- unstable algorithm

# how it works?
- find last index
- declare a largest value as a 0
- then compare if i > i+1, set the largest value to i if we find the bigger number
- then swap largest with last index

--------------------------------------------------------------------------------------------------------

# Insertion Sort : 
- definition : Insertion sort chooses which element to insert using a gap value of one.So every time insertion sort runs, 
it picks of the first unsorted value, and it compares that value to its neighbour, and 
it keeps shifting the neighbour to the right until it finds the correct insertion point for the element that it's inserting.
- In-place algorithm
- O(n2)
- stable algorithm


# how it works?
- first shift and then store the sorted value
- meaning we take an element that we want to sort. 
- then we will compare it with all its left elements until we find the greater or smaller based or the shorting order.
- then we shift the element
- at last, we assign it to the right place

--------------------------------------------------------------------------------------------------------

# Merge sort :
- not In-place algorithm
- O(nlogn)-base 2 
- stable sort algorithm


- it divides and conquer algorithm because it involves splitting that array you want to sort into a bunch of small arrays.
- it usually implemented using recursion.
- it has two phase -
  - first is splitting (top to bottom)
  - second is merging (bottom to top)
- we do the sorting during merging phase
- we don't use the new array for splitting
- we use indices to keep track of where the array has split

# how does it work?
- start = 0 and end = array.length
- midpoint = (start + end)/2


--------------------------------------------------------------------------------------------------------
# Quick sort 
- it is partition exchange algorithm


# how does it work?
- follow recursive algorithm
1. we first choose pivot element or a random element from the giving array
2. complete array divides into sub array; that know as partitioning
3. we will partition the array in such way all the elements < pivot element would be left side of the array and 
all the elements > pivot element would be right side of the array. and element = pivot will go either side of array
4. we repeat the 3 step until we get one element of element.

--------------------------------------------------------------------------------------------------------