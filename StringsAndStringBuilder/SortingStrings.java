package StringsAndStringBuilder;
import java.util.Arrays;
public class SortingStrings {
    public static void main(String[] args) {
        String s="Smile";
        char[] ab={'g','o','o','d'};
        char[] ch =s.toCharArray();
        for(char element : ab){
            System.out.print(element + " ");
        }
            for(char ele : ch){
                System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        Arrays.sort(ab);
        for(char element : ab){
            System.out.print(element + " ");+
        }
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
    }    
}
