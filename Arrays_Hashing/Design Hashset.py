# Algorithm
# Initialize an array of 10000 buckets, each with a dummy head node.
# Define hash(key) as key % 10000.
# For add(key): Traverse the list at hash(key). If the key already exists, return. Otherwise, append a new node with the key.
# For remove(key): Traverse the list at hash(key). If a node with the matching key is found, remove it by updating the previous node's next pointer.
# For contains(key): Traverse the list at hash(key). Return true if the key is found, false otherwise.

class ListNode:
    def __init__(self, key: int):
        self.key = key
        self.next = None

class MyHashSet:

    def __init__(self):
        self.set = [ListNode(0) for _ in range(10**4)]

    def add(self, key: int) -> None:
        cur = self.set[key % len(self.set)]
        while cur.next:
            if cur.next.key == key:
                return
            cur = cur.next
        cur.next = ListNode(key)

    def remove(self, key: int) -> None:
        cur = self.set[key % len(self.set)]
        while cur.next:
            if cur.next.key == key:
                cur.next = cur.next.next
                return
            cur = cur.next

    def contains(self, key: int) -> bool:
        cur = self.set[key % len(self.set)]
        while cur.next:
            if cur.next.key == key:
                return True
            cur = cur.next
        return False