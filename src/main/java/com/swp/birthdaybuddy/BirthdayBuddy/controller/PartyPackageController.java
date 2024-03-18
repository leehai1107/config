package com.swp.birthdaybuddy.BirthdayBuddy.controller;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.PartyPackageDTO;
import com.swp.birthdaybuddy.BirthdayBuddy.service.PartyPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/party-packages")
public class PartyPackageController {

    @Autowired
    private PartyPackageService partyPackageService;

    @PostMapping("/create")
    public ResponseEntity<PartyPackageDTO> createParty(@RequestBody PartyPackageDTO partyPackageDTO) {
        PartyPackageDTO createdPartyPackageDTO = partyPackageService.createPartyPackage(partyPackageDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPartyPackageDTO);
    }

    @DeleteMapping("/delete/{partyPackageId}")
    public ResponseEntity<Void> deleteParty(@PathVariable Long partyPackageId) {
        partyPackageService.deletePartyPackage(partyPackageId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/update/{partyPackageId}")
    public ResponseEntity<PartyPackageDTO> updateParty(
            @PathVariable Long partyPackageId, @RequestBody PartyPackageDTO updatedPartyPackageDTO) {
        PartyPackageDTO updatedPartyPackage = partyPackageService.updatePartyPackage(partyPackageId, updatedPartyPackageDTO);
        return ResponseEntity.ok(updatedPartyPackage);
    }

    @GetMapping("/{partyPackageId}")
    public ResponseEntity<PartyPackageDTO> getParty(@PathVariable Long partyPackageId) {
        PartyPackageDTO partyPackageDTO = partyPackageService.getPartyPackage(partyPackageId);
        return ResponseEntity.ok(partyPackageDTO);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PartyPackageDTO>> getAllParties() {
        List<PartyPackageDTO> partyPackages = partyPackageService.getAllPartyPackages();
        return ResponseEntity.ok(partyPackages);
    }
}
