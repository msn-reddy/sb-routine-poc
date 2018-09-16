package narayan.sbroutine.jpacrud.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import narayan.sbroutine.jpacrud.app.entity.Alpha;

@Repository
public interface AlphaRepo extends JpaRepository<Alpha, Long> {

}
