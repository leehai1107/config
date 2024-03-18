package com.swp.birthdaybuddy.BirthdayBuddy.service;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.PartyPackageDTO;

import java.util.List;

public interface PartyPackageService {
    PartyPackageDTO createPartyPackage(PartyPackageDTO partyPackageDTO);
    PartyPackageDTO getPartyPackage(Long id);
    List<PartyPackageDTO> getAllPartyPackages();
    PartyPackageDTO updatePartyPackage(Long id, PartyPackageDTO partyPackageDTO);
    void deletePartyPackage(Long id);
}
