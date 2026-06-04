// Importing java.util and javax.swing
import java.util.*;
import javax.swing.*;

/*
 * Class representing an analyzer for the hitting stats of baseball teams
 */
public class TeamHittingAnalyzer {
    private ArrayList<TeamHitting> teams;

    public TeamHittingAnalyzer(ArrayList<TeamHitting> teams) {
        this.teams = teams;
    }

    // Method returning and displaying team with maximum value in each stat category
    public String getMaxTeam(String category){
        // Team with the most hits
        if (category.equalsIgnoreCase("hits")) {
            int maxHits = teams.get(0).getHits();
            int maxIndex = 0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getHits() > maxHits){
                    maxHits = teams.get(i).getHits();
                    maxIndex = i;
                }
            }

            String teamName = teams.get(maxIndex).getName();
            showTeamWindow(teamName, "hits","max");
            return teamName;
        }
        // Team with the most hrs
        else if(category.equalsIgnoreCase("hr") || category.equalsIgnoreCase("hrs") ||
        category.equalsIgnoreCase("home runs") || category.equalsIgnoreCase("homeruns") ||
        category.equalsIgnoreCase("homerun") || category.equalsIgnoreCase("home run")){
            int maxHrs = teams.get(0).getHrs();
            int maxIndex =0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getHrs() > maxHrs){
                    maxHrs = teams.get(i).getHrs();
                    maxIndex = i;
                }
            }

            String teamName = teams.get(maxIndex).getName();
            showTeamWindow(teamName, "home runs", "max");;
            return teamName;
        }
        // Team with the most walks
        else if(category.equalsIgnoreCase("walks") || category.equalsIgnoreCase("bb") ||
        category.equalsIgnoreCase("bbs")){
            int maxWalks = teams.get(0).getWalks();
            int maxIndex =0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getWalks() > maxWalks){
                    maxWalks = teams.get(i).getWalks();
                    maxIndex = i;
                }

            }
            String teamName = teams.get(maxIndex).getName();
            showTeamWindow(teamName, "walks", "max");
            return teamName;
        }
        // Team with max strikeouts
        else if(category.equalsIgnoreCase("strikeouts") || category.equals("SO")){
            int maxStrikes = teams.get(0).getStrikeouts();
            int maxIndex =0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getStrikeouts() > maxStrikes){
                    maxStrikes = teams.get(i).getStrikeouts();
                    maxIndex = i;
                }

            }
            String teamName = teams.get(maxIndex).getName();
            showTeamWindow(teamName, "strikeouts", "max");
            return teamName;
        }
        // Team with max avg
        else if(category.equalsIgnoreCase("avg") || category.equalsIgnoreCase("batting average")
            || category.equalsIgnoreCase("ba")){
            double maxAvg = teams.get(0).getAvg();
            int maxIndex =0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getAvg() > maxAvg){
                    maxAvg = teams.get(i).getAvg();
                    maxIndex = i;
                }

            }
            String teamName = teams.get(maxIndex).getName();
            showTeamWindow(teamName, "batting average" ,"max");
            return teamName;
        }
        // Team with max obp
        else if(category.equalsIgnoreCase("obp") || category.equalsIgnoreCase("on base percentage")
        || category.equalsIgnoreCase("on-base percentage")){
            double  maxObp = teams.get(0).getObp();
            int maxIndex =0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getObp() > maxObp){
                    maxObp = teams.get(i).getObp();
                    maxIndex = i;
                }

            }
            String teamName = teams.get(maxIndex).getName();
            showTeamWindow(teamName, "on base percentage", "max");
            return teamName;
        }
        // Team with max slg
        else if(category.equalsIgnoreCase("slg") || category.equalsIgnoreCase("slugging percentage")){
            double  maxSlg = teams.get(0).getSlg();
            int maxIndex =0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getSlg() > maxSlg){
                    maxSlg = teams.get(i).getSlg();
                    maxIndex = i;
                }

            }
            String teamName = teams.get(maxIndex).getName();
            showTeamWindow(teamName, "slugging percentage", "max");
            return teamName;
        }
        // Team with max ops
        else if(category.equalsIgnoreCase("ops") || category.equalsIgnoreCase("on base plus slugging")
        || category.equalsIgnoreCase("on-base plus slugging")){
            double  maxOps = teams.get(0).getOps();
            int maxIndex =0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getOps() > maxOps){
                    maxOps = teams.get(i).getOps();
                    maxIndex = i;
                }
            }
            String teamName = teams.get(maxIndex).getName();
            showTeamWindow(teamName, "on-base plus slugging", "max");
            return teamName;
        }
        // If param category doesn't match any stat category
        else{
            return "Invalid category entered";
        }
    }

    // Method returning and displaying team with the minimum value in each stat category
    public String getMinTeam(String category){
        // Team with the fewest hits
        if (category.equalsIgnoreCase("hits")) {
            int minHits = teams.get(0).getHits();
            int minIndex = 0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getHits() < minHits){
                    minHits = teams.get(i).getHits();
                    minIndex = i;
                }
            }

            String teamName = teams.get(minIndex).getName();
            showTeamWindow(teamName, "hits","min");
            return teamName;
        }
        // Team with the fewest hrs
        else if(category.equalsIgnoreCase("hr") || category.equalsIgnoreCase("hrs") ||
                category.equalsIgnoreCase("home runs") || category.equalsIgnoreCase("homeruns") ||
                category.equalsIgnoreCase("homerun") || category.equalsIgnoreCase("home run")){
            int minHrs = teams.get(0).getHrs();
            int minIndex =0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getHrs() < minHrs){
                    minHrs = teams.get(i).getHrs();
                    minIndex = i;
                }
            }

            String teamName = teams.get(minIndex).getName();
            showTeamWindow(teamName, "home runs", "min");;
            return teamName;
        }
        // Team with the fewest walks
        else if(category.equalsIgnoreCase("walks") || category.equalsIgnoreCase("bb") ||
                category.equalsIgnoreCase("bbs")){
            int minWalks = teams.get(0).getWalks();
            int minIndex =0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getWalks() < minWalks){
                    minWalks = teams.get(i).getWalks();
                    minIndex = i;
                }

            }
            String teamName = teams.get(minIndex).getName();
            showTeamWindow(teamName, "walks", "min");
            return teamName;
        }
        // Team with the fewest strikeouts
        else if(category.equalsIgnoreCase("strikeouts") || category.equals("SO")){
            int minStrikes = teams.get(0).getStrikeouts();
            int minIndex =0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getStrikeouts() < minStrikes){
                    minStrikes = teams.get(i).getStrikeouts();
                    minIndex = i;
                }

            }
            String teamName = teams.get(minIndex).getName();
            showTeamWindow(teamName, "strikeouts", "min");
            return teamName;
        }
        // Team with the minimum avg
        else if(category.equalsIgnoreCase("avg") || category.equalsIgnoreCase("batting average")
                || category.equalsIgnoreCase("ba")){
            double minAvg = teams.get(0).getAvg();
            int minIndex =0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getAvg() < minAvg){
                    minAvg = teams.get(i).getAvg();
                    minIndex = i;
                }

            }
            String teamName = teams.get(minIndex).getName();
            showTeamWindow(teamName, "batting average" ,"min");
            return teamName;
        }
        // Team with the minimum obp
        else if(category.equalsIgnoreCase("obp") || category.equalsIgnoreCase("on base percentage")
                || category.equalsIgnoreCase("on-base percentage")){
            double  minObp = teams.get(0).getObp();
            int minIndex =0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getObp() < minObp){
                    minObp = teams.get(i).getObp();
                    minIndex = i;
                }

            }
            String teamName = teams.get(minIndex).getName();
            showTeamWindow(teamName, "on base percentage", "min");
            return teamName;
        }
        // Team with the minimum slg
        else if(category.equalsIgnoreCase("slg") || category.equalsIgnoreCase("slugging percentage")){
            double  minSlg = teams.get(0).getSlg();
            int minIndex =0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getSlg() < minSlg){
                    minSlg = teams.get(i).getSlg();
                    minIndex = i;
                }

            }
            String teamName = teams.get(minIndex).getName();
            showTeamWindow(teamName, "slugging percentage", "min");
            return teamName;
        }
        // Team with the minimum ops
        else if(category.equalsIgnoreCase("ops") || category.equalsIgnoreCase("on base plus slugging")
                || category.equalsIgnoreCase("on-base plus slugging")){
            double  minOps = teams.get(0).getOps();
            int minIndex =0;
            for(int i = 0; i < teams.size(); i++){
                if (teams.get(i).getOps() < minOps){
                    minOps = teams.get(i).getOps();
                    minIndex = i;
                }
            }
            String teamName = teams.get(minIndex).getName();
            showTeamWindow(teamName, "on-base plus slugging", "min");
            return teamName;
        }
        // If param category doesn't match any stat category
        else{
            return "Invalid category entered";
        }
    }


    // Helper method to display team with highest/minimum value with JFrame
    public void showTeamWindow(String name, String category, String type){
        JFrame frame = new JFrame("Team Leader");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        ImageIcon logo = new ImageIcon("images/" + name + ".png");

        if (type.equals("max")) {
            JLabel label = new JLabel(
                    "The " + name + " lead the league in " + category,
                    logo, JLabel.CENTER
            );

            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.BOTTOM);

            frame.add(label);
        }
        else {  //Assuming it is for minimum value if it is not maximum, as those are the two functions available as of now.
            JLabel label = new JLabel(
                   "The " + name + " are last in the league in " + category,
                   logo, JLabel.CENTER
            );
            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.BOTTOM);

            frame.add(label);
        }
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


}
