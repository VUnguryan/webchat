package ua.step.pokrivchak.wevchat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ua.step.pokrivchak.wevchat.model.User;

@RepositoryRestResource(collectionResourceRel = "user", path="users")
public interface UserRepository extends JpaRepository<User, Long> {

}