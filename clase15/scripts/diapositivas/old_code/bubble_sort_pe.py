def bubble_sort_inst(arr):
    print("=" * 60)
    print(f"start -> arr: {arr}")    
    n = len(arr)    
    for i in range(n - 1):        
        print(f"- pasada [{i + 1}]: {arr}")
        swapped = False
        for j in range(0, n - i - 1):
            print(f"{arr}: arr[{j}] = {arr[j]} - arr[{j + 1}] = {arr[j + 1]} ({arr[j] > arr[j + 1]})")
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True            
        if not swapped:
            break        
        print("-" * 60)    
    print(f"end -> arr: {arr}")
    print("=" * 60)
    return arr

# L_original = [29,10,14,37,13]
L_original = [8,5,3,1]
print(f"Arreglo original (desordenado): {L_original}")
# L_ordenada = bubble_sort(L_original)
L_ordenada = bubble_sort_inst(L_original[:])
print(f"Arreglo resultante (ordenado): {L_ordenada}")