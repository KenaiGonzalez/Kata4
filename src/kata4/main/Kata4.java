
package kata4.main;


import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {
    private final String fileName = "email.txt";
    private List<Mail> mailList;
    private Histogram<String> histogram;
    private HistogramDisplay histoDisplay;
    public static void main(String[] args) throws IOException {
        new Kata4().execute();
        
        
    }
    public void execute(){
        try {
            input();
            process();
            output();
        } catch (IOException ex) {
            Logger.getLogger(Kata4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void input() throws IOException{
        mailList = MailListReader.read(fileName);
    }
    
    public void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    public void output(){
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
