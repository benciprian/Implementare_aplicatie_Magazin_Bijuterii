package Model;
import java.io.BufferedReader;
import java.io.FileReader;
public class Citire_date_din_fisier
{
    public static Magazin_Bijuterii[] citire() {
        try {
            BufferedReader fisIn=new BufferedReader(new FileReader("C:\\Users\\Ben27\\Desktop\\Exercitii rezolvate  Teachbit\\Magazin_Bijuterii\\src\\Model\\Bijuterii.txt"));
            String sir=fisIn.readLine();		//citire numar de linii
            int n=Integer.parseInt(sir);		//parsare in int, n=lungimea vectorului
            Magazin_Bijuterii comp[]=new Magazin_Bijuterii[n];	//comp de tip Computer

            for(int i=0;i<n;i++) {
                sir=fisIn.readLine();			    //citirea unei linii din fisier
                String atribut[]=sir.split(","); //despartire dupa ","
//                String Denumire=atribut[0];
//                String Tip=atribut[1];
//                int StocInitial=Integer.parseInt(atribut[2]);
//                int PretUnitar=Integer.parseInt(atribut[3]);
//                int Vandute=Integer.parseInt(atribut[4]);

                comp[i]=new Magazin_Bijuterii(atribut[0],atribut[1],Integer.parseInt(atribut[2]),Integer.parseInt(atribut[3]),Integer.parseInt(atribut[4]));
            }
            fisIn.close();
            return comp;
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
