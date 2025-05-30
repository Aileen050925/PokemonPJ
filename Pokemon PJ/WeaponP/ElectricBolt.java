//피카츄 전기볼트

package WeaponP;
import CharacterP.Character;

public class ElectricBolt extends Weapon {
    public ElectricBolt() {
        super("전기볼트", 10);
    }

    @Override
    public void weaponAttack(Character attacker, Character target) {
        System.out.println("상대에게 강한 전기를 날린다!");
        target.receiveDamage(this.getPower()+attacker.getPower());
    }

}
