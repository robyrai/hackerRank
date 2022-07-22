# Complete the minimumSwaps function below.
def minimumSwaps(arr):
    swaps = 0
    res = arr.copy()
    tmp = 0
    for i in range(1, len(arr) + 1):
        if arr[i-1] == i:
            continue
        else:
            idx = find_idx(i, arr)
            arr[idx] = arr[i-1]
            arr[i-1] = i
            swaps += 1 
    return swaps
    
def find_idx(n, arr):
    for i, num in enumerate(arr):
        if num == n:
            return i
