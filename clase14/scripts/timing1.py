"""
File: timing1.py
Prints the running times for problem sizes that double,
using a single loop.
"""
import time
problemSize = 10000000
print(f'{"Problem Size":>12}{"Seconds":>16}')
for count in range(5):
    
    start = time.time()
    # The start of the algorithm
    work = 1
    for x in range(problemSize):
        work += 1
        work -= 1
    # The end of the algorithm
    elapsed = time.time() - start
    
    print(f"{problemSize:12d}{elapsed:16.3f}")
    problemSize *= 2