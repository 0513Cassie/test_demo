package iit_lec08;

public interface Observer{
    
    // Cubs, WhiteSox, Yankees, Mets scores
    public void update(int cubsScore, int whitesoxScore, int yankeesScore, int metsScore);
}