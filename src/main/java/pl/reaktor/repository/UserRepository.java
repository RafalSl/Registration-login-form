package pl.reaktor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.reaktor.model.NewMember;

@Repository
public interface UserRepository extends JpaRepository<NewMember, Long> {
	
}
