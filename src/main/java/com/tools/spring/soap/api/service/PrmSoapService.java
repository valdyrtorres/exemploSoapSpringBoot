package com.tools.spring.soap.api.service;

import org.springframework.stereotype.Service;

import org.csapi.schema.parlayx.data.sync.v1_0.local.SyncSubscriptionDataResponse;
import org.csapi.schema.parlayx.data.sync.v1_0.local.SyncSubscriptionDataRequest;


@Service
public class PrmSoapService {

	public SyncSubscriptionDataResponse buildResult(SyncSubscriptionDataRequest request) {
		SyncSubscriptionDataResponse syncSubscriptionData = new SyncSubscriptionDataResponse();
		
		syncSubscriptionData.setResult(0);
		
		return syncSubscriptionData;

	}

}
