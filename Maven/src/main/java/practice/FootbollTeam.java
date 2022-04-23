package practice;

import java.util.*;

public class FootbollTeam extends Team<FootballPlayer> {


    private static Map<String, Collection<FootballPlayer>> mapOfFootballTeams = new HashMap<>();


    public FootbollTeam(int bud, String teamName, String headCoachName) {
        super(bud, teamName, headCoachName);
        // когда команда создается мы берем из Map
        if(getPlayers() != null && getPlayers().size() > 0){
            mapOfFootballTeams.put(teamName, getPlayers());
        }
    }

    @Override
    public FootballPlayer buyPlayer(FootballPlayer newPlayer) {
        //уменьшаем бюджет
        reduseBud(newPlayer.getExp() * newPlayer.getRate() * newPlayer.getTalent());
        // ++Players
       if( addPlayer(newPlayer)){
           return newPlayer;
       }
        return null;
    }

    @Override
    public FootballPlayer sellPlayer(FootballPlayer delPlayer) {
        // увеличение бюджета
        reduseBud(delPlayer.getExp() * delPlayer.getRate() * delPlayer.getTalent());
        if(removePlayer(delPlayer)){
            return delPlayer;
        }
        return null;
    }

    public Collection<FootballPlayer> getPlayers(){
        Set<FootballPlayer> fplayers = (HashSet<FootballPlayer>)super.getPlayers();
        if (fplayers != null){
            return Collections.unmodifiableCollection(fplayers);
        }
        return null;
    }

}

