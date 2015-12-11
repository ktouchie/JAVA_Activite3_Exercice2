import java.util.Scanner;
class Exercice1 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une note sur 20:");
        int note = sc.nextInt();
        int highest = 0;
        
        while (note>=0) {
            if (note>highest) {
                highest = note;
            }
        }
        
        System.out.println("")
        
    }
}