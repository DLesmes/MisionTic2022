def system(user,password):
    #start users and password defined and other variables
    super_user = 'admin'
    super_password = 'MisionTic2021'
    Attempts = 0
    exit = True
    menu = """
------Menú de registro de personal-----
1. Registrar ingreso de empleado.
2. Ver empleados ingresados.
3. Registrar ingreso de visitantes.
4. Ver visitantes ingresados.

0. Salir
    """
    empleados = ''
    visitantes = ''
    #Start 4 tries loop to access
    while (Attempts < 3):
        #verifing credentials
        if ((super_user==user) and (super_password==password)):
            #starts menu loop
            while (exit):
                #print menu
                print(menu)
                #ask for the option
                option = int(input('Ingresa un número válido de opción del menú: '))
                #verifying if is option 1
                if option == 1:
                    #Start loop until SALIR Option
                    while (True):
                        empleado = input('Ingresa el nombre del empleado (Si no deseas agregar más, oprime la tecla SALIR): ')
                        if empleado!='SALIR':
                            empleados = empleados + empleado + ','
                        else:
                            break
                #verifying if is option 2
                elif option == 2:
                    print('Los empleados registrados son: '+empleados)
                #verifying if is option 3
                elif option == 3:
                    #Star loop until SALIR option
                    while (True):
                        visitante = input('Ingresa el nombre del visitante (Si no deseas agregar más, digite SALIR): ')
                        if visitante!='SALIR':
                            visitantes = visitantes + visitante + ','
                        else:
                            break
                #verifying if is option 4
                elif option == 4:
                    print('Los visitantes registrados son: '+ visitantes)
                #verifying if is the last option
                elif option == 0:
                    print('¡Hasta luego!')
                    exit = False
                    Attempts = 5
                else:
                    print('Por favor ingresa una opción válida')
        #increase the control variable
        else:
            #ask for the user and password
            print('Credenciales incorrectas')
            user = input('Usuario: ')
            password = input('Contraseña: ')
            Attempts = Attempts +1
        if (Attempts == 3):
            print('Credenciales incorrectas')
            print('Has agotado la cantidad de intentos, por favor inicie de nuevo el programa')

if __name__ == '__main__':
    user = input('Usuario: ')
    password = input('Contraseña: ')
    system(user,password)