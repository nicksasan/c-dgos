Algoritmo XD
	DEFINIR OPCI0N COMO ENTERO
	ESCRIBIR "Digite una opcion"
	LEER OPCI0N
	SEGUN OPCI0N Hacer
		1: 
			DEFINIR A, B, C Como Entero
			ESCRIBIR "Dame dos variables"
			LEER A, B
			C <- A+B
			ESCRIBIR "El resultado de las dos variables es: ", c
		2:
			Definir peso, estatura, imc_ Como Real
			Escribir 'Ingrese su Peso (Kg): '
			Leer peso
			Escribir 'Ingrese su estatura (En Mts): '
			Leer estatura
			imc_ <- peso/(estatura*estatura)
			Escribir 'Su IMC es de: ', imc_
			Si (imc_<18.5) Entonces
				Escribir 'El peso es inferior al normal'
			SiNo
				Si (imc_>=18.5 Y imc_<=24.9) Entonces
					Escribir 'Normal'
				SiNo
					Si (imc_>=25.0 Y imc_<=29.9) Entonces
						Escribir 'Preobesidad'
					SiNo
						Si (imc_>=30.0 Y imc_<=34.9) Entonces
							Escribir 'Obesidad clase I'
						SiNo
							Si (imc_>=35.0 Y imc_<=39.9) Entonces
								Escribir 'Obesidad clase II'
							SiNo
								Si (imc_>=40.0 Y imc_<=40.0) Entonces
									Escribir 'Obesidad clase III'
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		3:
			ESCRIBIR "Digite longitud"
			LEER A
			radio <- A/2*3.14
			ESCRIBIR "El resultado de radio es: ", radio 
		4: 
	FinSegun
FinAlgoritmo
