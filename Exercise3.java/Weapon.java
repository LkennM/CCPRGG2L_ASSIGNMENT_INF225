public class Weapon {
    String name;
    int damage;
    String rarity;

    public void WeaponName() {
        System.out.println("weapon name:" + name);
}
    public void Weapondamage() {
    System.out.println("damage:" + damage);
}
    public void Weaponrarity() {
    System.out.println("rarity:" + rarity);
    }
    public void AddDamage(int additionaldamage) {
        int NewDamage = damage + additionaldamage;

        System.out.println("Damage increased from " + damage + " to " + NewDamage);

        this.damage = NewDamage;
    }   
    public String showNameandRarity(){
        return this.name + " " + this.rarity;
    }
}
