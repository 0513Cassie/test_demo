package iit_lec08;

import java.util.ArrayList;

public class ScoreGetter implements Subject {

    private ArrayList<Observer> observers;

    private int cubsScore;
    private int whitesoxScore;
    private int yankeesScore;
    private int metsScore;

    public ScoreGetter()
    {
        // creates an arraylist of observers
        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver)
    {
        // adding a new observer to the ArrayList
        observers.add(newObserver);
    }

    public void unregister(Observer deleteObserver)
    {
        // deleting the oberver from the arraylist. how?
        // get the index of the observer for deletion....
        int observerIndex = observers.indexOf(deleteObserver);
        observers.remove(observerIndex);
        System.out.println("Observer " + observerIndex + " has been deleted from the list");
    }
    public void notifyObserver()
    {
        // you need to 'update' every single observers that are in arraylist...
        for (Observer observer: observers)
        {
            observer.update(cubsScore, whitesoxScore, yankeesScore, metsScore);
        }
    }

    // missing setters for individual team scores...
    public int getCubsScore() {
        return cubsScore;
    }

    public void setCubsScore(int cubsScore) {
        this.cubsScore = cubsScore;
        notifyObserver();
    }
    
    public int getWhitesoxScore() {
        return whitesoxScore;
    }

    
    public void setWhitesoxScore(int whitesoxScore) {
        this.whitesoxScore = whitesoxScore;
        notifyObserver();
    }
    
    public int getYankeesScore() {
        return yankeesScore;
    }
    
    public void setYankeesScore(int yankeesScore) {
        this.yankeesScore = yankeesScore;
        notifyObserver();
    }
    
    public int getMetsScore() {
        return metsScore;
    }

    public void setMetsScore(int metsScore) {
        this.metsScore = metsScore;
        notifyObserver();
    }



}
