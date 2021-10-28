
package kata4.main;

import java.io.IOException;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

    public static void main(String[] args) throws IOException {
        Histogram<String> histo = MailHistogramBuilder.build(MailListReader.read("email.txt"));
        new HistogramDisplay(histo).execute();
        
    }
    
}
