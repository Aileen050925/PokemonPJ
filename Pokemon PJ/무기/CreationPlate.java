//아르세우스 창조의 판

package WeaponP;
import CharacterP.Character;
import CharacterP.Weapon;

public class CreationPlate extends Weapon {
    public CreationPlate() {
        super("창조의 판", 45);
    }

    @Override
        public void applyEffect(Character attacker, Character target) {
            System.out.println("창조의 판을 발동한다! 아르세우스의 신성한 힘이 깨어난다...!");
            //공격 데미지가 2배로 바뀌는 것 구현 예정
        }

}