package org.am.mypotrfolio.service;

import java.util.Set;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import com.am.common.amcommondata.model.asset.AssetModel;
import com.am.common.amcommondata.model.enums.BrokerType;

public interface PortfolioService {

    Set<AssetModel> processPortfolioFile(MultipartFile fileName, UUID processId, BrokerType brokerType);
    
    default Double getDouble(String value) {
        return Double.parseDouble(value.replaceAll(",", ""));
    }
}
