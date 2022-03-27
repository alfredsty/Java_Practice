package Tutorial.ch01.switch_Case;

public class Main {

    public static void main(String[] args) {
        final int LEVEL_1_BASIC = 1;
        final int LEVEL_2_RUNNER = 2;
        final int LEVEL_3_FLY = 3;

        int level = 0;
        switch(level) {
            case LEVEL_1_BASIC :
                System.out.println("환영합니다 1레벨입니다");
                break;
            case LEVEL_2_RUNNER:
                System.out.println("2레벨 부터는 달릴 수 있습니다.");
                break;
            case LEVEL_3_FLY:
                System.out.println("3레벨 부터는 날 수 있습니다.");
                break;
                default:
                break;
        }

        int month = 0;
        switch(month){
            case 1,3,5,7,10,12 -> {
                System.out.println(month + "월은 31일까지 있어요");
            }
            case 4,6,9,11 -> {
                System.out.println(month + "월은 30일까지 있어요");
            }
            case 2 -> {
                System.out.println(month + "월은 28일까지 있어요");
            }
            default -> {
            }

        }
    }
}
