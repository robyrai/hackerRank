from typing import Optional


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def isPalindrome(head: Optional[ListNode]) -> bool:
    if head.next is None or head is None:
        return True
    vals = []
    currNode = head
    while True:
        vals.append(currNode.val)
        if currNode.next is None:
            break
        currNode = currNode.next
    valsReversed = vals.copy()
    valsReversed.reverse()
    if vals == valsReversed:
        return True
    return False


if __name__ == '__main__':
    n4 = ListNode(1, None)
    n3 = ListNode(2, n4)
    n2 = ListNode(2, n3)
    n1 = ListNode(1, n2)
    print(isPalindrome(n1))
