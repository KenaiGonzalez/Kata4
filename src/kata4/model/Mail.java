package kata4.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {
    private String mail;

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain(){
        String[] dom = mail.split("@");
        if(dom.length ==2) return dom[1];
        return null;
    }
}
