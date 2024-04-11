package sg.edu.nus.iss.workshop22.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.workshop22.model.RSVP;
import sg.edu.nus.iss.workshop22.repository.RSVPRepository;

@Service
public class RSVPService {
    @Autowired
    private RSVPRepository repo;

    public int count(){
        return repo.count();
    } 

    public List<RSVP> findAll(){
        return repo.findAll();
    }  
    
    public Boolean saveRSVP(RSVP rsvp){
        return repo.saveRSVP(rsvp);
    }

    public Boolean updateRSVP(RSVP rsvp){
        return repo.updateRSVP(rsvp);
    }

}
