import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] unArray = new int[5];
        for(int i = 0; i < unArray.length; i++) {
            int num= sc.nextInt();
            unArray[i]=num;
        }
        System.out.println("Tus valores son los siguientes:");
        for(int i : unArray){
            System.out.println(i);
        }
        System.out.println("\nOrden inverso:");
        System.out.println(unArray[4]+"\n"+unArray[3]+"\n"+unArray[2]+"\n"+unArray[1]+"\n"+unArray[0]);
    }
}
