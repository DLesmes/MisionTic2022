def budget(salary):
    rent = salary*0.3
    services = salary*0.15
    couple = salary*0.1
    piggy = salary*0.05
    market = salary - (rent+services+couple+piggy)
    print( 'Dinero dedicado para mercar ${0}'.format(market))

if __name__ == "__main__":
    salary = int(input('cual es tu salario mensual?: '))
    budget(salary)