import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


    public class MainMenu extends JFrame{
        MainMenu(){
            //Main Menu Image
            this.setLayout(new FlowLayout());
            JLabel imageLabel = new JLabel();                 
            ImageIcon icon = new ImageIcon("snakee.png"); 
            imageLabel.setIcon(icon); 
            this.add(imageLabel);

            // Start Button
            JButton startButton = new JButton();
            startButton.setText("START GAME");
            startButton.setFont(new Font("DialogInput", Font.BOLD, 25));
            this.add(startButton);

            EventHandler handler = new EventHandler();
            startButton.addActionListener(handler);

            
            this.setTitle("Snake Game");
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);           
            this.setSize(330,330);           
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            this.setResizable(false);
            this.getContentPane().setBackground(Color.BLACK);
}
        

    private class EventHandler implements ActionListener{
            public void actionPerformed(ActionEvent event){
                new ColorMenu();

                dispose();
        }
    }
}
    
