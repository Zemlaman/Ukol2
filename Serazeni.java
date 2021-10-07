import java.util.Scanner;

public class Serazeni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Napiste dva stejne dlouhe stringy");

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        for (int i = 0; i < input1.length(); i++) {
            int asci1 = input1.charAt(i);
            int asci2 = input2.charAt(i);

            do{
                if(asci1 < asci2){
                    System.out.println(input1);
                    return;
                } else {
                    System.out.println(input2);
                    return;
                }
            }while (asci1 != asci2);
        }
    }
}
