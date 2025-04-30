package estudos.spring_jpa_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import estudos.spring_jpa_data.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
