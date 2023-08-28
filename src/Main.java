import java.util.Arrays;
public class Main {
    public static String[] singers;

    public static void main(String[] args) {

        singers = new String[5];
        singers[0] = " Scriptonite";
        singers[1] = " Scriptonite";
        singers[2] = "Florence and Machine";
        singers[3] = "Florence and Machine";
        singers[4] = "30 seconds to Mars";

        for (int i = 0; i < singers.length; i++) {

            String unique = singers[i];
            for (int j = i + 1; j < singers.length; j++) {
                if (unique == null)
                    break;

                if (unique.equals(singers[j])) {
                    singers[i] = null;

                }
            }
        }
        for (String singer: singers)
            System.out.println(singer + " , "); {


        }


    }
}
