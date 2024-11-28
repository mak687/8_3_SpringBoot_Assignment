package mak.arshad.DBWork;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("player")
public class Cricketcontroller {
    
    private CricketRepo repo;

    public Cricketcontroller(){
        repo = new CricketRepo();
    }

    @PostMapping("/add") 
    public String addPlayer(@RequestBody Circketer cricketer){
        repo.save(cricketer);
        return cricketer.getName() + " Saved Successfulyy.";
    }

    @GetMapping("/")
    public Collection<Circketer> viewAll(){
        return repo.viewAll();
    }

    @DeleteMapping("/delete")
   public String deletePlayer(@RequestBody Circketer cricketer) {
  
        if (cricketer != null) {
            repo.delete(cricketer);
            return  " Deleted Successfulyy.";
        }
        return null; 
    }

}
