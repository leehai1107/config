package com.swp.birthdaybuddy.BirthdayBuddy.service.imp;

import com.swp.birthdaybuddy.BirthdayBuddy.converter.PartyPackageConverter;
import com.swp.birthdaybuddy.BirthdayBuddy.dto.PartyPackageDTO;
import com.swp.birthdaybuddy.BirthdayBuddy.model.PartyPackage;
import com.swp.birthdaybuddy.BirthdayBuddy.repository.PartyPackageRepository;
import com.swp.birthdaybuddy.BirthdayBuddy.service.PartyPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartyPackageServiceImpl implements PartyPackageService {

    private final PartyPackageRepository partyPackageRepository;
    private final PartyPackageConverter partyPackageConverter;

    @Autowired
    public PartyPackageServiceImpl(PartyPackageRepository partyPackageRepository, PartyPackageConverter partyPackageConverter) {
        this.partyPackageRepository = partyPackageRepository;
        this.partyPackageConverter = partyPackageConverter;
    }

    @Override
    public PartyPackageDTO createPartyPackage(PartyPackageDTO partyPackageDTO) {
        PartyPackage partyPackage = partyPackageConverter.convertToEntity(partyPackageDTO);
        PartyPackage savedPartyPackage = partyPackageRepository.save(partyPackage);
        return partyPackageConverter.convertToDTO(savedPartyPackage);
    }

    @Override
    public PartyPackageDTO getPartyPackage(Long id) {
        PartyPackage partyPackage = partyPackageRepository.findById(id).orElse(null);
        return partyPackage != null ? partyPackageConverter.convertToDTO(partyPackage) : null;
    }

    @Override
    public List<PartyPackageDTO> getAllPartyPackages() {
        List<PartyPackage> partyPackages = partyPackageRepository.findAll();
        return partyPackages.stream()
                .map(partyPackageConverter::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PartyPackageDTO updatePartyPackage(Long id, PartyPackageDTO partyPackageDTO) {
        return null;
    }

//    @Override
//    public PartyPackageDTO updatePartyPackage(Long id, PartyPackageDTO partyPackageDTO) {
//        PartyPackage partyPackageToUpdate = partyPackageRepository.findById(id).orElse(null);
//        if (partyPackageToUpdate != null) {
//            // Update fields manually
//            partyPackageToUpdate.setSpecialServices(partyPackageDTO.getSpecialServices());
//            partyPackageToUpdate.setPartyThemes(partyPackageDTO.getPartyThemes());
//            partyPackageToUpdate.setMenus(partyPackageDTO.getMenus());
//            partyPackageToUpdate.setPrice(partyPackageDTO.getPrice());
//
//            PartyPackage updatedPartyPackage = partyPackageRepository.save(partyPackageToUpdate);
//            return partyPackageConverter.convertToDTO(updatedPartyPackage);
//        }
//        return null;
//    }


    @Override
    public void deletePartyPackage(Long id) {
        partyPackageRepository.deleteById(id);
    }
}
