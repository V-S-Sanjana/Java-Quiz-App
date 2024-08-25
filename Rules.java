package la2jv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    /**
     * @param name
     */
    /**
     * @param name
     */
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Quizzup!!");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1.  Each question will have a fixed time limit of 15 seconds. Once the question appears, the countdown timer starts automatically." + "<br><br>" +
                "2. Participants are required to attempt all 10 questions in the quiz. There is no skipping or leaving any question unanswered." + "<br><br>" +
                "3. The quiz will consist of a total of 10 questions, 10 marks awarded for each correct answer." + "<br><br>" +
                "4. Participants can use the 50-50 lifeline option once during the quiz. When used, the app will eliminate two incorrect answer options, leaving the participant with one correct option and one incorrect option." + "<br><br>" +
                "5.  The final score will be displayed at the end of the quiz. It will show the number of questions answered correctly out of the total 10 questions." + "<br><br>" +
                "6. Strictly enforce a no-cheating policy." 
            +"<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}

