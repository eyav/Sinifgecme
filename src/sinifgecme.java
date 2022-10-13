import java.util.Scanner;

public class sinifgecme {
    public static void main(String[] args) {
        double mat, fizik, kimya, muzik, ortalama, toplam, sayac;

        Scanner input = new Scanner(System.in);

        toplam=0;
        sayac=0;
        System.out.println("Matematik Notunuz:");
        mat = input.nextDouble();

        if (mat < 0 || mat > 100) {
            System.out.println("0 -100 aralığında olmayan notlar ortalamaya katılmaz");
        } else {
            toplam += mat;
            sayac +=1 ;
        }

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextDouble();
        if (fizik < 0 || fizik > 100) {
            System.out.println("0 -100 aralığında olmayan notlar ortalamaya katılmaz");
        } else {
            toplam += fizik;
            sayac += 1;
        }

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextDouble();
        if (kimya < 0 || kimya > 100) {
            System.out.println("0 -100 aralığında olmayan notlar ortalamaya katılmaz");
        } else {
            toplam += kimya;
            sayac += 1;
        }


        System.out.println("Müzik Notunuz: ");
        muzik = input.nextDouble();
        if (muzik < 0 || muzik > 100) {
            System.out.println("0 -100 aralığında olmayan notlar ortalamaya katılmaz");
        } else {
            toplam += muzik;
            sayac += 1;
        }
        ortalama = toplam / sayac;
        if (ortalama >= 55) {
            System.out.println("Tebrikler Geçtiniz... Not Ortalamanız: " + ortalama);
        } else {
            System.out.println("Maalesef Kaldınız!!! Not Ortalamanız: " + ortalama);
        }


    }
}
