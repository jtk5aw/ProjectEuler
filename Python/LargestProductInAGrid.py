#Defines product checking method
def checkSpot(arr, currRow, currCol):
    maxSum = 0
    temp = 0
    currR = int(currRow)
    currC = int(currCol)
    if currR <= len(arr) - 4:
        temp = arr[currR][currCol] * arr[currR+1][currC] * arr[currR+2][currC] * arr[currR+3][currC]
        maxSum = max(maxSum, temp)
    if currR >= 3:
        temp = arr[currR][currCol] * arr[currR-1][currC] * arr[currR-2][currC] * arr[currR-3][currC]
        maxSum = max(maxSum, temp)
    if currC <= len(arr[currR]) - 4:
        temp = arr[currR][currCol] * arr[currR][currC+1] * arr[currR][currC+2] * arr[currR][currC+3]
        maxSum = max(maxSum, temp)
    if currC >= 3:
        temp = arr[currR][currCol] * arr[currR][currC-1] * arr[currR][currC-2] * arr[currR][currC-3]
        maxSum = max(maxSum, temp)
    if currR <= len(arr) - 4 and currC <= len(arr[currR]) - 4:
        temp = arr[currR][currCol] * arr[currR+1][currC+1] * arr[currR+2][currC+2] * arr[currR+3][currC+3]
        maxSum = max(maxSum, temp)
    if currR <= len(arr) - 4 and currC >= 3:
        temp = arr[currR][currCol] * arr[currR+1][currC-1] * arr[currR+2][currC-2] * arr[currR+3][currC-3]
        maxSum = max(maxSum, temp)
    if currR >= 3 and currC <= len(arr[currR]) - 4:
        temp = arr[currR][currCol] * arr[currR-1][currC+1] * arr[currR-2][currC+2] * arr[currR-2][currC+3]
        maxSum = max(maxSum, temp)
    if currR >= 3 and currC >= 3:
        temp = arr[currR][currCol] * arr[currR-1][currC-1] * arr[currR-2][currC-2] * arr[currR-3][currC-3]
        maxSum = max(maxSum, temp)
    return maxSum
#Reads in the input and instantiates list of rows
data = open('LargestProductInAGrid.txt', 'r')
rows = []

#list of all the rows
for line in data:
    edit = line[0:len(line) - 1]
    rows.append([int(i) for i in edit.split(" ")])
#finds the maximum sum
maxVal = 0
for i in range(0, len(rows)):
    for j in range(0, len(rows[i])):
        maxVal = max(maxVal, checkSpot(rows, i, j))
print(maxVal)
data.close()
