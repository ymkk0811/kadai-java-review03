package baseball;

public class BaseBallTeam {
    //フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;

    //コンストラクタ
    public BaseBallTeam() {
        System.out.println("引数なしコンストラクタ");
    }

    //引数ありコンストラクタ
    public BaseBallTeam(String name,int win,int lose,int draw){
        //System.out.println("引数ありコンストラクタ");
        this.name=name;
        this.win=win;
        this.lose=lose;
        this.draw=draw;
    }

    //ゲッター・セッター
    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win=win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose=lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw=draw;
    }*/

    //勝率取得メソッド
    public double getRate() {
        double rate=(double)win/(double)(win+lose);
        return rate;
    }
    
    //レポートメソッド
    public void report(){
        double rate=getRate();
        System.out.println(name+"　の2022年の成績は　"+win+"勝 "+lose+"敗 "+draw+"分、　勝率は　"+rate+"です。");
    }
}


