package mak.arshad.DBWork;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

public class CricketRepo implements Icricket<Circketer>{

    private Map<Integer,Circketer> players;

    public CricketRepo(){
        players = new HashMap<>();
    }

    @Override
    public void save(Circketer t) {
        players.put((t.getId()), t);
    }

    @Override
    public Collection<Circketer> viewAll() {
        return players.values();
    }

    @Override
    public void delete(Circketer t) {
        players.remove((t.getId()));  
    }
   
}
