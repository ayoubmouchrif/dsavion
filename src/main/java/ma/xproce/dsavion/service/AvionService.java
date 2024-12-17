package ma.xproce.dsavion.service;

import ma.xproce.dsavion.dto.AvionDTO;

import java.util.List;

public interface AvionService {
    List<AvionDTO> getAvionByModel(String model);

    List<AvionDTO> getAvionByModelAndPrice(String model, Float price);

    AvionDTO saveAvion(AvionDTO avionDTO);

    boolean deleteAvion(String matricul);
}