package fact.it.transferservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferRequest {
    private int playerNumber;
    private String previousTeamName;
    private String newTeamName;
}
