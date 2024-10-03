package juli_shmi.conspumentary.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import juli_shmi.conspumentary.dto.CharacterInfoDto;
import juli_shmi.conspumentary.dto.DamageDto;
import juli_shmi.conspumentary.model.characters.Cameraman;
import juli_shmi.conspumentary.model.characters.Reporter;

import java.util.UUID;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Reporter.class, name = "Reporter"),
        @JsonSubTypes.Type(value = Cameraman.class, name = "Cameraman")
})
public abstract class AbstractCharacter implements AbilitiesUsable {

    protected UUID uuid;
    protected CharacterInfo characterInfo;
    protected Attributes attributes;
    protected Damage damage;

    public AbstractCharacter(CharacterInfo characterInfo, Attributes attributes, Damage damage) {
        this.uuid = UUID.randomUUID();
        this.characterInfo = characterInfo;
        this.attributes = attributes;
        this.damage = damage;
    }

    public CharacterInfo getBiography() {
        return characterInfo;
    }

    public void setBiography(CharacterInfo characterInfo) {
        this.characterInfo = characterInfo;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void updateCharacterInfo(CharacterInfoDto characterInfoDto) {
        if (characterInfoDto.getName() != null) {
            characterInfo.setName(characterInfoDto.getName());
        }
        if (characterInfoDto.getBackground() != null) {
            characterInfo.setBackground(characterInfoDto.getBackground());
        }
        if (characterInfoDto.getPersonality() != null) {
            characterInfo.setPersonality(characterInfoDto.getPersonality());
        }
    }

    public void updateDamage(DamageDto damageDto) {
        if (damageDto.getInjuries() != null) {
            damage.setInjuries(damageDto.getInjuries());
        }
        if (damageDto.getPsychoses() != null) {
            damage.setPsychoses(damageDto.getPsychoses());
        }
    }

    @Override
    public String toString() {
        return "AbstractCharacter{" +
                "uuid=" + uuid +
                ", characterInfo=" + characterInfo +
                ", attributes=" + attributes +
                ", damage=" + damage +
                '}';
    }
}
