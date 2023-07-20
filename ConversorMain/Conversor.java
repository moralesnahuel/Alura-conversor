package ConversorMain;

import javax.swing.JOptionPane;

import ConversorTemperatura.OpcionesConversionTemperatura;
import conversorMoneda.opcionesMoneda;
/**
 * La clase Conversor llama a travez de una ventana de JOptionPane las direnetes 
 * opciones de conversion
 * @author Nahuel Morales
 *
 */
public class Conversor {
	public static void main(String[] args) {

		opcionesMoneda Moneda = new opcionesMoneda();
		OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();
		
		while(true) {
			String resultado = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú",
					JOptionPane.PLAIN_MESSAGE, null, new Object[] { "convertir moneda", "convertir temperatura" }, "convertir moneda")
					.toString();
			switch (resultado) {
			case "convertir moneda":
				try {
					String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
					double valorRecibido = Double.parseDouble(input);
					Moneda.convertirMoneda(valorRecibido);
				}catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "No es un valor numerico");
				}
				

				JOptionPane.showMessageDialog(null, "Programa finalizado");
				break;
			case "convertir temperatura":
				try {
					String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
					double valorRecibidoT = Double.parseDouble(input1);
					conversionT.ConvertirTemperaturas(valorRecibidoT);
				}catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "No es un valor numerico");
				}
				break;
			}
		}
		
	}
}