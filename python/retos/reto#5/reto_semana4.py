def clasificar_huevos(gramaje):
    """
    """
    #Defnir el tipo de huevo
    inventory = []
    Jumbo = {}
    Jumbo['tipo_huevo']='Jumbo'
    Jumbo['numero_huevos']=0
    Jumbo['numero_bandejas']=0
    AAA = {}
    AAA['tipo_huevo']='AAA'
    AAA['numero_huevos']=0
    AAA['numero_bandejas']=0
    AA = {}
    AA['tipo_huevo']='AA'
    AA['numero_huevos']=0
    AA['numero_bandejas']=0
    A = {}
    A['tipo_huevo']='A'
    A['numero_huevos']=0
    A['numero_bandejas']=0
    B = {}
    B['tipo_huevo']='B'
    B['numero_huevos']=0
    B['numero_bandejas']=0
    C = {}
    C['tipo_huevo']='C'
    C['numero_huevos']=0
    C['numero_bandejas']=0
    #Agruparlo
    for huevo in list(gramaje):
        if huevo < 46:
            C['numero_huevos'] = C['numero_huevos']+1
        elif 46 <= float(huevo) < 53:
            B['numero_huevos'] = B['numero_huevos']+1
        elif 53 <= float(huevo) < 60:
            A['numero_huevos'] = A['numero_huevos']+1
        elif 60 <= float(huevo) < 67:
            AA['numero_huevos'] = AA['numero_huevos']+1
        elif 67 <= float(huevo) < 78:
            AAA['numero_huevos'] = AAA['numero_huevos']+1
        else:
            Jumbo['numero_huevos'] = Jumbo['numero_huevos']+1
    #List directories
    inventory.append(Jumbo)
    inventory.append(AAA) 
    inventory.append(AA)
    inventory.append(A)
    inventory.append(B)
    inventory.append(C)
    #Empacarlo
    for i in inventory:
        if (i['tipo_huevo'] == 'C') or (i['tipo_huevo'] == 'B'):
            if i['numero_huevos']%60>0:
                j = 1
            else:
                j = 0
            i['numero_bandejas'] = (i['numero_huevos']//60) + j
        elif i['tipo_huevo'] == 'A':
            if i['numero_huevos']%30>0:
                j = 1
            else:
                j = 0
            i['numero_bandejas'] = (i['numero_huevos']//30) + j
        elif i['tipo_huevo'] == 'AA':
            if i['numero_huevos']%24>0:
                j = 1
            else:
                j = 0
            i['numero_bandejas'] = (i['numero_huevos']//24) + j
        else:
            if i['numero_huevos']%12>0:
                j = 1
            else:
                j = 0
            i['numero_bandejas'] = (i['numero_huevos']//12) + j
    #print(inventory)
    return inventory
if __name__ == '__main__':
    gramaje =list(map(float, input('dame el listados del gramaje de los huevos :')[1:-1].split(',')))
    clasificar_huevos(gramaje)
