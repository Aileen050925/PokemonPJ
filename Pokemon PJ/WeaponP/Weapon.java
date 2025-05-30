package WeaponP;

import CharacterP.Character;

public abstract class Weapon {
    private String name;
    private int power;

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {return name;}

    public int getPower() {return power;}
    
    public abstract void weaponAttack(Character attacker, Character target); //공격 메서드

}


