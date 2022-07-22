def makeAnagram(a, b):
    # Write your code here
    a_list = [i for i in a]
    b_list = [i for i in b]
    for i in a_list.copy():
        if i in b_list:
           a_list.remove(i)
           b_list.remove(i)
        print("i = ", i)
        print(a_list)
        print(b_list)
    return len(a_list) + len(b_list)


if __name__ == '__main__':
    print(makeAnagram("showman", "woman"))
