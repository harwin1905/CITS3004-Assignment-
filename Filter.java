/*
 * Created by JinH on Aug 14, 2018
 * Filter - filter metachacters from SQL query parameters
 */
 


/**
 * @author JinH
 */
public class Filter {

    public Filter () {
        // none right now
    }
    
    public String filterMetaChars (String s) {
        String filtered_string = s.replaceAll("([^A-Za-z0-9@._-]+", "");
        return filtered_string;
        //return s;
    }
}
