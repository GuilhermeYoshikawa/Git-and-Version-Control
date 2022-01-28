public class Add {
	public static void main(String args []) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Number x: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Number y: "));
		int sum = x + y;
		
		System.out.println("Sum: " + sum);
	}

