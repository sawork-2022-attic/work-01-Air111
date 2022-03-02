package air.annotation;

import asciiPanel.AsciiPanel;
import javax.swing.JFrame;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config-annotation.xml");

        AsciiPanel asciiPanel = context.getBean(AsciiPanel.class);      
        asciiPanel.write("Hello, world!");
        JFrame frame = new JFrame();
        frame.add(asciiPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(2);
        context.close();
    }

}
