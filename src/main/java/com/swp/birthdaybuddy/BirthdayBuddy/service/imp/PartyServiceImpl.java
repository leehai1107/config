package com.swp.birthdaybuddy.BirthdayBuddy.service.imp;

import com.swp.birthdaybuddy.BirthdayBuddy.converter.PartyConverter;
import com.swp.birthdaybuddy.BirthdayBuddy.dto.PartyDTO;
import com.swp.birthdaybuddy.BirthdayBuddy.model.Party;
import com.swp.birthdaybuddy.BirthdayBuddy.model.PartyPackage;
import com.swp.birthdaybuddy.BirthdayBuddy.model.Restaurant;
import com.swp.birthdaybuddy.BirthdayBuddy.repository.PartyPackageRepository;
import com.swp.birthdaybuddy.BirthdayBuddy.repository.PartyRepository;
import com.swp.birthdaybuddy.BirthdayBuddy.repository.RestaurantRepository;
import com.swp.birthdaybuddy.BirthdayBuddy.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PartyServiceImpl implements PartyService {

    private final PartyRepository partyRepository;
    private final PartyPackageRepository partyPackageRepository;
    private final PartyConverter partyConverter;

    @Autowired
    public PartyServiceImpl(PartyRepository partyRepository, PartyPackageRepository partyPackageRepository, PartyConverter partyConverter) {
        this.partyRepository = partyRepository;
        this.partyPackageRepository = partyPackageRepository;
        this.partyConverter = partyConverter;
    }

    @Override
    public PartyDTO getPartyById(Long id) {
        Party party = partyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Party not found"));
        return partyConverter.toDTO(party);
    }

    @Override
    public PartyDTO createParty(PartyDTO partyDTO) {
        PartyPackage partyPackage = partyPackageRepository.findById(partyDTO.getPartyPackageId())
                .orElseThrow(() -> new RuntimeException("PartyPackage not found"));

        Party party = partyConverter.toEntity(partyDTO);
        party.setPartyThemes(partyPackage.getPartyThemes());
        party.setSpecialServices(partyPackage.getSpecialServices());
        party.setMenus(partyPackage.getMenus());

        // Save the party entity
        Party savedParty = partyRepository.save(party);

        // Convert and return the saved party as DTO
        return partyConverter.toDTO(savedParty);
    }

    @Override
    public PartyDTO updateParty(Long id, PartyDTO partyDTO) {
        Party existingParty = partyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Party not found"));

        // Update party details
        Party updatedParty = partyConverter.toEntity(partyDTO);
        updatedParty.setId(id); // Ensure that the ID is set to the correct value

        // Save the updated party
        updatedParty = partyRepository.save(updatedParty);

        // Convert and return the updated party as DTO
        return partyConverter.toDTO(updatedParty);
    }

    @Override
    public void deleteParty(Long id) {
        partyRepository.deleteById(id);
    }

    @Override
    public List<PartyDTO> getAllParties() {
        List<Party> parties = partyRepository.findAll();
        return parties.stream()
                .map(partyConverter::toDTO)
                .collect(Collectors.toList());
    }
    @Override
    public PartyDTO cancelParty(Long id) {
        Optional<Party> optionalParty = partyRepository.findById(id);
        if (optionalParty.isPresent()) {
            Party party = optionalParty.get();
            party.setStatus("Cancelled");
            partyRepository.save(party);
            return partyConverter.toDTO(party);
        } else {
            throw new RuntimeException("Party not found with ID: " + id);
        }
    }
}
