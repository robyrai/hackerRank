# This coding challenge was asked in amazon initial screening
# Find the max storage area in a warehouse given the number of partitions (each 1 unit length) in x and y axis as int n and int m
# h and v are the list that tells you which partitons will be removed from the container
# calculate the max area available after the removal of partitions in both axes

def storage(n, m, h, v):
    if not h and not v:
        return m * n
    row = list(range(n + 2))
    col = list(range(m + 2))
    rem_row_mesh = list(set(row) - set(h))
    rem_col_mesh = list(set(col) - set(v))
    inter_row_dist = [rem_row_mesh[i + 1] - rem_row_mesh[i] for i in range(len(rem_row_mesh) - 1)]
    inter_col_dist = [rem_col_mesh[i + 1] - rem_col_mesh[i] for i in range(len(rem_col_mesh) - 1)]
    return max(inter_row_dist) * max(inter_col_dist)


if __name__ == "__main__":
    print(storage(6, 6, [2, ], [2, ]))
