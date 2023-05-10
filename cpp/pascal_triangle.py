numRows = 5
ans = [[1]]
if(numRows == 1) :
    print(ans)



for i in range(1, numRows) :
    pas = [1]
    for j in range(len(ans[i-1])-1) :
        pas.append(ans[i-1][j] + ans[i-1][j+1])
    pas.append(1)
    ans.append(pas)

print(ans)