import org.w3c.dom.ls.LSOutput;
 class Person {
    Integer hp = 50;
    Integer protection = 0;
    String name;
    Integer Youdamage=0;
     Integer damage;
    void Anounce(String name){
        System.out.println("Person  " + name + "  имеет характеристики: " + hp + "здоровья и " + protection + " защиты");

    }


    void takeDamage(Integer damage) {
        hp = hp - (damage - protection);
        System.out.println("вы получили удар, и ваше здоровье "+hp);}
  Integer facePunch(Integer damage) {
      hp = hp - damage;
      System.out.println("произвелся удар в лицо, здоровье " + hp);
      return hp;
  }



  }






