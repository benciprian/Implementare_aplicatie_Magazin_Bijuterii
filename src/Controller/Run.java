package Controller;

import Model.Citire_date_din_fisier;
import Model.Magazin_Bijuterii;
import View.Tabel_date;

import java.util.Scanner;

public class Run
{
    public static int citIntreg(String sir) {
        try {System.out.print(sir);
            Scanner scanner= new Scanner(System.in);
            int intreg=scanner.nextInt();
            return intreg;
        }
        catch(Exception e) {
            System.out.println("ai gresit mai incearca!!!");
            return citIntreg(sir);
        }
    }
    public static int meniu()
    {
        System.out.println();
        System.out.println("1.Citire date din fisier, afisare marfa");
        System.out.println("2.Afisare marfa disponibila");
        System.out.println("3.Afisare marfa vanduta sub p% din stoc initial");
        System.out.println("0.Terminare program");
        return citIntreg("optiunea ta:");
    }
    public static void main(String[] args) {
        Magazin_Bijuterii comp[]=null; 			//vector cu evidenta marfii
        int optiune=meniu();
        while(optiune!=0) {
            switch(optiune) {
                case 1: comp= Citire_date_din_fisier.citire();
                    Tabel_date.tabel1(comp);
                    break;
                case 2: Tabel_date.tabel2(comp);
                    break;
                case 3: Tabel_date.afisareSlabVanduta(comp);
                    break;
                default: System.out.println("Ai gresit optiunea, introdu o optiune corecta!!!");
            }
            optiune=meniu();
        }
        System.out.println("Program terminat!!!");
    }
}
