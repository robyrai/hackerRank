# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def middleNode(head: Optional[ListNode]) -> Optional[ListNode]:
    l = []
    if head is None:
        return None
    if head.next is None:
        return head
    currNode = head
    while True:
        l.append(currNode)
        if (currNode.next is None):
            break
        currNode = currNode.next
    if len(l) % 2 == 0:
        return l[round(len(l) / 2)]
    return l[round((len(l) + .1) / 2) - 1]


if __name__ == '__main__':
    n5 = ListNode(5, None)
    n4 = ListNode(4, n5)
    n3 = ListNode(3, n4)
    n2 = ListNode(2, n3)
    n1 = ListNode(1, n2)
    print(middleNode(n1))
