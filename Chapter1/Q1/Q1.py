# Solution1 : sort
def isUnique1(str):
    temp = sorted(str)
    for i in range(1,len(temp)):
        if temp[i]==temp[i-1]:
            return False
    return True

# Solution2 : ASCII Pool
def isUnique2(str):
    pool = [0 for i in range(128)]
    for i in range(len(str)):
        if pool[ord(str[i])]>0:
            return False
        else:
            pool[ord(str[i])]+=1
    return True

def isUnique3(str):
    pool = 0
    for i in range(len(str)):
        temp = ord(str[i])-ord('a')
        if (pool&(1<<temp))>0:
            return False
        else:
            pool|=1<<temp
    return True

a = "akddpol"
b = "zbcdet"
print isUnique3(a) , isUnique3(b)