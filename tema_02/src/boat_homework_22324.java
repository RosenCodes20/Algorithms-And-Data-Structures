public class boat_homework_22324 {

    static String change_status(int object, String object_pos) {
        if (object > 0) {
            object_pos = "Start";
        }

        else {
            object_pos = "Right";
        }

        return object_pos;
    }


    public static void main(String[] args){

        int wolf = 1;
        int man = 1;
        int cabbage = 1;
        int goat = 1;

        String wolf_pos = "None";
        String man_pos = "None";
        String cabbage_pos = "None";
        String goat_pos = "None";

        for (int i = 1; i <= 4 ; i++) {

            if (wolf > 0) {

                if (cabbage > 0) {

                    if (goat > 0) {

                        man = -1;
                        goat = -1;

                    } else {

                        cabbage = -1;

                        goat = 1;
                        man = 1;


                    }

                } else {
                    wolf = -1;
                    man = -1;
                }

            } // end of if

            else {
                goat = -1;
                man = -1;
            }

            wolf_pos = change_status(wolf, wolf_pos);
            man_pos = change_status(man, man_pos);
            cabbage_pos = change_status(cabbage, cabbage_pos);
            goat_pos = change_status(goat, goat_pos);

            System.out.println("Wolf: " + wolf_pos);
            System.out.println("Man: " + man_pos);
            System.out.println("Cabbage: " + cabbage_pos);
            System.out.println("Goat: " + goat_pos + "\n");

        } // end of for
    }
}