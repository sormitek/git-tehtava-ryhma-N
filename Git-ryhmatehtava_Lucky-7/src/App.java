import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        //Matias commit, muokkaus pelin teksteihin
    System.out.println("Tervetuloa pelaamaan lucky7 peliä!");
    System.out.println("***********************************");
    System.out.println("Numerolla 7 voittaa lisää krediittejä");
    System.out.println("Kuinka monta krediittiä haluat lisätä? Syötä määrä ja paina enter");

    int n = 1;
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    String q = "";
        // Raha
        
        int ir = s.nextInt();
    do{{    
        
        for ( ; ir > 0 ; ){
   // Arpa     
        
        int i = r.nextInt( 10);
        int i1 = r.nextInt(10);
        int i2 = r.nextInt(10);
    
    // Tulostus    
        System.out.print(i);
        System.out.print(i1);
        System.out.print(i2);
        System.out.println("");
        
    // voitot   
        if (i == 7 | i1 == 7 | i2 == 7) 
            {System.out.println("Onneksi olkoon, voitit!");
            if (i == 7) ir++;
            if (i1 == 7) ir++;
            if (i2 == 7) ir++;
    }
        else {
                System.out.println("hävisit");
            ir--;
        }
        if (ir == 0){
            System.out.println("krediitit loppuivat");
            n = 0;
            break; 
   
        }
        
            System.out.println("krediittejä on jäljellä "+ir);
            System.out.println("Pelataksesi uudestaan, paina enter. Lopettaaksesi syötä 'e' ja paina enter");
            q = s1.nextLine();
            q = q.trim();
        if (q.equals ("e")){
            System.out.print("kiitos pelaamisesta, sinulle jäi "+ir);
            System.out.println(" krediittiä");
            n = 0;
            break;    
        }}
    }
break;
}while (!q.equals("e"));  
System.exit(n);
    }}

