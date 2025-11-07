"""
File: timing_with_timeit.py
Measures execution times using the 'timeit' module 
for precise and reliable results.
"""
import timeit

problemSize = 10000000
print(f'{"Problem Size":>12}{"Seconds":>16}')

# The code we want to measure.
# We use 'n' as a variable, which will be defined in 'setup'.
stmt_to_run = """
work = 1
for x in range(n):
    work += 1
    work -= 1
"""

for count in range(5):
    
    # The 'setup' code that defines 'n' for this iteration.
    # It runs once before timing, without being timed.
    setup_code = f"n = {problemSize}"

    # timeit.timeit() runs the 'setup' and then measures the 'stmt'.
    # We run it 'number=1' time because the algorithm is already slow.
    elapsed = timeit.timeit(stmt=stmt_to_run, 
                             setup=setup_code, 
                             number=1)
    
    # Print the result of this measurement
    print(f"{problemSize:12d}{elapsed:16.3f}")
    
    # Double the size for the next iteration
    problemSize *= 2