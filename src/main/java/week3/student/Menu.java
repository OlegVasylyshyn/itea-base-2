package week3.student;

public enum Menu {

    ADD_NEW_STUDENT(1, ""),
    REMOVE_STUDENT(2, ""),
    DISPLAY_ALL_STUDENTS(3),
    EXIT(4),
    DEFAULT(-1);

    private int index;

    Menu(int index, String str){
        this.index = index;
    }

    Menu(int index) {

    }

    public static Menu getMenu(int index) {
        Menu[] values = values();

        for(Menu menu : values) {
            if(menu.index == index) {
                return menu;
            }
        }

        return DEFAULT;
    }

}
