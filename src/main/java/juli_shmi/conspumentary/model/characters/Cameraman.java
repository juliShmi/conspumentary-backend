package juli_shmi.conspumentary.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import juli_shmi.conspumentary.model.AbstractCharacter;
import juli_shmi.conspumentary.model.Attributes;
import juli_shmi.conspumentary.model.CharacterInfo;
import juli_shmi.conspumentary.model.Damage;

public class Cameraman extends AbstractCharacter {

    public Cameraman(@JsonProperty("characterInfo") CharacterInfo characterInfo,
                     @JsonProperty("attributes") Attributes attributes,
                     @JsonProperty("damage") Damage damage) {
        super(characterInfo, attributes, damage);
        attributes.setSmartAss(attributes.getSmartAss() + 2);
    }


    @Override
    public int useFirstAbility(boolean isCharged) {
        return 0;
    }

    @Override
    public void useSecondAbility(boolean isCharged) {

    }

    @Override
    public String toString() {
        return "Cameraman{" +
                "uuid=" + uuid +
                ", characterInfo=" + characterInfo +
                ", attributes=" + attributes +
                ", damage=" + damage +
                '}';
    }
}
