a = [10, 2]

ans = []
result  = 0
for i in range(len(a)) :
    for j in a :
        s = str(a[i])+str(j)
        ans.append(s)
        print(s)
        
for num in ans :
    result = result + int(num)
    
print(result)