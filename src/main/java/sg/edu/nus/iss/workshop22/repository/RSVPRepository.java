package sg.edu.nus.iss.workshop22.repository;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.workshop22.model.RSVP;

@Repository
public class RSVPRepository implements RSVPQueries{

    @Autowired
    private JdbcTemplate template;


    public int count(){
        int rs = template.queryForObject(COUNT_RSVP, 
                                Integer.class);
        return rs;
    }

    public List<RSVP> findAll(){
        List<RSVP> result =new LinkedList<RSVP>();
        result = template.query(ALL_RSVP, 
                BeanPropertyRowMapper.newInstance(RSVP.class));
        return result;
    }

    public Boolean saveRSVP(RSVP rsvp){
        int insertResult  = 0;
        insertResult = template.update(INSERT_RSVP, rsvp.getFullName(), 
                            rsvp.getEmail(), rsvp.getPhone(), 
                            rsvp.getConfirmationDate(),
                            rsvp.getComment() );
        return insertResult> 0? true: false;
    }

    public Boolean updateRSVP(RSVP rsvp){
        int insertResult  = 0;
        insertResult = template.update(UPDATE_RSVP, 
                            rsvp.getPhone(), 
                            rsvp.getConfirmationDate(),
                            rsvp.getComment(),
                            rsvp.getEmail() );
        return insertResult> 0? true: false;
    }
}
