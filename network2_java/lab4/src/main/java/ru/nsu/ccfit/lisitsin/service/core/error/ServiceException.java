package ru.nsu.ccfit.lisitsin.service.core.error;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ServiceException {

    String message;

}
