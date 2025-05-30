
//아르세우스 창조의 판

package WeaponP;
import java.util.Random;

import CharacterP.Character;

public class CreationPlate extends Weapon {
    public CreationPlate() {
        super("창조의 판", 45);
    }

    @Override
        public void weaponAttack(Character attacker, Character target) {
            Random rand = new Random();
            if (rand.nextInt(100) < 30){
                System.out.println("창조의 판을 발동한다! 아르세우스의 신성한 힘이 깨어난다...!");
                target.receiveDamage(target.getHp()/2);
                attacker.weapons[1]=null; //무기를 삭제해버림 -> main 에서 무기 작동 안할때 예외처리함
            }
            else System.out.println("창조의 판 발동에 실패했다...");
        }

}