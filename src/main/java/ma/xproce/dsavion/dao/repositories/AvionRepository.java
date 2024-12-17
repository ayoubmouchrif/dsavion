package ma.xproce.dsavion.dao.repositories;

import ma.xproce.dsavion.dao.entities.Avion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvionRepository extends JpaRepository<Avion, String> {
    List<Avion> findByModel(String model);

    List<Avion> findByModelAndPrice(String model, Float price);

    List<Avion> findByMatricul(String matricul);

    boolean deleteByMatricul(String matricul);
}
