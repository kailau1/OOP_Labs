public class Tamagotchi {
    private int hungriness;
    private int happiness;
    private int cleanness;
    private int tiredness;

    public Tamagotchi() {
        hungriness = 5;
        happiness = 5;
        cleanness = 5;
        tiredness = 0;
    }

    public int getHungriness() {
        return Math.min(hungriness, 10);
    }

    public int getHappiness() {
        return Math.min(happiness, 10);
    }

    public int getCleanness() {
        return Math.min(cleanness, 10);
    }

    public int getTiredness() {
        return Math.min(tiredness, 10);
    }

    public void feed() {
        hungriness = Math.max(hungriness - 5, 0);
    }

    public void takeForWalk() {
        happiness = Math.min(happiness + 3, 10);
        tiredness = Math.min(tiredness + 2, 10);
    }

    public void clean() {
        cleanness = Math.min(cleanness + 10, 10);
    }

    public void pet() {
        happiness = Math.min(happiness + 5, 10);
    }

    public String getCurrentMood() {
        if (tiredness == 10) {
            return "asleep";
        } else if (tiredness >= 8) {
            return "tired";
        } else if (hungriness >= 7) {
            return "hungry";
        } else if (cleanness < 3) {
            return "dirty";
        } else if (happiness >= 8) {
            return "happy";
        } else if (happiness >= 4) {
            return "Ok";
        } else {
            return "sad";
        }
    }

    public void passTime() {
        hungriness = Math.min(hungriness + 1, 10);
        cleanness = Math.max(cleanness - 1, 0);
        if (tiredness < 10) {
            tiredness = Math.min(tiredness + 1, 10);
        } else {
            tiredness = 0;
        }

        if (hungriness >= 7) {
            happiness = Math.max(happiness - 1, 0);
        }

        if (cleanness < 3) {
            happiness = Math.max(happiness - 1, 0);
        }
    }
}
