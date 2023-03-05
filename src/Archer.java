public class Archer extends Person{
    Integer hp=120;
    Integer protection=12;
    Integer Youdamage=0;

     void takeDamage(Integer damage) {
        hp=hp-(damage-protection+hp%10);
    }
    Integer shootBow(){
         Youdamage= Youdamage+40+hp%10;
        System.out.println("атака выстрел из лука наносит  "+(Youdamage + 40+hp%10)+"  урона");
         return Youdamage;
     }
    void Anounce(String name){
        System.out.println("Person  " + name + "  имеет характеристики: " + hp + "здоровья и " + protection);

}

}
