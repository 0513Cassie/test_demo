package iit_lec08;

public class ScoreObserver implements Observer {

    private int cubsScore;
    private int whitesoxScore;
    private int yankeesScore;
    private int metsScore;

    private static int observerIDCnt = 1;

    private int observerID;

    private Subject scoreGetter;

    public ScoreObserver(Subject scoreGetter)
    {
        this.scoreGetter = scoreGetter;
        this.observerID = observerIDCnt++;
        System.out.println("New Observer " + this.observerID);
        scoreGetter.register(this);
    }
 
    public void update(int cubsScore, int whitesoxScore, int yankeesScore, int metsScore){
        this.cubsScore = cubsScore;
        this.whitesoxScore = whitesoxScore;
        this.yankeesScore = yankeesScore;
        this.metsScore = metsScore;

        System.out.println(observerID + "\nCubs: " + cubsScore + " vs WhiteSox: " + whitesoxScore + "\nYankees: " + yankeesScore + " vs Mets: " + metsScore + "\n");

    }
}
