package demo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity()
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String GameName;
	private int NumberOfPlayers;
	/*
	 * private int Age; private String Description; private String Rules; private
	 * String DemoVideo; private int EstTime; private String Help; private String
	 * FitnessLevel; private String Dificulty;
	 */

}
