package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void nakresliPrasatko(){
    // začátek - záda
    zofka.turnRight(90);
    zofka.move(200);

    // bonus - ocásek
    zofka.turnLeft(30);
    zofka.move(60);
    for (int i = 0; i < 20; i++){
      zofka.turnLeft(15);
      zofka.move(5);
    }
    zofka.move(30);
    for (int i = 0; i < 8; i++){
      zofka.turnLeft(15);
      zofka.move(5);
    }
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(90);
    zofka.turnLeft(90);
    zofka.move(32);
    zofka.penDown();

    // pokračování zbytku těla
    zofka.move(150);
    zofka.turnLeft(30);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.move(50);
    zofka.turnLeft(120);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.move(50);
    zofka.turnLeft(120);
    zofka.move(200);
    zofka.turnLeft(120);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.move(50);
    zofka.turnLeft(120);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.move(50);
    zofka.turnLeft(30);
    zofka.move(150);
    zofka.turnLeft(120);
    zofka.move(150);
    zofka.turnLeft(120);
    zofka.move(150);

    // želva odleze kus dál, aby bylo dílo vidět
    zofka.penUp();
    zofka.turnLeft(30);
    zofka.move(300);
    zofka.turnLeft(90);
  }

  public void nakresliOsmiuhelnik(){
    for (int i = 0; i < 8; i++) {
      zofka.move(50);
      zofka.turnLeft(180 - ((360*3)/8));
    }
  }

  public void nakresliKolecko(){
    for (int i = 0; i < (360/6); i++) {
      zofka.move(6);
      zofka.turnLeft(6);
    }
  }

  public void nakresliSlunicko(){
    for (int i = 0; i < (360/30); i++) {
      for (int j = 0; j < 5; j++){
        zofka.move(6);
        zofka.turnLeft(6);
      }
      zofka.turnRight(90);
      zofka.move(24);
      zofka.turnLeft(180);
      zofka.move(24);
      zofka.turnRight(90);
    }
  }

  public void nakresliDomecek(){
    zofka.turnRight(90);
    for (int i = 0; i < 3; i++) {
      zofka.move(150);
      zofka.turnRight(90);
    }
    zofka.move(150);
    zofka.turnRight(30);
    zofka.move(150);
    zofka.turnRight(120);
    zofka.move(150);
    zofka.turnLeft(60);
    zofka.penUp();
    zofka.move(80);
    zofka.turnLeft(90);
    zofka.penDown();
  }

  public void nakresliA(){
    zofka.turnRight(20);
    zofka.move(100 / Math.sin(70 * Math.PI/180));
    zofka.turnRight(140);
    zofka.move(100 / Math.sin(70 * Math.PI/180));
    zofka.penUp();
    zofka.turnLeft(160);
    zofka.move(40);
    zofka.turnLeft(90);
    zofka.move(10);
    zofka.penDown();
    zofka.move(50);
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(40);
    zofka.turnLeft(90);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.penDown();
  }

  public void nakresliL(){
    zofka.move(100);
    zofka.turnLeft(180);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.penUp();
    zofka.move (50);
    zofka.turnLeft(90);
    zofka.penDown();
  }

  public void nakresliI(){
    zofka.move(100);
    zofka.turnLeft(180);
    zofka.move(100);
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();
  }

  public void nakresliC(){
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(70);
    zofka.turnLeft(90);
    zofka.move(72);
    zofka.penDown();
    for (int i = 0; i < (20); i++) {
      zofka.turnLeft(9);
      zofka.move(5);
    }
    zofka.move(32);
    for (int i = 0; i < (20); i++) {
      zofka.move(5);
      zofka.turnLeft(9);
    }
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(30);
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penDown();
  }

  public void nakresliE(){
    zofka.turnRight(90);
    zofka.move(50);
    zofka.turnLeft(180);
    zofka.penDown();
    zofka.move(50);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(50);
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(50);
    zofka.turnRight(90);
    zofka.penDown();
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.penUp();
    zofka.move(50);
    zofka.turnLeft(90);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.penDown();
  }

  public void start() {
    zofka = new Turtle();

//    // Žofka nakreslí prasátko
//    nakresliPrasatko();
//
//    // Žofka se posune
//    zofka.turnRight(90);
//    zofka.move(200);
//    zofka.turnLeft(90);
//    zofka.penDown();
//
//    // Žofka nakreslí osmiúhelník
//    nakresliOsmiuhelnik();
//
//    // Žofka se posune
//    zofka.penUp();
//    zofka.turnRight(90);
//    zofka.move(200);
//    zofka.turnLeft(90);
//    zofka.move(15);
//    zofka.penDown();
//
//    // Žofka nakreslí kolečko
//    nakresliKolecko();
//
//    // Žofka se posune
//    zofka.penUp();
//    zofka.turnRight(90);
//    zofka.move(200);
//    zofka.turnLeft(90);
//    zofka.penDown();
//
//    // Žofka nakreslí sluníčko
//    nakresliSlunicko();
//
//    // Žofka se posune
//    zofka.penUp();
//    zofka.turnRight(90);
//    zofka.move(100);
//    zofka.turnLeft(90);

    // Žofka se posune
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(300);
    zofka.turnRight(90);
    zofka.move(250);
    zofka.penDown();

    nakresliSlunicko();

    // Žofka se posune
    zofka.turnLeft(90);
    zofka.penUp();
    zofka.move(250);
    zofka.turnLeft(90);
    zofka.move(350);
    zofka.turnLeft(180);
    zofka.penDown();

    nakresliDomecek();
    nakresliDomecek();
    nakresliDomecek();
    nakresliDomecek();
    nakresliDomecek();

    // Žofka se posune
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(220*5 + 50);
    zofka.turnLeft(90);
    zofka.move(350);
    zofka.turnLeft(180);
    zofka.penDown();

    nakresliDomecek();

    // Žofka se posune
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(200);
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.penDown();

    nakresliPrasatko();

    // Žofka se posune
    zofka.turnRight(90);
    zofka.move(200);
    zofka.turnLeft(90);
    zofka.move(100);
    zofka.penDown();

    nakresliDomecek();

    // Žofka se posune
    zofka.penUp();
    zofka.move(600);
    zofka.turnLeft(90);
    zofka.move(600);
    zofka.turnRight(90);
    zofka.penDown();

    nakresliA();
    nakresliL();
    nakresliI();
    nakresliC();
    nakresliE();
  }
}
