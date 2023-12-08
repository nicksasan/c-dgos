Algoritmo datos
	Definir opci0n como real 
	Escribir "Digite opcion" 
	Leer opci0n
	Segun opci0n hacer 
		1: 
			Escribir "Ingrese el primer valor en metros"
			Leer A
			B <- A/1000
			Escribir B
			Escribir "El resultado en KILOMETROS es de : ", B
		2:
			Escribir "Ingrese el primer valor en metros"
			Leer A
			B <- A/10 
			Escribir B
			Escribir "El resultado en DECAMETROS es de : ", B
			
		3:
			Escribir "Ingrese el primer valor en metros"
			Leer A
			B <- A*10 
			Escribir B
			Escribir "El resultado en DECIMETROS es de : ", B
	    4:
			Escribir "Ingrese el primer valor en metros"
			Leer A
			B <- A*100 
			Escribir B
			Escribir "El resultado en CENTIMETROS es de : ", B
	FinSegun
FinAlgoritmo
