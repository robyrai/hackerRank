def romanToInt(s: str) -> int:
    s2v_map = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    s2v = list(s2v_map)
    result = 0
    cs = [i for i in s]
    for idx, c in enumerate(cs):
        # if smaller comes before larger
        if idx + 1 < len(cs) and s2v_map.get(c) < s2v_map.get(cs[idx+1]):
            result -= s2v_map.get(c)
        else:
            result += s2v_map.get(c)
    return result


if __name__ == '__main__':
    print(romanToInt("MCMLXXXVII"))
