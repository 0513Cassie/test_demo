package iit_lec08;
import java.util.Timer;
import java.util.TimerTask;


public class GetScores {
    public static void main(String args[])
    {
        ScoreGetter scoreGetter = new ScoreGetter();   // 被依赖对象
        ScoreObserver observer1 = new ScoreObserver(scoreGetter);  
        ScoreObserver observer2 = new ScoreObserver(scoreGetter);

        scoreGetter.setCubsScore(2);
        scoreGetter.setWhitesoxScore(1);
        scoreGetter.setYankeesScore(0);
        scoreGetter.setMetsScore(4);

        // cubs 2:1 whitesox
        // yankees 0:4 mets

//        scoreGetter.unregister(observer1);
//
//        scoreGetter.setCubsScore(10);
        
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Simulate changing scores
            	System.out.println("===============================================");
                scoreGetter.setCubsScore(scoreGetter.getCubsScore() + 1);
                scoreGetter.setWhitesoxScore(scoreGetter.getWhitesoxScore() + 1);
                scoreGetter.setYankeesScore(scoreGetter.getYankeesScore() + 1);
                scoreGetter.setMetsScore(scoreGetter.getMetsScore() + 1);
                System.out.println("===============================================");
            }
        }, 0, 2000); // Update every 2 seconds
        
    }
}
