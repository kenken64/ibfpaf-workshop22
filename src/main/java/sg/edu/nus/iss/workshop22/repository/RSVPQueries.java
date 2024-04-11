package sg.edu.nus.iss.workshop22.repository;

public interface RSVPQueries {

    public static final String COUNT_RSVP= """
            select count(*) from rsvp;
            """;

    public static final String ALL_RSVP = """
            select * from rsvp
            """;

    public static final String INSERT_RSVP = """
            insert into rsvp (full_name, email, phone, 
            confirmation_date, comment) values (?, ?, ?, ?, ?)
            """;
    
    public static final String UPDATE_RSVP = """
        update rsvp set phone=?, confirmation_date=?, comment=? where email = ?
        """;
}
