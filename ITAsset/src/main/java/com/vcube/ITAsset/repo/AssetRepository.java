
package com.vcube.ITAsset.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vcube.ITAsset.model.Asset;

public interface AssetRepository
        extends JpaRepository<Asset, Integer> {

}
