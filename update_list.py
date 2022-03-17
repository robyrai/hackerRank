# Given a sorted array of positive integers with
# an empty spot (zero) at the end,
# insert an element in sorted order.
# insert_element([1, 4, 7, 8, 9, 0], 6) => [1, 4, 6, 7, 8, 9]

def insert_element(sorted_arr, new_element):
    first_half = []
    second_half = []
    for i, element in enumerate(sorted_arr):
        if element > new_element:
            first_half = sorted_arr[:i - 2]
            second_half = sorted_arr[i - 2:-1]
    first_half.append(new_element)
    res = first_half + second_half
    return res


if __name__ == '__main__':
    l = [1, 4, 7, 8, 9, 0]
    e = 6
    print(insert_element(l, e))
