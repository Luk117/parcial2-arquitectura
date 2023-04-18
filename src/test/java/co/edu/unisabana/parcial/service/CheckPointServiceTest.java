package co.edu.unisabana.parcial.service;

import co.edu.unisabana.parcial.controller.dto.CheckpointDTO;
import co.edu.unisabana.parcial.service.model.Checkin;
import co.edu.unisabana.parcial.service.port.CheckpointPort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CheckPointServiceTest {

    @InjectMocks
    private CheckpointService checkpointService;

    @Mock
    private CheckpointPort checkpointPort;

    @Test
    void Given_checkPoint_When_dayOfMonthMinor30_Then_throwIllegalArgument() {
        CheckpointDTO checkpoint = new CheckpointDTO("aaa", "bbb", 31);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            checkpointService.checkin(checkpoint);
        });
    }


}
