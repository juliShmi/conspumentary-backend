package juli_shmi.conspumentary.controller;

import juli_shmi.conspumentary.dto.AbstractCharacterDto;
import juli_shmi.conspumentary.model.AbstractCharacter;
import juli_shmi.conspumentary.model.Result;
import juli_shmi.conspumentary.service.CharacterService;
import juli_shmi.conspumentary.service.DiceRoller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/characters")
public class GameController {

    private CharacterService characterService;
    private DiceRoller diceRoller;

    private AbstractCharacter abstractCharacterNew;


    public GameController(CharacterService characterService, DiceRoller diceRoller) {
        this.characterService = characterService;
        this.diceRoller = diceRoller;
    }

    @PostMapping("/create")
    public void createCharacter(@RequestBody AbstractCharacter abstractCharacter) {
        abstractCharacterNew = abstractCharacter;
        characterService.create(abstractCharacter);
    }

    @GetMapping("/roll")
    public Result rollDices(
            @RequestParam(name = "abilityType") String abilityType,
            @RequestParam(name = "abilityValue") int abilityValue,
            @RequestParam(name = "damageType") String damageType,
            @RequestParam(name = "damageValue") int damageValue) {
        return diceRoller.roll(abilityType, abilityValue, damageType, damageValue);
    }

    @PatchMapping(value = "/{uuid}", consumes = "application/merge-patch+json")
    public ResponseEntity<AbstractCharacter> updateCharacter(@PathVariable String uuid, @RequestBody AbstractCharacterDto abstractCharacterDto) {
        AbstractCharacter updated = characterService.updateCharacter(uuid, abstractCharacterDto, abstractCharacterNew);
        return ResponseEntity.ok(updated);
    }
}
