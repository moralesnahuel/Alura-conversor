package conversorMoneda;

import javax.swing.JOptionPane;

public class monedaLogica {
	public void ConvertirPesosArgentinoDolares(double valor) {
		double monedaDolar = valor / 492.00;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
}
	public void ConvertirPesosArgentinoyuan(double valor) {
		double monedayuan = valor / 36.28;
		monedayuan = (double) Math.round(monedayuan * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedayuan + " yuan ");
	}
	public void ConvertirDolaresPesosArgentino(double valor) {
		double monedaDolar = 492.00 * valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes Dolares " + monedaDolar + " en pesos");
	}
	public void ConvertiryuanPesosArgentino(double valor) {
		double monedayuan = valor * 36.28;
		monedayuan = (double)Math.round(monedayuan * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tienes yuan  " + monedayuan + " en pesos");
	}
	public void ConvertirPesoArgentinoOtramoneda (double valor, double otraMoneda ) {
		double otramoneda = valor * otraMoneda;
		otraMoneda = (double)Math.round(otramoneda * 100) /100;
		JOptionPane.showMessageDialog(null, "Tienes en otra moneda " + otramoneda + " en pesos");
	}

}
