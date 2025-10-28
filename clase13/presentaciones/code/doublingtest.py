#-----------------------------------------------------------------------
# doublingtest.py
#-----------------------------------------------------------------------


import random
import sys
import time

#-----------------------------------------------------------------------

class Stopwatch:

    # Construct self and start it running.
    def __init__(self):
        self._creationTime = time.perf_counter()  # Creation time

    # Return the elapsed time since creation of self, in seconds.
    def elapsedTime(self):
        return time.perf_counter() - self._creationTime

#-----------------------------------------------------------------------

def create1D(length, value=None):
    """
    Create and return a 1D array containing length elements, each
    initialized to value.
    """
    return [value] * length



#-----------------------------------------------------------------------

def seed(i=None):
    """
    Seed the random number generator as hash(i), where i is an int.
    If i is None, then seed using the current time or, quoting the
    help page for random.seed(), "an operating system specific
    randomness source if available."
    """
    random.seed(i)


#-----------------------------------------------------------------------

def uniformInt(lo, hi):
    """
    Return an integer chosen uniformly from the range [lo, hi).
    """
    return random.randrange(lo, hi)


# Return the number of triples in array a that sum to 0.

def countTriples(a):
    n = len(a)
    count = 0
    for i in range(n):
        for j in range(i+1, n):
            for k in range(j+1, n):
                if (a[i] + a[j] + a[k]) == 0:
                    count += 1
    return count

#-----------------------------------------------------------------------

# Return the time to solve a random instance of the threesum problem
# of size n.

def timeTrial(n):
    a = create1D(n, 0)
    for i in range(n):
        a[i] = uniformInt(-1000000, 1000000)
    watch = Stopwatch()
    count = countTriples(a)
    return watch.elapsedTime()

#-----------------------------------------------------------------------

# Accept integer n as a command-line argument. Write to standard output
# a table of doubling ratios for the threesum problem of size n, n*2,
# n*4, etc.

n = int(input("Ingrese el tamaño inicial n: "))
while True:
    previous = timeTrial(n // 2)
    current  = timeTrial(n)
    ratio = current / previous
    print(f"{n:7d} {current:4.2f}/{previous:4.2f} = {ratio:4.2f}")
    n *= 2

#-----------------------------------------------------------------------



