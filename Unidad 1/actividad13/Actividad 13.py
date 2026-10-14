#Nombre
c = input("¿Como te llamas? ")
#Nombre del producto
p = input("¿Qué has comprado? ")
#Precio del producto
pc = float(input("¿Cual es el precio? (sin €) "))
#El número de veces que ha comprado ese producto
k = int(input("¿Cuántos has comprado? "))
#Si quiere dejar propina o no
g = input("¿Quieres dejar una propina de 2€? si/no ")
#Subtotal
s = pc * k
#IVA
i = s * 0.21
#Para que sume los 2€ si puso si
d = (g == "si")*2
#Total
t = s + i + d

print("====================================")
print("        TIQUET DE CAFETERÍA         ")
print("====================================")
print("Cliente:", c)
print("Producto:", p, "x", k)
print("------------------------------------")
print("Subtotal:", round(s, 2), "€")
print("IVA (21%):", round(i, 2), "€")
print("Propina:", d, "€")
print("TOTAL A PAGAR:" , round(t, 2), "€")
print("------------------------------------")
print("¿Supera el umbral VIP (>30€)?:", t > 30)
print("====================================")
