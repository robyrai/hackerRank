from collections import Counter


#
# Complete the 'checkMagazine' function below.
#
# The function accepts following parameters:
#  1. STRING_ARRAY magazine
#  2. STRING_ARRAY note
#

def checkMagazine(magazine, note):
    # mag_list = magazine.split(" ")
    # note_list = note.split(" ")
    mag_dict = dict(Counter(magazine))
    note_dict = dict(Counter(note))
    print(mag_dict)
    print(note_dict)
    for k, v in note_dict.items():
        if k in mag_dict and v <= mag_dict[k]:
            continue
        else:
            print("No")
            return
    print("Yes")


if __name__ == '__main__':
    checkMagazine(["ive", "got", "a", "lovely", "bunch", "of", "coconuts"], ["ive", "got", "some", "coconuts"])
