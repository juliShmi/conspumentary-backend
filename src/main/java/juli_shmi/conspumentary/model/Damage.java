package juli_shmi.conspumentary.model;

import org.springframework.stereotype.Component;

@Component
public class Damage {

    private int injuries;
    private int psychoses;

    public Damage() {
        this.injuries = 0;
        this.psychoses = 0;
    }

    public int getInjuries() {
        return injuries;
    }

    public void setInjuries(int injuries) {
        this.injuries = injuries;
    }

    public int getPsychoses() {
        return psychoses;
    }

    public void setPsychoses(int psychoses) {
        this.psychoses = psychoses;
    }

    @Override
    public String toString() {
        return "Damage{" +
                "injuries=" + injuries +
                ", psychoses=" + psychoses +
                '}';
    }
}



