#Program for finding the sum of all numbers who are the fifth power sum of all there digits
def findIf5thPowerSum(n):
    sum = int(0)
    index = int(0)
    for i in range(int(0), len(n)):
        sum = sum + int(n[i])**5
    if(sum == int(n)):
        return True
    else:
        return False

totalSum = int(0)
for x in range(2, 1000000):
    if(findIf5thPowerSum(str(x))):
        print(x)
        totalSum += int(x)
print(totalSum)
