a = input()
k = 0
ans = ''

for i in a :
    x = 9 - int(i)
    if(x < 5) :
        if(k == 0 and x == 0) :
            i = i
        else :
            i = str(x)
    ans += i
    k += 1
print(ans)