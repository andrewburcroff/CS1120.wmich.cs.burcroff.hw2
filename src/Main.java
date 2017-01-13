import javax.swing.JOptionPane;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double number;
		double totalArea;
		String input;
		
		Rectangle kitchen = new Rectangle();
		Rectangle bedroom = new Rectangle();
		Rectangle den = new Rectangle();
		
		input = JOptionPane.showInputDialog("What is the Kitchen's Length?");
		number = Double.parseDouble(input);
		kitchen.setLength(number);
		
		input = JOptionPane.showInputDialog("What is the Kitchen's Width?");
		number = Double.parseDouble(input);
		kitchen.setWidth(number);
		
		input = JOptionPane.showInputDialog("What is the Bedroom's Length?");
		number = Double.parseDouble(input);
		bedroom.setLength(number);
		
		input = JOptionPane.showInputDialog("What is the Bedroom's Width?");
		number = Double.parseDouble(input);
		bedroom.setWidth(number);
		
		input = JOptionPane.showInputDialog("What is the Den's Length?");
		number = Double.parseDouble(input);
		den.setLength(number);
		
		input = JOptionPane.showInputDialog("What is the Den's Width?");
		number = Double.parseDouble(input);
		den.setWidth(number);
				
		totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();
		JOptionPane.showMessageDialog(null,"The total area of the Kitchen is " + kitchen.getArea());
		JOptionPane.showMessageDialog(null,"The total area of the bedroom is " + bedroom.getArea());
		JOptionPane.showMessageDialog(null,"The total area of the den is " + den.getArea());
		
		JOptionPane.showMessageDialog(null,"The total area of the rooms is " + totalArea);
	}

}
