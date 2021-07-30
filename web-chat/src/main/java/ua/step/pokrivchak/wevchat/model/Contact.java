package ua.step.pokrivchak.wevchat.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Contact {
	private Long id;
	@ManyToOne
	private User owner;
	@OneToMany
	private List<Contact> contacts;
}
