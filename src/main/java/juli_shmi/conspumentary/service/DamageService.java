package juli_shmi.conspumentary.service;


import juli_shmi.conspumentary.model.Damage;
import org.springframework.stereotype.Service;

@Service
public class DamageService {

    private Damage damage;

    public DamageService(Damage damage) {
        this.damage = damage;
    }

    public void addInjury() {
        if (damage.getInjuries() < 5) {
            damage.setInjuries(damage.getInjuries() + 1);
            System.out.println("Added an injury. Total injuries: " + damage.getInjuries());
        } else {
            System.out.println("You are dead!");
        }
    }

    public void removeInjury() {
        if (damage.getInjuries() > 0) {
            damage.setInjuries(damage.getInjuries() - 1);
            System.out.println("Removed an injury. Total injuries: " + damage.getInjuries());
        }
    }

    public void addPsychose() {
        if (damage.getPsychoses() < 5) {
            damage.setPsychoses(damage.getPsychoses() + 1);
            System.out.println("Added a psychosis. Total psychoses: " + damage.getPsychoses());
        } else {
            System.out.println("You are mad!");
        }
    }

    public void removePsychose() {
        if (damage.getPsychoses() > 0) {
            damage.setPsychoses(damage.getPsychoses() - 1);
            System.out.println("Removed a psychosis. Total psychoses: " + damage.getPsychoses());
        }
    }

    public boolean isDead() {
        return damage.getInjuries() >= 5;
    }

    public boolean isMad() {
        return damage.getPsychoses() >= 5;
    }

    @Override
    public String toString() {
        return damage.toString();
    }
}
