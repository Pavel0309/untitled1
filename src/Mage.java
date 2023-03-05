public class Mage extends Person{
Integer hp=100;
Integer protection=15;
Integer Youdamage=0;

void takeDamage(Integer damage) {
   hp=hp-(damage-protection-hp%10);
    System.out.println("вы получили удар, и ваше здоровье "+hp);;
    }
    Integer fireBall(Integer Youdamage) {
        System.out.println("атака фаербол наносит  "+(Youdamage + 45)+"  урона");
        return Youdamage;
    }

void Anounce(String name){
    System.out.println("Person  " + name + "  имеет характеристики: " + hp + "здоровья и " + protection + " защиты");

    }

    }


