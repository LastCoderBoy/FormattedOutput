package OutputFormatting;

import java.util.LinkedList;
import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> allString = new LinkedList<>();
        LinkedList<Integer> allNumbers = new LinkedList<>();
        LinkedList<String> allSpaces = new LinkedList<>();
        System.out.println("================================");
        StringBuilder spaces = new StringBuilder();
        int numberOfSpacesSecond = 0, numberOfSpacesThird=0, numberofSpacesDefault = 15;

        for(int i=0;i<3;i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            allString.add(s1);
            allNumbers.add(x);
        }

        int firstInputLength = allString.get(0).length();
        int secondInputLength = allString.get(1).length();
        int thirdInputLength = allString.get(2).length();
        for(int j=0; j<allString.size(); j++) {

            // THIS IS USED TO COUNT THE NUMBER OF SPACES IN THE SECOND LINE
            if(firstInputLength > secondInputLength){
                numberOfSpacesSecond = 15+(firstInputLength - secondInputLength);
            }
            else{
                numberOfSpacesSecond = 15-(secondInputLength - firstInputLength);
            }

            // Adding Default 15 spaces to a List
            for (int m = 0; m < numberofSpacesDefault; m++) {
                spaces.append(" ");
            }
            String result = spaces.toString();
            allSpaces.add(result);
            spaces = new StringBuilder();
            // ***************************

            //Adding Second Line spaces to a List
            for (int m = 0; m < numberOfSpacesSecond; m++) {
                spaces.append(" ");
            }
            result = spaces.toString();
            allSpaces.add(result);
            spaces = new StringBuilder();
            // ***************************

            // THIS IS USED TO COUNT THE NUMBER OF SPACES IN THE THIRD LINE
            if(firstInputLength > thirdInputLength){
                numberOfSpacesThird = 15+(firstInputLength - thirdInputLength);
            }
            else{
                numberOfSpacesThird = 15-(thirdInputLength - firstInputLength);
            }
            for (int k = 0; k < numberOfSpacesThird; k++) {
                spaces.append(" ");
            }
            result = spaces.toString();
            allSpaces.add(result);
            // ***************************

        }
        for(int num=0; num<allNumbers.size(); num++) {
            if (allNumbers.get(num) > 0 && allNumbers.get(num) < 100) {
                System.out.println(allString.get(num) + allSpaces.get(num) + "0" + allNumbers.get(num));
            } else {
                System.out.println(allString.get(num) + allSpaces.get(num) + allNumbers.get(num));
            }
        }
        System.out.println("================================");
    }
}
