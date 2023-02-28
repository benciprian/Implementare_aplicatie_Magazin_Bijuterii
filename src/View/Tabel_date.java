package View;
import Model.Magazin_Bijuterii;

public class Tabel_date
{
    public static void linii(int nr, String sir) {
        for (int i=0;i<nr;i++) {
            System.out.print(sir);
        }
        System.out.println();
    }
    public static void capTabel1() {
        linii(60,"=");
        System.out.println("|   Denumire    |      Tip      |StocInit| PretUnit| Vandute|");
        linii(60,"=");
    }
    public static void tabel1(Magazin_Bijuterii comp[]) {
        if(comp!=null) {
            capTabel1();
            for(int i=0;i<comp.length;i++) {
                System.out.format("|%-15s|%-15s|%8d|%8d|%8d|\n",
                        comp[i].getDenumire(),comp[i].getTip(),
                        comp[i].getStocInitial(),comp[i].getPretUnitar(),comp[i].getVandute());
            }
            linii(60,"=");
        }
        else
            System.out.println("Atentie!!, n-ai citit datele din fisier");
    }
    public static void capTabel2() {
        linii(52,"=");
        System.out.println("|   Denumire    |      Tip      |Disponib|PretUnit |");
        linii(52,"=");
    }
    public static void tabel2(Magazin_Bijuterii comp[]) {
        if(comp!=null) {
            capTabel2();
            for(int i=0;i<comp.length;i++) {
                int dif=comp[i].getStocInitial()-comp[i].getVandute();
                if(dif>0)
                    System.out.format("|%-15s|%-15s|%8d|%9d|\n",
                            comp[i].getDenumire(),comp[i].getTip(),
                           dif, comp[i].getPretUnitar(),dif*comp[i].getPretUnitar());
            }
            linii(52,"=");

        }
        else
            System.out.println("Atentie!!, n-ai citit datele din fisier");
    }
   public static void afisareSlabVanduta(Magazin_Bijuterii comp[])
   {
       int totVandutVal=0;
       int proc = 25; //citirea procentului
       System.out.println("Marfa vanduta sub " +proc+ " procente din stocul initial");
       linii(64,"=");
       System.out.println("|Denumire  |  Tip    | StocInit  | Vandute |  Pret  | Valoare |");
       linii(64,"-");
       for(int i=0;i<comp.length;i++) {
           totVandutVal= comp[i].getVandute()*comp[i].getPretUnitar();
           int vandutePrag = comp[i].getStocInitial() * proc / 100;
           if (comp[i].getVandute() < vandutePrag)
           System.out.format("|%-10s|%-10s|%10d|%8d|%8d|%11d|\n", comp[i].getDenumire(), comp[i].getTip(), comp[i].getStocInitial(), comp[i].getVandute(), comp[i].getPretUnitar(),totVandutVal);
       }
       linii(64,"=");
   }

}
