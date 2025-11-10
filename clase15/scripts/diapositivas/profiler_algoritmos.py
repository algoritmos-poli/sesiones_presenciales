import csv
import random
import time
import copy # Importante para copiar las listas

# --- 1. ALGORITMOS CON PROFILER ---

def bubble_sort_profiled(arr):
    # --- 1. Inicializar contadores ---
    comparisons = 0
    swaps = 0
    
    n = len(arr)
    for i in range(n):
        swapped = False
        for j in range(0, n - i - 1):
            
            # --- 2. Contar la comparación ---
            comparisons += 1
            if arr[j] > arr[j + 1]:
                
                # --- 3. Contar el intercambio ---
                swaps += 1
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
                
        if not swapped:
            break
            
    # --- 4. Devolver los resultados ---
    return arr, comparisons, swaps


def selection_sort_profiled(arr):
    # --- 1. Inicializar contadores ---
    comparisons = 0
    swaps = 0
    
    n = len(arr)
    # El bucle externo solo necesita ir hasta n-1
    for i in range(n - 1):
        
        # Asume que el mínimo es el primer elemento de la parte no ordenada
        min_idx = i
        
        # Bucle interno para encontrar el mínimo real
        for j in range(i + 1, n):
            
            # --- 2. Contar la comparación ---
            comparisons += 1
            if arr[j] < arr[min_idx]:
                min_idx = j # Encontraste un nuevo mínimo
        
        # --- 3. Contar el intercambio (¡fuera del bucle j!) ---
        # Solo intercambia si el mínimo no es ya la posición i
        if min_idx != i:
            swaps += 1
            arr[i], arr[min_idx] = arr[min_idx], arr[i]
            
    # --- 4. Devolver los resultados ---
    return arr, comparisons, swaps

def insertion_sort_profiled(arr):
    # --- 1. Inicializar contadores ---
    comparisons = 0
    shifts = 0  # Movimientos de datos (no intercambios)

    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1

        # Este bucle 'while' es el motor de comparación y desplazamiento
        while j >= 0:
            
            # --- 2. Contar la comparación ---
            comparisons += 1
            if key < arr[j]:
                
                # --- 3. Contar el desplazamiento ---
                shifts += 1
                arr[j + 1] = arr[j]
                j -= 1
            else:
                # La comparación (key < arr[j]) fue Falsa, 
                # así que encontramos el lugar y salimos del 'while'
                break
        
        arr[j + 1] = key
            
    # --- 4. Devolver los resultados ---
    return arr, comparisons, shifts

# --- 2. GENERADORES DE CASOS DE PRUEBA ---

def generate_average_case(n):
    """Genera una lista de n números únicos, en orden aleatorio."""
    arr = list(range(n))
    random.shuffle(arr)
    return arr

def generate_best_case(n):
    """Genera una lista de n números ya ordenados."""
    return list(range(n))

def generate_worst_case(n):
    """Genera una lista de n números en orden inverso."""
    return list(range(n, 0, -1))

# --- 3. CONFIGURACIÓN DEL TESTBENCH ---

# Lista de algoritmos a probar
algorithms_to_test = [
    ("Bubble Sort", bubble_sort_profiled),
    ("Selection Sort", selection_sort_profiled),
    ("Insertion Sort", insertion_sort_profiled)
]

# Configuración de la prueba de doblaje
# n = [50, 100, 200, 400, 800]
# (Puedes agregar más si tienes tiempo, ej. 1600, 3200...)
# NOTA: ¡Los algoritmos O(n^2) se vuelven MUY LENTOS rápido!
sizes = [50, 100, 200, 400, 800, 1600, 3200, 6400] 

# Casos de prueba
cases = {
    "Average Case": generate_average_case,
    "Best Case": generate_best_case,
    "Worst Case": generate_worst_case
}

# Archivo de salida
output_filename = "sorting_profile_results.csv"
results = []


# --- 4. EJECUCIÓN DEL TESTBENCH ---

print("--- Iniciando Testbench de Algoritmos de Ordenamiento ---")

for case_name, generator_func in cases.items():
    print(f"\n--- Probando Caso: {case_name} ---")
    
    for n in sizes:
        print(f"Generando lista de tamaño n={n}...")
        # Genera la lista base para este tamaño y caso
        base_list = generator_func(n)
        
        for algo_name, algo_func in algorithms_to_test:
            
            # ¡IMPORTANTE! Copia la lista para que cada algo ordene la misma
            list_to_sort = base_list.copy() 
            
            print(f"  Ejecutando {algo_name} (n={n})...")
            
            # Ejecuta el profiler
            start_time = time.time()
            sorted_list, comps, moves = algo_func(list_to_sort)
            end_time = time.time()
            
            duration_ms = (end_time - start_time) * 1000
            
            # Almacena el resultado
            results.append({
                "Algorithm": algo_name,
                "Case": case_name,
                "Size (n)": n,
                "Comparisons": comps,
                "Movements": moves,
                "Time (ms)": duration_ms
            })

print("\n--- Testbench completado ---")

# --- 5. GUARDANDO RESULTADOS EN CSV ---

# Escribir los resultados en el archivo CSV
with open(output_filename, 'w', newline='') as csvfile:
    # Definir los nombres de las columnas
    fieldnames = ["Algorithm", "Case", "Size (n)", "Comparisons", "Movements", "Time (ms)"]
    writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
    
    writer.writeheader() # Escribe la fila de encabezado
    for row in results:
        writer.writerow(row) # Escribe cada fila de resultados

print(f"\n¡Resultados guardados exitosamente en '{output_filename}'!")


