import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class drawRisingGraph extends JFrame {
    private DrawPanel drawPanel;

    public drawRisingGraph() {
        setTitle("Rising Bars");
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel titleLabel = new JLabel("Rising Bars", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Consolas", Font.BOLD, 20));
        titleLabel.setBounds(100, 20, 300, 50);
        add(titleLabel);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(null);
        controlPanel.setBounds(50, 300, 400, 150);
        controlPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        add(controlPanel);

        JRadioButton redColorRad = new JRadioButton("Red");
        JRadioButton blueColorRad = new JRadioButton("Blue");
        JRadioButton greenColorRad = new JRadioButton("Green");
        ButtonGroup radGroup = new ButtonGroup();
        radGroup.add(redColorRad);
        radGroup.add(blueColorRad);
        radGroup.add(greenColorRad);

        redColorRad.setBounds(20, 20, 100, 30);
        blueColorRad.setBounds(150, 20, 100, 30);
        greenColorRad.setBounds(280, 20, 100, 30);
        controlPanel.add(redColorRad);
        controlPanel.add(blueColorRad);
        controlPanel.add(greenColorRad);

        JButton drawButton = new JButton("Draw");
        drawButton.setBounds(150, 100, 100, 30);
        controlPanel.add(drawButton);

        drawPanel = new DrawPanel();
        drawPanel.setBounds(50, 80, 400, 200);
        add(drawPanel);

        drawButton.addActionListener(e -> {
            if (redColorRad.isSelected()) {
                drawPanel.setColor(Color.RED);
            } else if (blueColorRad.isSelected()) {
                drawPanel.setColor(Color.BLUE);
            } else if (greenColorRad.isSelected()) {
                drawPanel.setColor(Color.GREEN);
            }
            drawPanel.repaint();
        });

        setVisible(true);
    }

    class DrawPanel extends JPanel {
        private Color color = Color.BLUE; // default color

        public void setColor(Color color) {
            this.color = color;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawBars(g);
        }

        private void drawBars(Graphics g) {
            g.setColor(this.color);
            int x = 10; // Starting x position
            for (int i = 1; i <= 19; i++) {
                int height = 10 * i;
                g.fillRect(x, getHeight() - height - 30, 10, height);
                x += 20; // Increment x position by width of bar + gap
            }
        }
    }
}