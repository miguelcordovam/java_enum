package poly;

public class AppNew {
    public static void main(String[] args) {

        String action = args[0].toUpperCase();

        ActionsNew actionsNew = ActionsNew.valueOf(action);
        actionsNew.exec(action);

    }

}
