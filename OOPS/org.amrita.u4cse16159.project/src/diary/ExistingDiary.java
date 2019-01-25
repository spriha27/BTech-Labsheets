package diary;

public class ExistingDiary {

    public static void noDiariesToDisplay() {
        System.err.println(" \t\t Sorry, there are no existing diaries.\n");
    }

    public static void selectStudentRollNumber(){
        System.out.println(" SELECT ROLL NUMBER \n");
    }

    public static void displayModificationPage(){
        System.out.println(" MODIFICATION PAGE \n");
    }


    public static void displayDeleteStudentMessage(){
        System.out.println("Enter the index of the student you want to delete");
    }

}
