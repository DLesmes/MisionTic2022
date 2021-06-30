def calculadoraMes(registroDeAhorros, nombre):
   totalbymonth = {}
   periods = registroDeAhorros.split(';')
   for period in periods:
       registros = period.split(',')
       for record in registros:
            if record.isnumeric() == False:
                month = record
                totalbymonth[month] = 0
            else:
                totalbymonth[month] += int(record)
    
   print((nombre,totalbymonth))
   #return (nombre,totalbymonth)

if __name__ == '__main__':
   registroDeAhorros = input('pls give me the list of saves:')
   nombre = input('pls give me your name:')
   calculadoraMes(registroDeAhorros,nombre)