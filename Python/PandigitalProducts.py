#Finds all products that will be pandigital for 1-9 when multiplicands and products are included 
#Trying to determine the best way to solve this problem. Iteration of all possibilities will take too long
#IDEA: 
#Have a set that keeps track of the products
#Start with c1 < c2. Add one to c1 each iteration and find the product of the two numbers. Concatenate all integers as
#strings. If the length of this string is greater than or less than 9 this is automatically out of the question. 
#Check if the product is in the products set and if it is stop here as this product was already found. 
#Now check to see if all digits one through nine are present in the string. If they are, add the product to products
#and add one to c1.
#Once c1 == c2 or the string of c1, c2 and the prodcut added together is greater than 9 stop the loop and add one to c2
#while also reseting c1 to 1
#Continue until the length of 1, c2 and the product is greater than 9
