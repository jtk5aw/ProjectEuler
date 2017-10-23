# Defines method to find divisors
def findDivisors(number):
    divisors = []
    for n in range(1, (int)(number**(1/2))):
        if(number % n == 0):
            divisors.append(number/n)
            divisors.append(number/(number/n))
    return divisors

#Will check all triangular numbers#

#Variables
n = 0
currTriangle = 1
numDivisors = 0
currDivisors = []

# Series of Triangular numbers = n(n+1)/2
while(numDivisors <= 500):
    #Prepares for the new Iteration
    n += 1
    currTriangle = n * (n+1)/2
    #Finds the Number of divisors
    currDivisors = findDivisors(currTriangle)
    numDivisors = len(currDivisors)

#prints result
print(numDivisors, currTriangle)
