public class SwitchCase {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        switch(ch) {
            case 1:
                return Math.PI * a[0] * a[0];
            case 2:
                return a[0] * a[1];
            default:
                return 0;
        }
    }
}
