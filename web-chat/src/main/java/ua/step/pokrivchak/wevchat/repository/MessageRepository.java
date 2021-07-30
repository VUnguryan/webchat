package ua.step.pokrivchak.wevchat.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ua.step.pokrivchak.wevchat.model.Message;

@RepositoryRestResource(collectionResourceRel = "mesage", path="messages")
public interface MessageRepository extends JpaRepository<Message, Long> {
	Collection<Message> findAllByUserLogin(@Param("login") String login); 
}