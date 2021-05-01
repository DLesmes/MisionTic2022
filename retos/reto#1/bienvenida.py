def misiontic(nombre,u):
    try:
        int(nombre)
        print('Debes ingresar tu nombre y el de tu universidad como texto!')
    except ValueError:
        print('\n Hola Misión TIC 2022 yo soy {0} \n    Desarrollare el programa en la {1}\n    Hare mi mejor esfuerzo para aprender \n   y sacar todos los proyectos adelante \n            ¡Gracias MINTIC!\n'.format(nombre,u))

if __name__== "__main__":
    nombre = input('Indicame tu nombre pls:')
    u = input('Indicame la universidad donde estudiaras pls:')
    misiontic(nombre,u)
