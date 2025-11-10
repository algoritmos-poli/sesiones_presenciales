def selection_sort_inst(arr):
    print("=" * 60)
    print(f"start -> arr: {arr}")    
    n = len(arr)    
    for i in range(n-1):
        min_idx = i
        print(f"- pasada [{i + 1}]: {arr}")     
        for j in range(i+1,n):
            print(f"{arr}: [min_index = {min_idx}] ", end = " ")
            if arr[j] < arr[min_idx]:
                min_idx = j 
                print(f"-> swap: [min_index = {min_idx}]",end = " ")        
            print()
        arr[i], arr[min_idx] = arr[min_idx], arr[i]     
        print("-" * 60)    
    print(f"end -> arr: {arr}")
    print("=" * 60)
    return arr

L_original = [29,10,14,37,13]
# L_ordenada = bubble_sort(L_original)
L_ordenada = selection_sort_inst(L_original[:])