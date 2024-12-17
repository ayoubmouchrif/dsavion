package ma.xproce.dsavion;

import ma.xproce.dsavion.dto.AvionDTO;
import ma.xproce.dsavion.service.AvionService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DsavionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsavionApplication.class, args);
    }
    @Bean
    CommandLineRunner start(AvionService avionService){
        return  args -> {
            List<AvionDTO> avionsDTO = List.of(
                    AvionDTO.builder().model("model1").color("red").matricul("sdf64w6e").price(12345f).build(),
                    AvionDTO.builder().model("model2").matricul("ef6e+6").color("green").price(65489f).build(),
                    AvionDTO.builder().model("model3").matricul("ef64we8").color("yellow").price(89789f).build(),
                    AvionDTO.builder().model("model4").matricul("wrdqwqw").color("black").price(67489f).build()
            );
            for(AvionDTO avionDTO : avionsDTO){
                avionService.saveAvion(avionDTO);
            }
        };
    }

}
