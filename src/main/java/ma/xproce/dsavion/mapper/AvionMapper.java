package ma.xproce.dsavion.mapper;

import lombok.AllArgsConstructor;
import ma.xproce.dsavion.dao.entities.Avion;
import ma.xproce.dsavion.dto.AvionDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AvionMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public AvionDTO fromAvionToAvionDTO(Avion avion) {
        return modelMapper.map(avion, AvionDTO.class);
    }

    public Avion fromAvionDTOToAvion(AvionDTO avionDTO) {
        return modelMapper.map(avionDTO, Avion.class);
    }

}
