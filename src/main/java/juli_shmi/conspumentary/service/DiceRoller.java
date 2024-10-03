package juli_shmi.conspumentary.service;

import juli_shmi.conspumentary.model.Result;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class DiceRoller {

    public Result roll(String abilityType, int abilityValue, String damageType, int damageValue) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        int dicesModifier = calculateAmountOfDices(abilityType, damageType, damageValue);
        int dices = abilityValue + dicesModifier;
        if (dices > 0) {
            Random random = new Random();
            for (int i = 0; i < dices; i++) {
                resultArray.add(random.nextInt(6) + 1);
            }
            return provideResult(resultArray);
        } else {
            throw new IllegalArgumentException("You have more damage points than ability points");
        }
    }

    private int calculateAmountOfDices(String abilityType, String damageType, int damageValue) {
        int dicesModifier;
        switch (abilityType.toLowerCase()) {
            case "badass" -> {
                if (!damageType.equalsIgnoreCase("injury")) {
                    throw new IllegalArgumentException("Error: BadAss should only be affected by injuries.");
                }
                dicesModifier = -damageValue;
            }
            case "smartass" -> {
                if (!damageType.equalsIgnoreCase("injury")) {
                    throw new IllegalArgumentException("Error: SmartAss should only be affected by injuries.");
                }
                dicesModifier = damageValue;
            }
            case "egghead" -> {
                if (!damageType.equalsIgnoreCase("psychosis")) {
                    throw new IllegalArgumentException("Error: Egghead should only be affected by psychoses.");
                }
                dicesModifier = -damageValue;
            }
            case "tinfoilhat" -> {
                if (!damageType.equalsIgnoreCase("psychosis")) {
                    throw new IllegalArgumentException("Error: TinFoilHat should only be affected by psychoses.");
                }
                dicesModifier = damageValue;
            }
            default -> throw new IllegalArgumentException("Unknown attribute type: " + abilityType);
        }
        return dicesModifier;
    }

    private Result provideResult(ArrayList<Integer> resultArray) {
        Result result = new Result();
        result.setResultArray(resultArray);
        if (resultArray.contains(6)) {
            result.setResult("Success");
        } else {
            result.setResult("Fail");
        }
        return result;
    }
}

