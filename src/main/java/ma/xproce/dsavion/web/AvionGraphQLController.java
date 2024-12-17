package ma.xproce.dsavion.web;

import lombok.AllArgsConstructor;
import ma.xproce.dsavion.dto.AvionDTO;
import ma.xproce.dsavion.service.AvionService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class AvionGraphQLController {
    private AvionService avionService ;

    @MutationMapping
    public AvionDTO saveAvion(@Argument AvionDTO avion){
        return avionService.saveAvion(avion);
    }

    @MutationMapping
    public boolean deleteAvion(@Argument String matricul){
        return avionService.deleteAvion(matricul);
    }


    @QueryMapping
    public List<AvionDTO> getAvionByModel(@Argument String model){
        return avionService.getAvionByModel(model);
    }

    @QueryMapping
    public List<AvionDTO> getAvionByModelAndPrice(@Argument String model, @Argument Float price){
        return avionService.getAvionByModelAndPrice(model,price);
    }

}
