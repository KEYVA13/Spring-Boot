package com.ClinicaVeterinaria.consigna2.Service;

import com.ClinicaVeterinaria.consigna2.Dto.Dto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface IDtoService {
    List<Dto> getListado();
}
