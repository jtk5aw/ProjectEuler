#Reads in the 50 digit numbers and sums them
bigSum = 0
data = open('LargeSum.txt', 'r')
for line in data:
    bigSum += int(line)
print(bigSum)
