print("welcome to the banking system")
cname=input("Enter your full name:")
sal=int(input("Enter your salary:"))
print(f"cust-name is  {cname} and his salary is {sal}")

if(sal>=50000):
    cbil=int(input("Can you share the cbil score"))
    ltaken=input("Have you taken any loan another bank(yes/no)")
    
    if(cbil>700 and ltaken=="no"):
        print("hello sir,you are eligible for loan")
    else:
        emi=int(input("what is your monthly EMI now:"))

        x=emi/sal*100
        print(x)
        if(x>=60):
            print("sorry sir, you are not eligible for loan")
        else:
                 print("hello sir,you are eligible for loan")
