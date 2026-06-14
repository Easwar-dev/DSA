class Stack:
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return len(self.stack) == 0

    def push(self,element):
        self.stack.append(element)

    def pop(self):
        if self.isEmpty():
            return "Stack is empty"
        return self.stack.pop()

    def peek(self):
        if self.isEmpty():
            return "Stack is empty"
        return self.stack[-1]

    def size(self):
        return len(self.stack)

# Create a stack object
myStack = Stack()

myStack.push("DSA")
myStack.push("DBMS")
myStack.push("OS")
myStack.push("NW")

print("Stack: ", myStack.stack)
print("Pop: ", myStack.pop())
print("Stack after Pop: ", myStack.stack)
print("Peek: ", myStack.peek())
print("isEmpty: ", myStack.isEmpty())
print("Size: ", myStack.size())


# output
'''
    Stack:  ['DSA', 'DBMS', 'OS', 'NW']
    Pop:  NW
    Stack after Pop:  ['DSA', 'DBMS', 'OS']
    Peek:  OS
    isEmpty:  False
    Size:  3
'''