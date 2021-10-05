public class Arena {
    AdvancedGamer gracz1;
    AdvancedGamer gracz2;
    int wynikGracz1 = 0;
    int wynikGracz2 = 0;

    public Arena(AdvancedGamer gracz1, AdvancedGamer gracz2){
        this.gracz1 =gracz1;
        this.gracz2 = gracz2;
    }

    public void fight(int liczbaRund){

      for (int i = 1; i<liczbaRund+1; i++){
        int x1 = gracz1.play(gracz2.fake());
        int x2 = gracz2.play(gracz1.fake());
          System.out.println("Runda:"+ i);
          if (x1 == 1){
              System.out.println(x2);
              if (x2 == 1){
                  System.out.println("Zagrano Kamien na Kamien");
                  System.out.println("REMIS!");
                  System.out.println(gracz1.name()+":"+wynikGracz1);
                  System.out.println(gracz2.name()+":"+wynikGracz2);
                  gracz1.score(false,1);
                  gracz2.score(false,1);
              }
              else if (x2 == 2){
                  wynikGracz2 = wynikGracz2 +1;
                  System.out.println("Zagrano Kamien na Papier");
                  System.out.println("Wygrywa gracz "+gracz2.name()+"!");
                  System.out.println(gracz1.name()+":"+wynikGracz1);
                  System.out.println(gracz2.name()+":"+wynikGracz2);
                  gracz1.score(false,2);
                  gracz2.score(true,1);
              }
              else if (x2 == 3){
                  wynikGracz1 = wynikGracz1 +1;
                  System.out.println("Zagrano Kamien na Nozyce");
                  System.out.println("Wygrywa gracz "+gracz1.name()+"!");
                  System.out.println(gracz1.name()+":"+wynikGracz1);
                  System.out.println(gracz2.name()+":"+wynikGracz2);
                  gracz1.score(true,3);
                  gracz2.score(false,1);
              }
          }
          else if (x1==2){
              if (x2 == 1){
                  wynikGracz1 = wynikGracz1+1;
                  System.out.println("Zagrano Papier na Kamien");
                  System.out.println("Wygrywa gracz "+gracz1.name()+"!");
                  System.out.println(gracz1.name()+":"+wynikGracz1);
                  System.out.println(gracz2.name()+":"+wynikGracz2);
                  gracz1.score(true,1);
                  gracz2.score(false,2);
              }
              else if (x2 == 2){
                  System.out.println("Zagrano Papier na Papier");
                  System.out.println("REMIS!");
                  System.out.println(gracz1.name()+":"+wynikGracz1);
                  System.out.println(gracz2.name()+":"+wynikGracz2);
                  gracz1.score(false,2);
                  gracz2.score(false,2);
              }
              else if (x2 == 3){
                  wynikGracz2 = wynikGracz2 +1;
                  System.out.println("Zagrano Papier na Nozyce");
                  System.out.println("Wygrywa gracz "+gracz2.name()+"!");
                  System.out.println(gracz1.name()+":"+wynikGracz1);
                  System.out.println(gracz2.name()+":"+wynikGracz2);
                  gracz1.score(false,3);
                  gracz2.score(true,2);
              }}
              else if (x1==3){


                  if (x2 == 1){
                      wynikGracz2 = wynikGracz2+1;
                      System.out.println("Zagrano Nozyce na Kamien");
                      System.out.println("Wygrywa gracz "+gracz2.name()+"!");
                      System.out.println(gracz1.name()+":"+wynikGracz1);
                      System.out.println(gracz2.name()+":"+wynikGracz2);
                      gracz1.score(false,1);
                      gracz2.score(true,3);
                  }
                  else if (x2 == 2){
                      wynikGracz1 = wynikGracz1 +1;
                      System.out.println("Zagrano Nozyce na Papier");
                      System.out.println("Wygrywa gracz "+ gracz1.name()+"!");
                      System.out.println(gracz1.name()+":"+wynikGracz1);
                      System.out.println(gracz2.name()+":"+wynikGracz2);
                      gracz1.score(true,2);
                      gracz2.score(false,3);
                  }
                  else if (x2 == 3){
                      System.out.println("Zagrano Nozyce na Nozyce");
                      System.out.println(gracz1.name()+":"+wynikGracz1);
                      System.out.println(gracz2.name()+":"+wynikGracz2);
                      gracz1.score(false,3);
                      gracz2.score(false,3);
                  }
          }



    }




}}
//1-Kamien     2- Papier    3 - nozyce