/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author sadit
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterHistory;
    private int count=0;
    private Encounter currentEncounter;
    
    EncounterHistory(){
        encounterHistory = new ArrayList<>();
        currentEncounter = new Encounter();
    }
 
    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }
    
    public Encounter getCurrentEncounter() {
        return currentEncounter;
    }

    public void setCurrentEncounter(Encounter currentEncounter) {
        this.currentEncounter = currentEncounter;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public int getCount() {
        return count;
    }
    
    public Encounter addToEncounterHistory(){
        currentEncounter = new Encounter();
        count++;
        encounterHistory.add(currentEncounter);
        return currentEncounter;
    }
    
    
}
