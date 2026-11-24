a=int(input("enter the first number"))
b=int(input("enter the second number"))
c=int(input("enter the third number"))
if ((a>=1 and a<=60) and (b>=1 and b<=60) and (c>=1 and c<=60)):
    total=a+b+c
    result=180-total
    print(result)
else:
    print("check your values")
        
