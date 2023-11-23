package th.mfu;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Profile;

public interface SeatRepository extends CrudRepository<Profile, Long>{
    public List<Profile> findByConcertId(Long concertId);
    public List<Profile> deleteByConcertId(long id);
    public List<Profile> findByBookedFalseAndConcertId(Long concertId);
    public List<Profile> findByBookedTrueAndConcertId(Long concertId);
    public List<Profile> findByBookedTrue();

    
}