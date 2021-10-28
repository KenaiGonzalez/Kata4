package kata4.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Mail;

public class MailListReader {
    public static List<Mail> read(String fileName) throws FileNotFoundException, IOException{
        List<Mail> list = new ArrayList<>();
        File mails = new File (fileName);
        FileReader fr = new FileReader (mails);
        BufferedReader br = new BufferedReader(fr);
        while(true){
            String read = br.readLine();
            if(read==null)break;
            list.add(new Mail(read));
        }
        return list;
    }
            

}
