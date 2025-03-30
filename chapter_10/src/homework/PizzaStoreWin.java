package homework;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.print.attribute.standard.DialogOwner;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PizzaStoreWin {

	public PizzaStoreWin() {

		JFrame pizzaStore_Frame = new JFrame();
		pizzaStore_Frame.setSize(460, 650);
		pizzaStore_Frame.setTitle("Downtown Pizza");
		pizzaStore_Frame.setResizable(false);
		pizzaStore_Frame.setVisible(true);

		// Pizza Panel
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		pizzaStore_Frame.add(mainPanel);

		JLabel pizzaSize_Label = addLabel("Select pizza size:", 15, 10, 300, 50);
		mainPanel.add(pizzaSize_Label);

		// Pizza Size Options
		JRadioButton mediumPizza_rad = new JRadioButton("Medium");
		JRadioButton largePizza_rad = new JRadioButton("Large");
		ButtonGroup radGroup = new ButtonGroup();
		radGroup.add(mediumPizza_rad);
		radGroup.add(largePizza_rad);

		mediumPizza_rad.setBounds(70, 45, 75, 20);
		largePizza_rad.setBounds(175, 45, 75, 20);
		mainPanel.add(mediumPizza_rad);
		mainPanel.add(largePizza_rad);

		// Pizza Topping label
		JLabel topping_Label = addLabel("Select toppings:", 15, 65, 300, 50);

		// Pizza Topping Options
		JCheckBox topping_Anchovies_box = new JCheckBox("Anchovies");
		JCheckBox topping_X_cheese_box = new JCheckBox("X-cheese");
		JCheckBox topping_Onions_box = new JCheckBox("Onions");
		JCheckBox topping_Pepperoni_box = new JCheckBox("Pepperoni");

		topping_Anchovies_box.setBounds(70, 105, 90, 20);
		topping_X_cheese_box.setBounds(250, 105, 90, 20);
		topping_Onions_box.setBounds(70, 295, 90, 20);
		topping_Pepperoni_box.setBounds(250, 295, 90, 20);
		mainPanel.add(topping_Label);
		mainPanel.add(topping_Anchovies_box);
		mainPanel.add(topping_X_cheese_box);
		mainPanel.add(topping_Onions_box);
		mainPanel.add(topping_Pepperoni_box);

		// Adding topping images
		JLabel AnchoviesImage = addPicture(
				"/home/finger/Classes/Spring 2024/Comp Prog & Problem Solving (CSE-135-100_2024SP)/Eclipse-workspace/chapter_10/src/homework/Anchovies.jpg",
				70, 130, 150, 150);

		JLabel X_cheeseImage = addPicture(
				"/home/finger/Classes/Spring 2024/Comp Prog & Problem Solving (CSE-135-100_2024SP)/Eclipse-workspace/chapter_10/src/homework/X-cheese.jpg",
				250, 130, 150, 150);

		JLabel OnionsImage = addPicture(
				"/home/finger/Classes/Spring 2024/Comp Prog & Problem Solving (CSE-135-100_2024SP)/Eclipse-workspace/chapter_10/src/homework/Onions.jpg",
				70, 320, 150, 150);

		JLabel PepperoniImage = addPicture(
				"/home/finger/Classes/Spring 2024/Comp Prog & Problem Solving (CSE-135-100_2024SP)/Eclipse-workspace/chapter_10/src/homework/Pepperoni.jpg",
				250, 320, 150, 150);

		mainPanel.add(AnchoviesImage);
		mainPanel.add(X_cheeseImage);
		mainPanel.add(OnionsImage);
		mainPanel.add(PepperoniImage);

		// Total Price label
		JLabel pizzaTotalPrice_Label = addLabel("The total price is ", 15, 480, 300, 50);
		mainPanel.add(pizzaTotalPrice_Label);

		// Computed Total Price
		JLabel computedPrice_Label = addLabel("$0.0", 185, 480, 500, 50);
		mainPanel.add(computedPrice_Label);

		// Purchase Button
		JButton purchase_Button = new JButton("Purchase");
		purchase_Button.setBounds(150, 530, 100, 30);
		mainPanel.add(purchase_Button);

		class ClickListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				Double mediumPizza = 12.50;
				Double largePizza = 15.50;

				Double Anchovies = 2.50;
				Double X_cheese = 3.00;
				Double Onions = 2.50;
				Double pepperoni = 3.50;

				Double totalPrice = 0.0;

				// Compute Medium and Large Pizza
				if (mediumPizza_rad.isSelected()) {
					totalPrice = totalPrice + mediumPizza;
				}
				if (largePizza_rad.isSelected()) {
					totalPrice = totalPrice + largePizza;
				}
				// Compute Toppings
				if (topping_Anchovies_box.isSelected()) {
					totalPrice = totalPrice + Anchovies;
				}
				if (topping_X_cheese_box.isSelected()) {
					totalPrice = totalPrice + X_cheese;
				}
				if (topping_Onions_box.isSelected()) {
					totalPrice = totalPrice + Onions;
				}
				if (topping_Pepperoni_box.isSelected()) {
					totalPrice = totalPrice + pepperoni;
				}

				String price = String.format("$%,.2f", totalPrice);
				computedPrice_Label.setText(price);

				if (e.getSource() == purchase_Button) {

					// If Pizza size not picked
					if ((mediumPizza_rad.isSelected()) == false && (largePizza_rad.isSelected()) == false) {
						JOptionPane.showMessageDialog(null, "Please Select One Of The Pizza Size");
					} else {
						JOptionPane.showMessageDialog(null, "Please Pay: $" + totalPrice);
					}
				}
			}
		}

		ClickListener optionListener = new ClickListener();
		ClickListener buttonListener = new ClickListener();

		mediumPizza_rad.addActionListener(optionListener);
		largePizza_rad.addActionListener(optionListener);
		topping_Anchovies_box.addActionListener(optionListener);
		topping_X_cheese_box.addActionListener(optionListener);
		topping_Onions_box.addActionListener(optionListener);
		topping_Pepperoni_box.addActionListener(optionListener);

		purchase_Button.addActionListener(buttonListener);

		pizzaStore_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} // End of Constructor

	public JLabel addLabel(String desc, int x, int y, int width, int height) {
		JLabel tempLabel = new JLabel(desc);
		tempLabel.setFont(new Font("Consolas", Font.ITALIC | Font.BOLD, 16));
		tempLabel.setBounds(x, y, width, height);

		return tempLabel;
	} // end of addLabel

	public JLabel addPicture(String image, int x, int y, int width, int height) {

		BufferedImage tempImage;
		JLabel tempLabel = new JLabel();

		try {
			tempImage = ImageIO.read(new File(image));
			tempLabel.setIcon(new ImageIcon(tempImage));
			tempLabel.setBounds(x, y, width, height);
		} catch (Exception e) {
			System.out.printf("The image %s couldn't be opened!", image);
		}
		return tempLabel;
	} // addPicture
} // End of Class
