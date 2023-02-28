package Model;

public class Magazin_Bijuterii //declarare clasa
{
    private String Denumire;   //declarare variabile membre ale clasei Magazin_Bijuterii
    private String Tip;
    private int StocInitial;  //cantitatea initiala
    private int Vandute;  //>=0 si <= stocI ; numar de obiecte vandute
    private int PretUnitar;

    //constructori telescopici
    public Magazin_Bijuterii (String Denumire, String Tip, int StocInitial,int PretUnitar)
    {
        this(Denumire,Tip,StocInitial,PretUnitar,0);
    }
    public Magazin_Bijuterii (String Denumire, String Tip, int StocInitial,int PretUnitar,int Vandute)
    {
        this.Denumire=Denumire;
        this.Tip=Tip;
        this.StocInitial=StocInitial;
        this.PretUnitar=PretUnitar;
        if(Vandute>StocInitial) this.Vandute=0;
        else             this.Vandute=Vandute;
    }
    //accesori de tip "get" si "set"
    public String getDenumire()
    {
        return Denumire;
    }
    public void setDenumire(String Denumire)
    {
        this.Denumire = Denumire;
    }
    public String getTip()
    {
        return Tip;
    }
    public void setTip(String Tip)
    {
        this.Tip = Tip;
    }
    public int getStocInitial()
    {
        return StocInitial;
    }
    public void setStocInitial(int StocInitial)
    {
        this.StocInitial = StocInitial;
    }
    public int getPretUnitar()
    {
        return PretUnitar;
    }
    public void setPretUnitar(int PretUnitar)
    {
        this.PretUnitar = PretUnitar;
    }
    public int getVandute()
    {
        return Vandute;
    }
    public void setVandut(int vandut)
    {
        this.Vandute = vandut;
        if(Vandute>this.StocInitial) this.Vandute=0;

    }

}
