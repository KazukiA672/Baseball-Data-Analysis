import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Instantiating TeamHitting objects for all MLB teams using data from the current season for testing
        TeamHitting sd = new TeamHitting("padres","padres.png", 399, 57, 179, 473, 0.219, 0.292, 0.362);
        TeamHitting tb = new TeamHitting("rays", "rays.png",478, 46, 189, 386, 0.262, 0.335, 0.391);
        TeamHitting mil = new TeamHitting("brewers", "brewers.png", 441, 39, 227, 436, 0.244, 0.331, 0.363);
        TeamHitting az = new TeamHitting("dbacks", "dbacks.png",466, 49, 173, 423, 0.249, 0.315, 0.403);
        TeamHitting sf = new TeamHitting("giants", "giants.png",481, 42, 184, 443, 0.239, 0.318, 0.389);
        TeamHitting bos = new TeamHitting("redsox", "redsox.png",461, 42, 170, 466, 0.245, 0.317, 0.372);
        TeamHitting stl = new TeamHitting("cardinals", "cardinals.png",442, 63, 184, 443, 0.239, 0.318, 0.388);
        TeamHitting kc = new TeamHitting("royals", "royals.png",437, 51, 190, 454, 0.233, 0.292, 0.351);
        TeamHitting nym = new TeamHitting("mets", "mets.png",399,	57,	179,	473,	0.219,	0.292,	0.362);
        TeamHitting phi = new TeamHitting("phillies", "phillies.png",431, 	69,	166,	469,	0.226,	0.294,	0.383);
        TeamHitting tex = new TeamHitting("rangers", "rangers.png",433,	58,	201,	490,	0.231,	0.313,	0.377);
        TeamHitting cin = new TeamHitting("reds", "reds.png",435,	70,	219,	521,	0.231,	0.315,	0.394);
        TeamHitting nyy = new TeamHitting("yankees", "yankees.png",457,	86,	246,	495,	0.243,	0.332,	0.441);
        TeamHitting tor = new TeamHitting("bluejays", "bluejays.png",472,	55,	167,	416,	0.243,	0.309,	0.38);
        TeamHitting mia = new TeamHitting("marlins","marlins.png",472,	46,	189,	469,	0.246,	0.32,	0.379);
        TeamHitting col = new TeamHitting("rockies", "rockies.png",473,	52,	165,	524,	0.242,	0.309,	0.381);
        TeamHitting chw = new TeamHitting("whitesox", "whitesox.png",447,	76,	214,	525,	0.237,	0.325,	0.403);
        TeamHitting det = new TeamHitting("tigers", "tigers.png",443,	50,	221,	498,	0.231,	0.314,	0.368);
        TeamHitting lad = new TeamHitting("dodgers", "dodgers.png",496,	80,	232,	441,	0.261,	0.345,	0.443);
        TeamHitting laa = new TeamHitting("angels", "angels.png",440,	66,	203,	556,	0.229,	0.313,	0.38);
        TeamHitting bal = new TeamHitting("orioles", "orioles.png",460,	67,	218,	523,	0.237,	0.316,	0.394);
        TeamHitting oak = new TeamHitting("athletics", "athletics.png",475,	58,	218,	484,	0.246,	0.327,	0.388);
        TeamHitting sea = new TeamHitting("mariners", "mariners.png",448,	70,	210,	513,	0.233,	0.318,	0.39);
        TeamHitting min = new TeamHitting("twins", "tigers.png",454,	62,	203,	507,	0.234,	0.316,	0.383);
        TeamHitting cle = new TeamHitting("guardians", "guardians.png",444,	56,	239,	438,	0.231,	0.32,	0.372);
        TeamHitting atl = new TeamHitting("braves", "braves.png",520,	78,	177,	462,	0.261,	0.326,	0.433);
        TeamHitting hou = new TeamHitting("astros", "astros.png",484,	77,	198,	472,	0.244,	0.32,	0.41);
        TeamHitting wsh = new TeamHitting("nationals", "nationals.png",491,	74,	212,	488,	0.246,	0.325,	0.42);
        TeamHitting pit = new TeamHitting("pirates", "pirates.png",503,	63,	223,	541,	0.25,	0.332,	0.391);
        TeamHitting chc = new TeamHitting("cubs", "cubs.png",470,	65,	262,	485,	0.239,	0.336,	0.388);

        // Instantiating an ArrayList of the data of MLB teams
        ArrayList<TeamHitting> mlb = new ArrayList<>(List.of(
                sd, tb, mil, az, sf, bos, stl, kc, nym, phi, tex, cin, nyy, tor, mia, col, chw, det, lad, laa, bal, oak,
                sea, min, cle, atl, hou, wsh, pit, chc
        ));

        // Instantiating a TeamHittingAnalyzer object with the ArrayList of teams
        TeamHittingAnalyzer mlbAnalyzer = new TeamHittingAnalyzer(mlb);

        // Testing the getMaxTeam method
        //mlbAnalyzer.getMaxTeam("strikeouts");

        // Testing the getMinTeam method
        //mlbAnalyzer.getMinTeam("ops");

        // Creating a Scanner for users to interact with Analysis system
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Baseball Analysis System for Major League Baseball.");
        System.out.print("Select if you would like to analyze for the team with the maximum or minimum value(Type 'max' or 'min'): ");
        String type = input.next();
        if (type.equalsIgnoreCase("max")){
            mlbAnalyzer.getMaxTeam(callAnalysis());
        }
        else if(type.equalsIgnoreCase("min")){
            mlbAnalyzer.getMinTeam(callAnalysis());
        }
        else{
            System.out.println("Invalid: Response did not match 'max' or 'min'");
        }
        input.close();

    }

    // Method to recieve category to analyze from user for both max and min
    public static String callAnalysis(){
        Scanner input = new Scanner(System.in);
        System.out.println("Here are the categories you can choose to analyze: hits, home runs, walks, strike outs, avg, obp, slg, ops");
        System.out.print("Choose the category you would like to analyze: ");
        String category = input.nextLine();
        return category;
    }
}
