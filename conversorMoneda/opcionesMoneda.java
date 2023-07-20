package conversorMoneda;

import javax.swing.JOptionPane;


public class opcionesMoneda  {
	
	
		
		monedaLogica monedalog = new monedaLogica();
		
		public void convertirMoneda (double valor) {
		
		String moneda = JOptionPane.showInputDialog(null,"Elegir conversion", "Convertir moneda",JOptionPane.PLAIN_MESSAGE, null,
				new Object[]{ "de pesos a dolar", " de pesos a yuan", " de dolar a pesos",  "de yuan a pesos", "otra moneda"}, "de pesos a dolar").toString();
		switch (moneda) {
		case "de pesos a dolar": {
			monedalog.ConvertirDolaresPesosArgentino(valor);
			break;
			}
		case " de pesos a yuan": {
			monedalog.ConvertirPesosArgentinoyuan(valor);
			break;
		}
		case " de dolar a pesos": {
			monedalog.ConvertirDolaresPesosArgentino(valor);
			break;
		}
		case "de yuan a pesos": {
			monedalog.ConvertiryuanPesosArgentino(valor);
			break;
		}
		case "otra moneda": {
			try {
				String otraMoneda = JOptionPane.showInputDialog(null, "ingrese valor de otra moneda","otra moneda",  1);
				double OtraMoneda = Double.parseDouble(otraMoneda);
				monedalog.ConvertirPesoArgentinoOtramoneda(valor, OtraMoneda);
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "No es un valor numerico");
			} {
				
			}
			
			break;
		}
		
		}
	}

}
