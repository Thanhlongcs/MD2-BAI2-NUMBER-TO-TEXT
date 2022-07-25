import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number: ");
        int number = scanner.nextInt();
        int units = number % 10;
        int dozens = number % 100 / 10;
        int hundreds = number / 100;
        String strUnits = "";
        String strDozens = "";
        String strHundreds = "";
        String strNumbers ="";
        switch (units) {
            case 0:
                // System.out.println("zero");
                strUnits = "zero";
                break;
            case 1:
                //System.out.println("one");
                strUnits = "one";
                break;
            case 2:
                //System.out.println("two");
                strUnits = "two";
                break;
            case 3:
                //System.out.println("three");
                strUnits = "three";
                break;
            case 4:
                // System.out.println("four");
                strUnits = "four";
                break;
            case 5:
                //System.out.println("five");
                strUnits = "five";
                break;
            case 6:
                //System.out.println("six");
                strUnits = "six";
                break;
            case 7:
                //System.out.println("seven");
                strUnits = "seven";
                break;
            case 8:
                // System.out.println("eight");
                strUnits = "eight";
                break;
            case 9:
                // System.out.println("nine");
                strUnits = "nine";
                break;
        }


        switch (number) {
            case 10:
                //System.out.println("ten");
                strNumbers="ten";
                break;
            case 11:
                //System.out.println("eleven");
                strNumbers="eleven";
                break;
            case 12:
                //System.out.println("twelve");
                strNumbers="twelve";
                break;
            case 13:
                //System.out.println("thirteen");
                strNumbers="thirteen";
                break;
            case 15:
                //System.out.println("fifteen");
                strNumbers="fifteen";
                break;
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
                //System.out.println("teen");
                strNumbers="teen";
                break;
        }


        switch (dozens) {
            case 2:
                //System.out.println("twenty");
                strDozens = "twenty";
                break;
            case 3:
                //System.out.println("thirty");
                strDozens = "thirty";
                break;
            case 4:
                //System.out.println("forty");
                strDozens = "forty";
                break;
            case 5:
                //System.out.println("fifty");
                strDozens = "fifty";
                break;
            case 6:
                //System.out.println("sixty");
                strDozens = "sixty";
                break;
            case 7:
                //System.out.println("seventy");
                strDozens = "seventy";
                break;
            case 8:
                //System.out.println("eighty");
                strDozens = "eighty";
                break;
            case 9:
                //System.out.println("ninety");
                strDozens = "ninety";
                break;
        }

        switch (hundreds) {
            case 1:
               // System.out.println("one hundred");
                strHundreds="one hundred";
                break;
            case 2:
                //System.out.println("two hundred");
                strHundreds="two hundred";
                break;
            case 3:
                //System.out.println("three hundred");
                strHundreds="three hundred";
                break;
            case 4:
                //System.out.println("four hundred");
                strHundreds="four hundred";
                break;
            case 5:
                //System.out.println("five hundred");
                strHundreds="five hundred";
                break;
            case 6:
                //System.out.println("six hundred");
                strHundreds="six hundred";
                break;
            case 7:
                //System.out.println("seven hundred");
                strHundreds="seven hundred";
                break;
            case 8:
                //System.out.println("eight hundred");
                strHundreds="eight hundred";
                break;
            case 9:
               // System.out.println("nine hundred");
                strHundreds="nine hundred";
                break;

        }
        if (number <= 10) {
            System.out.println(strUnits);
        } if(number<=13){
            System.out.println("Read number: "+strHundreds+ " "+strDozens+ " "+strNumbers);
        } else {
            System.out.println("Read number: "+strHundreds+ " "+strDozens+"-"+ strUnits+ " "+strNumbers);
        }
    }
}
