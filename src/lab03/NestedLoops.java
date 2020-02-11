package lab03;

public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for(int z = 1; z <= i; z ++){
                System.out.print(z + " ");
            }
            System.out.println(" ");
        }

        System.out.println("==========");

        for (int i = 5; i >= 1; i --) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
