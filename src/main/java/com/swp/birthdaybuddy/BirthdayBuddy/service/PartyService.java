package com.swp.birthdaybuddy.BirthdayBuddy.service;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.PartyDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PartyService {
    PartyDTO getPartyById(Long id);
    PartyDTO createParty(PartyDTO partyDTO);
    PartyDTO updateParty(Long id, PartyDTO partyDTO);
    void deleteParty(Long id);
    List<PartyDTO> getAllParties();
    PartyDTO cancelParty(Long id);
}
