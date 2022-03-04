package com.tools.spring.soap.api.service;

import org.springframework.stereotype.Service;

import org.csapi.schema.parlayx.data.sync.v1_0.local.Acknowledgement;
import org.csapi.schema.parlayx.data.sync.v1_0.local.SyncSubscriptionDataRequest;


@Service
public class PrmSoapService {

	public Acknowledgement buildResult(SyncSubscriptionDataRequest request) {
		Acknowledgement syncSubscriptionData = new Acknowledgement();
		
		syncSubscriptionData.setResult(0);
		
		return syncSubscriptionData;

	}

}
