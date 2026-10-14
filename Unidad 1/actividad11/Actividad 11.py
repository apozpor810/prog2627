a = int(input("¿Cuántos alumnos hay?"))
c = int(input("¿Cuántos caramelos hay?"))
r = c // a
s = c % a

print("Hay", c, "caramelos")
print("Hay", a, "alumnos")
print("Son", r, "caramelos para cada alumno")
print("En la bolsa sobran", s, "caramelos" )
