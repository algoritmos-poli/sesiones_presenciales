def selection_sort_inst(arr):
    print("=" * 60)
    print(f"start -> arr: {arr}")    
    n = len(arr)    
    for i in range(n-1):
        min_idx = i
        print(f"- pasada [{i + 1}]: sel = {arr[i]} - min_index = {min_idx}")     
        for j in range(i+1,n):            
            if arr[j] < arr[min_idx]:
                min_idx = j                      
            print(f"comparacion: ({arr[j]},{arr[min_idx]}) -> min_index = {min_idx} ")
        arr[i], arr[min_idx] = arr[min_idx], arr[i] 
        print(f"arr[{i}] <-> arr[{min_idx}] -> [{arr[i]}] <-> [{arr[min_idx]}] -> {arr}")    
        print("-" * 60)    
    print(f"end -> arr: {arr}")
    print("=" * 60)
    return arr

L_original = [29,10,14,37,13]
L_ordenada = selection_sort_inst(L_original[:])

print(f"Arreglo original (desordenado): {L_original}")
print(f"Arreglo resultante (ordenado): {L_ordenada}")