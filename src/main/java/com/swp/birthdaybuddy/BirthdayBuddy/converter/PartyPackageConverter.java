package com.swp.birthdaybuddy.BirthdayBuddy.converter;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.PartyPackageDTO;
import com.swp.birthdaybuddy.BirthdayBuddy.model.PartyPackage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PartyPackageConverter {

    private final ModelMapper modelMapper;

    @Autowired
    public PartyPackageConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public PartyPackageDTO convertToDTO(PartyPackage partyPackage) {
        return modelMapper.map(partyPackage, PartyPackageDTO.class);
    }

    public PartyPackage convertToEntity(PartyPackageDTO partyPackageDTO) {
        return modelMapper.map(partyPackageDTO, PartyPackage.class);
    }
}
