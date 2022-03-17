# You are given a two-dimensional array of sales data where
# the first column is a product ID and the second column is the quantity.
# Write a function to take this list of data and return a new
# two-dimensional array with the total sales for each product ID.
# Example
# Input:
# 211, 4
# 262, 3
# 211, 5
# 216, 6

# Output:
# 211, 9
# 262, 3
# 216, 6
# Hi

def calc_prod_qty(prod_qty_list: list[tuple]) -> list[tuple]:
    prod_idx_map = dict()  # {211: 0, 262: 1,...}
    result = []  # [(211, 4),...]
    idx_ctr = 0
    for i, prod_qty in enumerate(prod_qty_list):
        prod = prod_qty[0]
        qty = prod_qty[1]
        if prod in prod_idx_map:
            existing_qty = result[prod_idx_map[prod]][1]
            new_qty = existing_qty + qty
            result[prod_idx_map[prod]] = (prod, new_qty)
        else:
            prod_idx_map[prod] = idx_ctr
            idx_ctr += 1
            result.append((prod, qty))
    return result


if __name__ == '__main__':
    l1 = [(211, 4), (262, 3), (211, 5), (216, 6)]
    print(calc_prod_qty(l1))
