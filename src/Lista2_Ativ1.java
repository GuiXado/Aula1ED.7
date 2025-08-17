import javax.swing.JOptionPane;

public class Lista2_Ativ1 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número para a Multiplicação "));
		int m = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número para a Multiplicação "));
		
		int a = rec(n, m);
		JOptionPane.showMessageDialog(null, "A Multiplicação de " + n + " * "+ m + " é: " + a);

	}

	public static int rec(int n, int m) {
		if (m == 0) {
			return 0;
		} else {
			return n + rec(n, m - 1);
		}
	}
}
