# This was asked in amazon initial round coding test to me
# Find the number of swaps while traversing left to right through a list and swapping a number (current item)
# only when there is a number smaller than itself and being the lowest in the remaining list

def how_many_swaps(arr):
    swaps = 0
    temp_arr = arr.copy()
    for i in range(len(arr) - 1):
        if temp_arr[i] > min(temp_arr[i+1:]):
            temp_num = temp_arr[i]
            ind = temp_arr[i+1:].index(min(temp_arr[i+1:])) + i + 1
            temp_arr[i] = min(temp_arr[i+1:])
            temp_arr[ind] = temp_num
            swaps += 1
    return swaps


if __name__ == "__main__":
    print(how_many_swaps([7, 2, 1, 8, 4, 9]))
