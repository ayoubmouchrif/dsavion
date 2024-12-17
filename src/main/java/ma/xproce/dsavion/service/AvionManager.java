package ma.xproce.dsavion.service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import ma.xproce.dsavion.dao.entities.Avion;
import ma.xproce.dsavion.dao.repositories.AvionRepository;
import ma.xproce.dsavion.dto.AvionDTO;
import ma.xproce.dsavion.mapper.AvionMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AvionManager implements AvionService {
    @Autowired
    private AvionRepository avionRepository;
    @Autowired
    private AvionMapper avionMapper;


    @Override
    public List<AvionDTO> getAvionByModel(String model) {
        List<Avion> avions = avionRepository.findByModel(model);
        List<AvionDTO> avionsDTO = new ArrayList<>();
        for (Avion avion : avions) {
            avionsDTO.add(avionMapper.fromAvionToAvionDTO(avion));
        }
        return avionsDTO;
    }

    @Override
    public List<AvionDTO> getAvionByModelAndPrice(String model, Float price) {
        List<Avion> avions = avionRepository.findByModelAndPrice(model, price);
        List<AvionDTO> avionsDTO = new ArrayList<>();
        for (Avion avion : avions) {
            avionsDTO.add(avionMapper.fromAvionToAvionDTO(avion));
        }
        return avionsDTO;
    }

    @Override
    public AvionDTO saveAvion(AvionDTO avionDTO) {
        Avion avion = avionMapper.fromAvionDTOToAvion(avionDTO);
//        if(avionRepository.findByMatricul(avionDTO.getMatricul()) != null){
//            throw new RuntimeException("Matricul already exists !");
//        }
        Avion avion1 = avionRepository.save(avion);
        return avionMapper.fromAvionToAvionDTO(avion1);
    }

    @Override
    public boolean deleteAvion(String matricul) {
        try{
            avionRepository.deleteByMatricul(matricul);
            return true;
        }catch(Exception exception){
            System.out.println(exception.getMessage());
            return false;
        }
    }
}
