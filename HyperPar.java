public class HyperPar {


    public static boolean hyperpar(int num) {
        int resto;
        if (num >= 0) {
            while (num != 0) {
                resto = num % 10;
                num = num / 10;
                if (resto % 2 != 0) {
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
}
