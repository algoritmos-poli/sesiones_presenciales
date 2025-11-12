def insertion_sort_inst(arr):    
    print("=" * 60)
    print(f"start -> arr: {arr}")    
    pasada = 0
    for i in range(1, len(arr)):
        pasada += 1
        key = arr[i] 
        j = i - 1    
        print(f"- pasada [{pasada}]: {arr} -> key = {key}")     
        while j >= 0 and key < arr[j]:
            print(f"    {arr}: arr[{j}] = {arr[j]} > key = {key} ({arr[j] > key}) -> shift")
            arr[j + 1] = arr[j]
            j -= 1            
        arr[j + 1] = key
    print(f"end -> arr: {arr}")
    print("=" * 60)
    return arr

# Prueba rápida
L_original = [29,10,14,37,13]
L_ordenada = insertion_sort_inst(L_original[:])

print("--------------- Resultado --------------------")
print(f"Lista original: {L_original}")
print(f"Lista ordenada: {L_ordenada}")
print("----------------------------------------------")