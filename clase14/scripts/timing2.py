"""
File: timing2.py
Prints the running times for problem sizes that double,
using a single loop.
"""
import time
problemSize = 10000000
print(f'{"Problem Size":>12}{"Seconds":>16}')
for count in range(5):
    
    # Se usa perf_counter() para una medición de alta precisión
    start = time.perf_counter()
    # The start of the algorithm
    work = 1
    for x in range(problemSize):
        work += 1
        work -= 1
    # The end of the algorithm
    
    # Se usa perf_counter() para calcular el intervalo
    elapsed = time.perf_counter() - start
    
    print(f"{problemSize:12d}{elapsed:16.3f}")
    problemSize *= 2