package StringsAndStringBuilder.StringsAssignment;
import java.util.ArrayList;
public class  LexicographicallyMaximumWord {
    public static void main(String[] args) {
        String str = "I aspire to be a software developer";
        ArrayList<String> wordStrings = new ArrayList<>();
        int n = str.length();
        int i = 0;
        int j = 0;
        while(j < n){
            if(str.charAt(j) == ' '){
                wordStrings.add(str.substring(i, j));
                i = j+1;
            }
               j++;
        }
        wordStrings.add(str.substring(i, j));
               System.out.print(wordStrings);
                System.out.println();
        
        String maxString = "";
        for(i=0; i<wordStrings.size(); ++i){
            if(wordStrings.get(i).compareTo(maxString) > 0){
                maxString = wordStrings.get(i);
            }
        }
        System.out.println("maxString  "+maxString);
    }
}

