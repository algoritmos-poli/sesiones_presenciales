#-----------------------------------------------------------------------
# threesum.py
#-----------------------------------------------------------------------

import stdio
from stopwatch import Stopwatch

def readInt1D(filename):
    try:
        a = []
        with open(filename) as f:
            for line in f:
                a.append(int(line.strip()))
        return a
    except FileNotFoundError:
        print(f"Error: El archivo '{filename}' no fue encontrado.")
    except Exception as e:
        print(f"Ocurrió un error: {e}")    

        


#-----------------------------------------------------------------------

# Write to standard output the triples in array a that sum to 0.

def writeTriples(a):
    n = len(a)
    for i in range(n):
        for j in range(i+1, n):
            for k in range(j+1, n):
                if (a[i] + a[j] + a[k]) == 0:
                    # stdio.writef('%d %d %d\n', a[i], a[j], a[k])
                    print(f"{a[i]} {a[j]} {a[k]}")

#-----------------------------------------------------------------------

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

# Read an array of integers from standard input. Write to standard
# output the count of triples in the array that that sum to 0. If
# the count is low, then also write the triples.

def main():
    file = "2Kints.txt"
    print(f"Leyendo datos del archivo: {file}")    
    a = readInt1D(file)    
    print(f"Arreglo de {len(a)} enteros leído.")
    print(f"Contando ternas que suman 0... ")
    watch = Stopwatch()  # Iniciar el cronómetro
    count = countTriples(a)    
    elapsed_time = watch.elapsedTime() # Detener el cronómetro
    print(count)    
    print(f"Tiempo transcurrido: {elapsed_time:.8f} segundos")
    if count < 10:
        writeTriples(a)
    

if __name__ == '__main__':
    main()

#-----------------------------------------------------------------------

# python threesum.py < 8ints.txt
# 4
# 30 -30 0
# 30 -20 -10
# -30 -10 40
# -10 0 10

# python threesum.py < 1Kints.txt
# 0

# python threesum.py < 2kints.txt
# 2
# 391930676 -763182495 371251819
# -326747290 802431422 -475684132

# python threesum.py < 4kints.txt
# ...

# python threesum.py < 8kints.txt
# ...

# python threesum.py < 16kints.txt
# ...

# python threesum.py < 32kints.txt
# ...

# python threesum.py < 64kints.txt
# ...

# python threesum.py < 128kints.txt
# ...

