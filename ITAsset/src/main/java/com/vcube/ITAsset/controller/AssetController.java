
package com.vcube.ITAsset.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.vcube.ITAsset.model.Asset;
import com.vcube.ITAsset.repo.AssetRepository;

@RestController
@RequestMapping("/assets")
@CrossOrigin(origins = "*")
public class AssetController {

    private final AssetRepository repository;

    public AssetController(AssetRepository repository) {
        this.repository = repository;
    }

    // CREATE - Add Asset
    @PostMapping
    public ResponseEntity<Asset> addAsset(
            @RequestBody Asset asset) {

        asset.setAssetId(null);

        Asset savedAsset = repository.save(asset);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedAsset);
    }

    // READ - Get All Assets
    @GetMapping
    public List<Asset> getAllAssets() {
        return repository.findAll();
    }

    // READ - Get Asset By ID
    @GetMapping("/{id}")
    public ResponseEntity<Asset> getAssetById(
            @PathVariable Integer id) {

        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // UPDATE - Update Asset
    @PutMapping("/{id}")
    public ResponseEntity<Asset> updateAsset(
            @PathVariable Integer id,
            @RequestBody Asset details) {

        return repository.findById(id)
                .map(asset -> {

                    asset.setAssetName(details.getAssetName());
                    asset.setAssetType(details.getAssetType());
                    asset.setStatus(details.getStatus());

                    Asset updatedAsset = repository.save(asset);

                    return ResponseEntity.ok(updatedAsset);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE - Delete Asset
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAsset(
            @PathVariable Integer id) {

    	if (!repository.existsById(id)) {
    	    return ResponseEntity.notFound().build();
    	}

    	repository.deleteById(id);

    	return ResponseEntity.noContent().build();

    }
}
