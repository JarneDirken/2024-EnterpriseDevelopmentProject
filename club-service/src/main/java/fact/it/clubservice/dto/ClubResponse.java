package fact.it.clubservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClubResponse {
    private Long id;
    private String name;
    private String country;
    private LocalDate establishDate;
    private List<PlayerDto> playerDtoList;
}
