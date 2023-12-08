Algoritmo BonificacionPorVenta
	Definir venta Como Real
	Escribir '04. Calcular Bonificacion'
	Escribir ''
	Escribir 'Ingrese monto de venta: $. 'Sin Saltar
	Leer venta
	Si (venta>25000000) Entonces
		Escribir 'Bonificacion 10% : $. ', (venta*0.10)
	SiNo
		Escribir "No habrá bonificación 10%"
	FinSi
FinAlgoritmo
