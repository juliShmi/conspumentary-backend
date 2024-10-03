package juli_shmi.conspumentary.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AbstractCharacterDto {

    private CharacterInfoDto characterInfo;
    private DamageDto damage;

    public CharacterInfoDto getCharacterInfo() {
        return characterInfo;
    }

    public void setCharacterInfo(CharacterInfoDto characterInfo) {
        this.characterInfo = characterInfo;
    }

    public DamageDto getDamage() {
        return damage;
    }

    public void setDamage(DamageDto damage) {
        this.damage = damage;
    }
}
