package ma.xproce.dsavion.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id_Avion;
    private String model;
    private String color;
    private String matricul;
    private Float price;
}
