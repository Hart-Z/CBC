

class BTree:
    def __init__(self,v,l=None,r=None ,visited = False):
        self.val = v
        self.l = l
        self.r = r
        self.visited = visited
    
    def is_leaf(self):
        return self.l==None and self.r== None

def DFS(root):
    stack = []
    stack.append(root)

    while stack:
        curr = stack.pop()
        print root.val
        root.visited = True
        if root.r != None and not root.r.visited:
            stack.append(root.r)
        if root.l!=None and not root.l.visited:
            stack.append(root.l)