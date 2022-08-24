from typing import List


def kWeakestRows(mat: List[List[int]], k: int) -> List[int]:
    strength = {i: sum(j) for i, j in enumerate(mat)}
    srtd = sorted(strength.items(), key=lambda x: (x[1], x[0]))
    return [i[0] for i in srtd[:k]]


if __name__ == '__main__':
    mat = [
            [1, 1, 0, 0, 0],
            [1, 1, 1, 1, 0],
            [1, 0, 0, 0, 0],
            [1, 1, 0, 0, 0],
            [1, 1, 1, 1, 1]
           ]
    print(kWeakestRows(mat, 3))
