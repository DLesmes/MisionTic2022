def IMC(estatura, peso):
    """
    El IMC permite establecer una clasificación al relacionar el peso en metros con el peso en kilogramos;
    la relación esta determinada por el peso (kg) / estatura (mts) elevada a la 2, que determina un índice
    y a su vez el nivel de peso (bajo peso, normal, sobrepeso y obeso). 

    IMC;Nivel de peso
    Por debajo de 18.5;Bajo peso
    18.5 – 24.9;Normal
    25.0 – 29.9;Sobrepeso
    30.0 o más;Obeso
    """
    imc=peso/estatura**2
    if (imc <18.5):
        print('Bajo peso')
    elif (imc>=18.5 and imc<25):
        print('Normal')
    elif (imc>=25 and imc<30):
        print('Sobrepeso')
    else:
        print('Obeso')

if __name__ == '__main__':
    peso = int(input())
    estatura = float(input())
    IMC(estatura,peso)