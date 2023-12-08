Algoritmo NOTASPARCIALES
	Definir cali1, cali2, cali3, promedio Como Real
	Escribir 'Dame tres calificaciones'
	Leer cali1, cali2, cali3
	promedio <- (cali1+cali2+cali3)/3
	Escribir 'El promedio de las tres calificaciones es: ', promedio
	Si (promedio>=0 Y promedio<=3) Entonces
		Escribir 'Perdió'
	SiNo
		Si (promedio>=4 Y promedio<=6) Entonces
			Escribir 'Aceptable'
		SiNo
			Si (promedio>=7 Y promedio<=10) Entonces
				Escribir 'Excelente'
			FinSi
		FinSi
	FinSi
FinAlgoritmo
