import java.util.Scanner;
class Exercice2 {
    
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int highest = 0;
        int note = 0;
        
        while (note>=0) {            
            System.out.println("Entrez une note sur 20:");
            note = sc.nextInt();
            if (note>highest) {
                highest = note;
            }
        }
        
        System.out.println("La note la plus grande est " + highest);
               
    }
}