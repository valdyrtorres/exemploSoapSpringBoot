package com.tools.spring.soap.api.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import org.csapi.schema.parlayx.data.sync.v1_0.local.Acknowledgement;
import org.csapi.schema.parlayx.data.sync.v1_0.local.SyncSubscriptionDataRequest;

import com.tools.spring.soap.api.service.PrmSoapService;

@Endpoint
public class PrmSoapindicatorEndpoint {

	private static final String NAMESPACE = "http://www.csapi.org/schema/parlayx/data/sync/v1_0/local";
	@Autowired
	private PrmSoapService service;

	@PayloadRoot(namespace = NAMESPACE, localPart = "SyncSubscriptionDataRequest")
	@ResponsePayload
	public Acknowledgement getResult(@RequestPayload SyncSubscriptionDataRequest request) {
		return service.buildResult(request);
	}

}