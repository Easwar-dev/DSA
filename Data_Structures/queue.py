class Queue:
    def __init__(self):
        self.queue = []

    def enqueue(self, element):
        self.queue.append(element)

    def dequeue(self):
        if self.isEmpty():
            return "Queue is empty"
        return self.queue.pop(0)

    def peek(self):
        if self.isEmpty():
            return "Queue is empty"
        return self.queue[0]

    def isEmpty(self):
        return len(self.queue) == 0

    def size(self):
        return len(self.queue)

# let's create object for Queue
myQueue = Queue()

myQueue.enqueue("A")
myQueue.enqueue("B")
myQueue.enqueue("C")

print("Queue: ", myQueue.queue)
print("Peek: ", myQueue.peek())
print("Dequeue: ", myQueue.dequeue())
print("Queue after Dequeue: ", myQueue.queue)
print("isEmpty: ", myQueue.isEmpty())
print("size: ", myQueue.size())

# output
"""
Queue:  ['A', 'B', 'C']
Peek:  A
Dequeue:  A
Queue after Dequeue:  ['B', 'C']
isEmpty:  False
size:  2
"""