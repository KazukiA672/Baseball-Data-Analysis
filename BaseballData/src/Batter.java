/*
 * Class representing a batter
 */
public class Batter {
    //INSTANCE VARIABLES
    private int hits;
    private int hrs;
    private int rbi;
    private int walks;
    private int strikeouts;
    private double avg;
    private double obp;
    private double slg;
    private double ops;

    private double woba;
    private double barrelP;
    private double hardhitP;
    private double exitVelo;
    private double launchAngle;
    private double xba;
    private double xslg;
    private double xwoba;

    //MVP Parameterized Constructor
    public Batter(int hits, int hrs, int rbi, int walks, int strikeouts, double avg, double obp, double slg){
        this.hits = hits;
        this.hrs = hrs;
        this.rbi = rbi;
        this.walks = walks;
        this.strikeouts = strikeouts;
        this.avg = avg;
        this.obp = obp;
        this.slg = slg;
        ops = obp + slg;

        woba = 0;
        barrelP = 0;
        hardhitP = 0;
        exitVelo = 0;
        launchAngle = 0;
        xba = 0;
        xslg = 0;
        xwoba = 0;
    }
    //Expanded Parameterized Constructor
    public Batter(int hits, int hrs, int rbi, int walks, int strikeouts, double avg, double obp, double slg, double ops,
                       double woba, double barrelP, double hardhitP, double exitVelo, double launchAngle, double xba, double xslg, double xwoba) {
        this.hits = hits;
        this.hrs = hrs;
        this.rbi = rbi;
        this.walks = walks;
        this.strikeouts = strikeouts;
        this.avg = avg;
        this.obp = obp;
        this.slg = slg;
        this.ops = ops;
        this.woba = woba;
        this.barrelP = barrelP;
        this.hardhitP = hardhitP;
        this.exitVelo = exitVelo;
        this.launchAngle = launchAngle;
        this.xba = xba;
        this.xslg = xslg;
        this.xwoba = xwoba;
    }
    //Default Constructor
    public Batter(){
        this.hits = 0;
        this.hrs = 0;
        this.rbi = 0;
        this.walks = 0;
        this.strikeouts = 0;
        this.avg = 0.0;
        this.obp = 0.0;
        this.slg = 0.0;
        this.ops = 0.0;
        this.woba = 0.0;
        this.barrelP = 0.0;
        this.hardhitP = 0.0;
        this.exitVelo = 0.0;
        this.launchAngle = 0.0;
        this.xba = 0.0;
        this.xslg = 0.0;
        this.xwoba = 0.0;
    }

    //GETTERS & SETTERS
    public int getHits() {
        return hits;
    }
    public void setHits(int hits) {
        this.hits = hits;
    }
    public int getHrs() {
        return hrs;
    }
    public void setHrs(int hrs) {
        this.hrs = hrs;
    }
    public int getRbi() {
        return rbi;
    }
    public void setRbi(int rbi) {
        this.rbi = rbi;
    }
    public int getWalks() {
        return walks;
    }
    public void setWalks(int walks) {
        this.walks = walks;
    }
    public int getStrikeouts() {
        return strikeouts;
    }
    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }
    public double getAvg() {
        return avg;
    }
    public void setAvg(double avg) {
        this.avg = avg;
    }
    public double getObp() {
        return obp;
    }
    public void setObp(double obp) {
        this.obp = obp;
    }
    public double getSlg() {
        return slg;
    }
    public void setSlg(double slg) {
        this.slg = slg;
    }
    public double getOps() {
        return ops;
    }
    public void setOps(double ops) {
        this.ops = ops;
    }
    public double getWoba() {
        return woba;
    }
    public void setWoba(double woba) {
        this.woba = woba;
    }
    public double getBarrelP() {
        return barrelP;
    }
    public void setBarrelP(double barrelP) {
        this.barrelP = barrelP;
    }
    public double getHardhitP() {
        return hardhitP;
    }
    public void setHardhitP(double hardhitP) {
        this.hardhitP = hardhitP;
    }
    public double getExitVelo() {
        return exitVelo;
    }
    public void setExitVelo(double exitVelo) {
        this.exitVelo = exitVelo;
    }
    public double getLaunchAngle() {
        return launchAngle;
    }
    public void setLaunchAngle(double launchAngle) {
        this.launchAngle = launchAngle;
    }
    public double getXba() {
        return xba;
    }
    public void setXba(double xba) {
        this.xba = xba;
    }
    public double getXslg() {
        return xslg;
    }
    public void setXslg(double xslg) {
        this.xslg = xslg;
    }
    public double getXwoba() {
        return xwoba;
    }
    public void setXwoba(double xwoba) {
        this.xwoba = xwoba;
    }
}
