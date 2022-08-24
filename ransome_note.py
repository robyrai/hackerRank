from collections import Counter


def canConstruct(ransomNote: str, magazine: str) -> bool:
    rns = [i for i in ransomNote]
    mgs = [i for i in magazine]

    rnd = dict(Counter(rns))
    mgd = dict(Counter(mgs))

    for k, v in rnd.items():
        if k not in mgd or mgd.get(k) - v < 0:
            return False
    return True


if __name__ == '__main__':
    print(canConstruct("acer", "brace"))
