public class WhileLoopWithBreak {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            if (i == 3) {
                break;
            }
            System.out.println("Number: " + i);
            i++;
        }
    }
}
