# You are given a string containing characters  and  only. Your task is to change it into a string such that there are no matching adjacent characters. To do this, you are allowed to delete zero or more characters in the string.

# Your task is to find the minimum number of required deletions.

# Example

# Remove an  at positions  and  to make  in  deletions.

def alternatingCharacters(s):
    # Write your code here
    s_list = [i for i in s]
    deletions = 0
    for i in range(len(s_list) - 1):
        if s[i] == s[i+1]:
            deletions += 1
    return deletions
