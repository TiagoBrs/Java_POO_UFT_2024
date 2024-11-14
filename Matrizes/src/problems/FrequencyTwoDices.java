package problems;
import java.security.SecureRandom;

public class FrequencyTwoDices {
    private final static int FACES = 6;

    public static void main(String[] args) {
        int[] frequency = new int[ (FACES+FACES+1)];
        int face_1, face_2, sum;

        for (int i = 0; i < 36_000; i++) {
            face_1 = rollDice();
            face_2 = rollDice();
            sum = face_1 + face_2;
            ++frequency[sum];
        }

        for (int i = 1; i <= FACES+FACES; i++) {
            System.out.printf(" %5d ", frequency[i]);

            if(i % 3 == 0)
                System.out.println();
        }



    }

    public static int rollDice() {
        final SecureRandom random = new SecureRandom();
        int face = random.nextInt(FACES) + 1;
        return face;
    }
}
