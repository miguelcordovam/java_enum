package old;

import old.Actions;

public class App {

    public static void main(String[] args) {

        String action = args[0].toUpperCase();

        switch(Actions.valueOf(action)) {

            case RUN:
                run("correr");
                break;
            case WALK:
                walk("caminar");
                break;
            case EAT:
                eat("comer");
                break;
            case CRY:
                cry("llorar");
                break;
            case JUMP:
                jump("saltar");
                break;
            default:
                System.out.println("No action");
                break;
        }

    }

    private static void cry(String param) {
        System.out.println("CRY - Param: " + param);
    }
    private static void eat(String param) {
        System.out.println("EAT - Param: " + param);
    }
    private static void run(String param) {
        System.out.println("RUN - Param: " + param);
    }
    private static void walk(String param) {
        System.out.println("WALK - Param: " + param);
    }
    private static void jump(String param) {
        System.out.println("JUMP - Param: " + param);
    }
}
