#Finds all the combinations of English Currency that will make two Euros
#1p, 2p, 5p, 10p, 20p, 50p, Euro (100p) and Euro2 (200p).
def combosToSum(target):
    #Algorithm came from http://www.mathblog.dk/project-euler-31-combinations-english-currency-denominations/    
    #Saw the answer before solving myself so this is not my solution
    #For loop through all coefficients
    #Limit the coefficients to values that would make that coin go over by itself
    target = int(target)
    counter = int(0)
    twoHundred = 0
    while twoHundred <= target:
        oneHundred = twoHundred
        twoHundred += 200
        while oneHundred <= target: 
            fifty = oneHundred
            oneHundred += 100
            while fifty <= target:
                twenty = fifty
                fifty += 50
                while twenty <= target:
                    ten = twenty
                    twenty += 20
                    while ten <= target:
                        five = ten
                        ten += 10
                        while five  <= target:
                            two = five
                            five += 5
                            while two  <= target:
                                two += 2
                                counter += 1
    return counter
answer = combosToSum(200)
print("The number of possible combinations is",answer)
