package FamilyOfCalculator;

import java.util.Arrays;

public class ProgramCalculator extends SimpleCalculator{
    public ProgramCalculator(){

    }
    public static void hexToBit(int numberHex) {

        int printNumberHex = numberHex;

        String bit = "";
        int i = 0;
        boolean flag = true;

        while (flag) {
            if (i == 0) {
                if ((numberHex % 2) == 0) {
                    bit += "0";
                } else bit += "1";
                i++;
            } else {
                if (numberHex != 1){
                    numberHex  = numberHex / 2;
                    if ((numberHex % 2) == 0) {
                        bit += "0";
                    } else  bit += "1";
                } else flag = false;
                i++;
            }
        }

        char[] arrayBit = bit.toCharArray();

        i = 0;
        while(i < ((arrayBit.length-1) / 2)){
            char temp = arrayBit[i];
            arrayBit[i] = arrayBit[arrayBit.length - 1 - i];
            arrayBit[arrayBit.length - 1 - i] = temp;
            i++;
        }
        System.out.println("Number " + printNumberHex + " in bits " + Arrays.toString(arrayBit));
    }
}
