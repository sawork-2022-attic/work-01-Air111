package air.javaconfig;

import asciiPanel.AsciiPanel;
import javax.swing.JFrame;
import air.javaconfig.config.AsciiPanelConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsciiPanelConfig.class);

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
