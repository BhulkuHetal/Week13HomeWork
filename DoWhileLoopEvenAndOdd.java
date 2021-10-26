package HomwWorkWeek13;

public class DoWhileLoopEvenAndOdd {
    public static void main(String[] args) {

        int a = 0;
        do {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }// Print 10 even number
        while (a < 20);

        int i = 0;
        do{

        if (i % 2 == 1) {
            System.out.println(i);
        }
        i++;// Print 10 odd number
    }
    while(i <= 20);
}



}
