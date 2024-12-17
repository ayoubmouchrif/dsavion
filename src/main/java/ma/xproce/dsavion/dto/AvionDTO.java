package ma.xproce.dsavion.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvionDTO {
    private String model;
    private String color;
    private String matricul;
    private Float price;
}
