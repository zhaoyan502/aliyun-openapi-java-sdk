/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.rdc.model.v20180821;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rdc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SearchWorkitemRequest extends RpcAcsRequest<SearchWorkitemResponse> {
	   

	private Integer sprintId;

	private String createdAtEnd;

	private String corpIdentifier;

	private String createdAtStart;

	private Integer toPage;

	private Integer pageSize;

	private String stamp;

	private Integer aKProjectId;
	public SearchWorkitemRequest() {
		super("Rdc", "2018-08-21", "SearchWorkitem");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getSprintId() {
		return this.sprintId;
	}

	public void setSprintId(Integer sprintId) {
		this.sprintId = sprintId;
		if(sprintId != null){
			putBodyParameter("SprintId", sprintId.toString());
		}
	}

	public String getCreatedAtEnd() {
		return this.createdAtEnd;
	}

	public void setCreatedAtEnd(String createdAtEnd) {
		this.createdAtEnd = createdAtEnd;
		if(createdAtEnd != null){
			putBodyParameter("CreatedAtEnd", createdAtEnd);
		}
	}

	public String getCorpIdentifier() {
		return this.corpIdentifier;
	}

	public void setCorpIdentifier(String corpIdentifier) {
		this.corpIdentifier = corpIdentifier;
		if(corpIdentifier != null){
			putQueryParameter("CorpIdentifier", corpIdentifier);
		}
	}

	public String getCreatedAtStart() {
		return this.createdAtStart;
	}

	public void setCreatedAtStart(String createdAtStart) {
		this.createdAtStart = createdAtStart;
		if(createdAtStart != null){
			putBodyParameter("CreatedAtStart", createdAtStart);
		}
	}

	public Integer getToPage() {
		return this.toPage;
	}

	public void setToPage(Integer toPage) {
		this.toPage = toPage;
		if(toPage != null){
			putBodyParameter("ToPage", toPage.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getStamp() {
		return this.stamp;
	}

	public void setStamp(String stamp) {
		this.stamp = stamp;
		if(stamp != null){
			putBodyParameter("Stamp", stamp);
		}
	}

	public Integer getAKProjectId() {
		return this.aKProjectId;
	}

	public void setAKProjectId(Integer aKProjectId) {
		this.aKProjectId = aKProjectId;
		if(aKProjectId != null){
			putBodyParameter("AKProjectId", aKProjectId.toString());
		}
	}

	@Override
	public Class<SearchWorkitemResponse> getResponseClass() {
		return SearchWorkitemResponse.class;
	}

}
