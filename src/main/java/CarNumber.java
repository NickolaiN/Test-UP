import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CarNumber {
    public static String carNumberGenerator() {
        ArrayList<String> coolNumbersList = new ArrayList<>();
        ArrayList<String> coolNumbersListWithoutRegion = new ArrayList<>();

        String numberplate = "";
        String numberplateWithoutRegion = "";

        char x;
        char z;
        char y;
        ArrayList<Character> allowedLetters = new ArrayList(){{
            add('А');
            add('В');
            add('Е');
            add('К');
            add('М');
            add('Н');
            add('О');
            add('Р');
            add('С');
            add('Т');
            add('У');
            add('Х');
        }};

        for(Character firstLetter : allowedLetters){
            x = firstLetter;
            for (int n = 0; n < 10; n++){
                for (Character secondLetter : allowedLetters){
                    z = secondLetter;
                    for(Character thirdLetter : allowedLetters){
                        y = thirdLetter;
                        numberplateWithoutRegion = String.format("%c%d%d%d%c%c", x, n, n, n, z, y);
                        coolNumbersListWithoutRegion.add(numberplateWithoutRegion);
                    }
                }
            }
        }

        for (String numberWithoutRegion : coolNumbersListWithoutRegion) {
            for (int j = 0; j <= 199; j++){
                if(j < 10){
                    numberplate = String.format("%s0%d", numberWithoutRegion, j);
                    coolNumbersList.add(numberplate);
                }
                else {
                    numberplate = String.format("%s%d", numberWithoutRegion, j);
                    coolNumbersList.add(numberplate);
                }
            }
        }
        double randNumD = Math.random() * (10000 - 1) + 1;
        int randNumI = (int) Math.round(randNumD);
        String number = coolNumbersList.get(randNumI);
        return number;
    }
}
