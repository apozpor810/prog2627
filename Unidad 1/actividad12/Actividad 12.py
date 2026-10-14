e = int(input("Ingrese su edad "))
es = input("¿Es estudiante? (si/no) ")
m = float(input("¿Cuánto dinero ha gastado? "))


print("Edad:", e)
print("¿Es estudiante? (si/no):", es)
print("Monto de compra:", m)
print("¿Aplica descuento?", es == "si" and m > 50 or e > 65)
