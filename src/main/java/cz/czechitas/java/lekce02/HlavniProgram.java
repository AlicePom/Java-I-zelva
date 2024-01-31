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


   public void start() {
    zofka = new Turtle();
    nakresliPrasatko();
  }
}
