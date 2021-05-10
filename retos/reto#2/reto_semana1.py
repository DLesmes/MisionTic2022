def budget(salary):
    rent = salary*0.3
    services = salary*0.15
    couple = salary*0.1
    piggy = salary*0.05
    market = salary - (rent+services+couple+piggy)
    print('{0}'.format(market))

if __name__ == "__main__":
    salary = int(input())
    budget(salary)