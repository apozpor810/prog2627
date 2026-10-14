n = input("Ingrese su nombre ")
e = int(input("Ingrese su año de nacimiento "))
a = float(input("Ingresa tu altura en metros "))
import datetime
anio = datetime.date.today().year
edad = anio - e

print("\n--- FICHA REGISTRADA ---")
print("Nombre:", n, "(Tipo:)", str(type(n))+")")
print("Edad:", edad, "(Tipo:)", str(type(edad))+")")
print("Altura:", a, "(Tipo:)", str(type(a))+")")

