def area(a,b,c):
    #semiperimetro
    s = (a+b+c)/2
    print('El resultado es ' + str(round((s*(s-a)*(s-b)*(s-c))**(1/2),2)))

if __name__== "__main__":
    a = int(input('Give me the lenght of line one :'))
    b = int(input('Give me the lenght of line two :'))
    c = int(input('Give me the lenght of line three :'))
    area(a,b,c)