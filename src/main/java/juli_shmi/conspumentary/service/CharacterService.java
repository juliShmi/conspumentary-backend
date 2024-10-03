package juli_shmi.conspumentary.service;

import juli_shmi.conspumentary.dto.AbstractCharacterDto;
import juli_shmi.conspumentary.dto.CharacterInfoDto;
import juli_shmi.conspumentary.model.AbstractCharacter;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {

   // private AbstractCharacter character;

    public void create(AbstractCharacter character) {
        System.out.println(character);
    }

    public AbstractCharacter updateCharacter(String uuid, AbstractCharacterDto abstractCharacterDto, AbstractCharacter abstractCharacter) {
       // AbstractCharacter character; // = characterRepository.findById(uuid);
        if (abstractCharacter != null) {

            if (abstractCharacterDto.getCharacterInfo() != null) {
                abstractCharacter.updateCharacterInfo(abstractCharacterDto.getCharacterInfo());
            } else if (abstractCharacterDto.getDamage() != null) {
                abstractCharacter.updateDamage(abstractCharacterDto.getDamage());
            }

            System.out.println(abstractCharacter);
        }
        return abstractCharacter;

    }

}
