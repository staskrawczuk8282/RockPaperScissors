import java.util.Random;

public class GraczChainAI extends AdvancedGamer{


        int iloscRUND = 1;

        int ZagrywkaPrzeciwnikaPoprzedniejTury = 0;

        int MojePoprzednieZagranie;
        //                               K  P  N
    int TabGdyPrzeciwnikPrzegra [][] = {{33,33,33},{33,33,33},{33,33,33}};
    int TabGdyPrzeciwnikWygra [][] = {{33,33,33},{33,33,33},{33,33,33}};
    int TabGdyPrzeciwnikRemis [][] = {{33,33,33},{33,33,33},{33,33,33}};

    char OstatniWynik;





    public int fake() {
        int fake = ZagrywkaPrzeciwnikaPoprzedniejTury;
        return fake;
    }


    public int play(int fake) {
       int AnalizaZagrania;
       int MojeZagranie = 1;
        if (OstatniWynik == 'P'){
            AnalizaZagrania = WybieranieZagrania(TabGdyPrzeciwnikWygra[ZagrywkaPrzeciwnikaPoprzedniejTury-1][0],TabGdyPrzeciwnikWygra[ZagrywkaPrzeciwnikaPoprzedniejTury-1][1],TabGdyPrzeciwnikWygra[ZagrywkaPrzeciwnikaPoprzedniejTury-1][2]);
            if (AnalizaZagrania == 1)
                MojeZagranie =2;
            else if (AnalizaZagrania ==2)
                MojeZagranie=3;
            else
                MojeZagranie= 1;
        }
        else if (OstatniWynik =='W'){
            AnalizaZagrania = WybieranieZagrania(TabGdyPrzeciwnikPrzegra[ZagrywkaPrzeciwnikaPoprzedniejTury-1][0],TabGdyPrzeciwnikPrzegra[ZagrywkaPrzeciwnikaPoprzedniejTury-1][1],TabGdyPrzeciwnikPrzegra[ZagrywkaPrzeciwnikaPoprzedniejTury-1][2]);
            if (AnalizaZagrania == 1)
                MojeZagranie =2;
            else if (AnalizaZagrania ==2)
                MojeZagranie=3;
            else
                MojeZagranie= 1;
        }
        else if (OstatniWynik =='R'){
            AnalizaZagrania =WybieranieZagrania(TabGdyPrzeciwnikRemis[ZagrywkaPrzeciwnikaPoprzedniejTury-1][0],TabGdyPrzeciwnikRemis[ZagrywkaPrzeciwnikaPoprzedniejTury-1][1],TabGdyPrzeciwnikRemis[ZagrywkaPrzeciwnikaPoprzedniejTury-1][2]);
            if (AnalizaZagrania == 1)
                MojeZagranie =2;
            else if (AnalizaZagrania ==2)
                MojeZagranie=3;
            else
                MojeZagranie= 1;
        }
        else if (OstatniWynik =='Z')
            MojeZagranie = 1;


         MojePoprzednieZagranie = MojeZagranie;
        return MojeZagranie;
    }


    public String name() {
        return "ChainAI";
    }


    public void score(boolean wynik, int enemyMove) {

          if (iloscRUND>1){

            if (wynik==true){
                TabGdyPrzeciwnikPrzegra[ZagrywkaPrzeciwnikaPoprzedniejTury-1][enemyMove-1] +=1;
                OstatniWynik = 'W';

            }
            else{
                if (MojePoprzednieZagranie == enemyMove){
                    TabGdyPrzeciwnikRemis[ZagrywkaPrzeciwnikaPoprzedniejTury-1][enemyMove-1] +=1;
                    OstatniWynik = 'R';
                }

                else {
                    TabGdyPrzeciwnikWygra[ZagrywkaPrzeciwnikaPoprzedniejTury-1][enemyMove-1] +=1;
                    OstatniWynik = 'P';

                }
            }}
          else
              OstatniWynik ='Z';

            ZagrywkaPrzeciwnikaPoprzedniejTury = enemyMove;
            iloscRUND = iloscRUND +1;
            if (iloscRUND%1001==0){
                for (int i =0; i<3; i++){
                    for (int j =0; j<3; j++){
                        TabGdyPrzeciwnikWygra[i][j]=33;
                        TabGdyPrzeciwnikPrzegra[i][j]=33;
                        TabGdyPrzeciwnikRemis[i][j]=33;
                    }
                }

            }



    }

    public int WybieranieZagrania(int x1, int x2, int x3){
        int liczba = x1 + x2 + x3;
        Random losowaLiczba = new Random();
        int wynik = losowaLiczba.nextInt(liczba)+1;
        if(wynik>0 && wynik<=x1)
            return 1;
        else if (wynik>x1 && wynik<=(x1+x2))
            return 2;
        else
            return 3;
    }

    public void Wyswietl(){
        for (int[] x : TabGdyPrzeciwnikWygra
             ) {
            for (int y: x
                 ) {
                System.out.println(y);
            }
        }
    }
}
