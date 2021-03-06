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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.RetryAKSOpsTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RetryAKSOpsTaskResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String actionHandlerCode;

		private String arrangementId;

		private String serviceGroupCollectionId;

		private String serviceGroupId;

		private String serviceId;

		private List<ContextItem> context;

		private EntityRelation entityRelation;

		public String getActionHandlerCode() {
			return this.actionHandlerCode;
		}

		public void setActionHandlerCode(String actionHandlerCode) {
			this.actionHandlerCode = actionHandlerCode;
		}

		public String getArrangementId() {
			return this.arrangementId;
		}

		public void setArrangementId(String arrangementId) {
			this.arrangementId = arrangementId;
		}

		public String getServiceGroupCollectionId() {
			return this.serviceGroupCollectionId;
		}

		public void setServiceGroupCollectionId(String serviceGroupCollectionId) {
			this.serviceGroupCollectionId = serviceGroupCollectionId;
		}

		public String getServiceGroupId() {
			return this.serviceGroupId;
		}

		public void setServiceGroupId(String serviceGroupId) {
			this.serviceGroupId = serviceGroupId;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public List<ContextItem> getContext() {
			return this.context;
		}

		public void setContext(List<ContextItem> context) {
			this.context = context;
		}

		public EntityRelation getEntityRelation() {
			return this.entityRelation;
		}

		public void setEntityRelation(EntityRelation entityRelation) {
			this.entityRelation = entityRelation;
		}

		public static class ContextItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class EntityRelation {

			private String parentEntityType;

			private String parentId;

			private String processDefinitionId;

			private TransitableWithStateEntity transitableWithStateEntity;

			public String getParentEntityType() {
				return this.parentEntityType;
			}

			public void setParentEntityType(String parentEntityType) {
				this.parentEntityType = parentEntityType;
			}

			public String getParentId() {
				return this.parentId;
			}

			public void setParentId(String parentId) {
				this.parentId = parentId;
			}

			public String getProcessDefinitionId() {
				return this.processDefinitionId;
			}

			public void setProcessDefinitionId(String processDefinitionId) {
				this.processDefinitionId = processDefinitionId;
			}

			public TransitableWithStateEntity getTransitableWithStateEntity() {
				return this.transitableWithStateEntity;
			}

			public void setTransitableWithStateEntity(TransitableWithStateEntity transitableWithStateEntity) {
				this.transitableWithStateEntity = transitableWithStateEntity;
			}

			public static class TransitableWithStateEntity {

				private String state;

				private EnvExecutableEntityWithResult envExecutableEntityWithResult;

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public EnvExecutableEntityWithResult getEnvExecutableEntityWithResult() {
					return this.envExecutableEntityWithResult;
				}

				public void setEnvExecutableEntityWithResult(EnvExecutableEntityWithResult envExecutableEntityWithResult) {
					this.envExecutableEntityWithResult = envExecutableEntityWithResult;
				}

				public static class EnvExecutableEntityWithResult {

					private List<MessageDetailItem> messageDetail;

					private List<MessageParamsItem> messageParams;

					private EnvExecutableEntity envExecutableEntity;

					private ErrorCode errorCode;

					public List<MessageDetailItem> getMessageDetail() {
						return this.messageDetail;
					}

					public void setMessageDetail(List<MessageDetailItem> messageDetail) {
						this.messageDetail = messageDetail;
					}

					public List<MessageParamsItem> getMessageParams() {
						return this.messageParams;
					}

					public void setMessageParams(List<MessageParamsItem> messageParams) {
						this.messageParams = messageParams;
					}

					public EnvExecutableEntity getEnvExecutableEntity() {
						return this.envExecutableEntity;
					}

					public void setEnvExecutableEntity(EnvExecutableEntity envExecutableEntity) {
						this.envExecutableEntity = envExecutableEntity;
					}

					public ErrorCode getErrorCode() {
						return this.errorCode;
					}

					public void setErrorCode(ErrorCode errorCode) {
						this.errorCode = errorCode;
					}

					public static class MessageDetailItem {

						private String key;

						private String value;

						public String getKey() {
							return this.key;
						}

						public void setKey(String key) {
							this.key = key;
						}

						public String getValue() {
							return this.value;
						}

						public void setValue(String value) {
							this.value = value;
						}
					}

					public static class MessageParamsItem {

						private String data;

						public String getData() {
							return this.data;
						}

						public void setData(String data) {
							this.data = data;
						}
					}

					public static class EnvExecutableEntity {

						private String finishedTime;

						private Boolean standaloneExecutable;

						private String startedTime;

						private EnvEntity envEntity;

						public String getFinishedTime() {
							return this.finishedTime;
						}

						public void setFinishedTime(String finishedTime) {
							this.finishedTime = finishedTime;
						}

						public Boolean getStandaloneExecutable() {
							return this.standaloneExecutable;
						}

						public void setStandaloneExecutable(Boolean standaloneExecutable) {
							this.standaloneExecutable = standaloneExecutable;
						}

						public String getStartedTime() {
							return this.startedTime;
						}

						public void setStartedTime(String startedTime) {
							this.startedTime = startedTime;
						}

						public EnvEntity getEnvEntity() {
							return this.envEntity;
						}

						public void setEnvEntity(EnvEntity envEntity) {
							this.envEntity = envEntity;
						}

						public static class EnvEntity {

							private String regionId;

							private String runEnv;

							private String tenantId;

							private String workspaceId;

							private Entity entity;

							public String getRegionId() {
								return this.regionId;
							}

							public void setRegionId(String regionId) {
								this.regionId = regionId;
							}

							public String getRunEnv() {
								return this.runEnv;
							}

							public void setRunEnv(String runEnv) {
								this.runEnv = runEnv;
							}

							public String getTenantId() {
								return this.tenantId;
							}

							public void setTenantId(String tenantId) {
								this.tenantId = tenantId;
							}

							public String getWorkspaceId() {
								return this.workspaceId;
							}

							public void setWorkspaceId(String workspaceId) {
								this.workspaceId = workspaceId;
							}

							public Entity getEntity() {
								return this.entity;
							}

							public void setEntity(Entity entity) {
								this.entity = entity;
							}

							public static class Entity {

								private String createdTime;

								private String id;

								private String modifiedTime;

								public String getCreatedTime() {
									return this.createdTime;
								}

								public void setCreatedTime(String createdTime) {
									this.createdTime = createdTime;
								}

								public String getId() {
									return this.id;
								}

								public void setId(String id) {
									this.id = id;
								}

								public String getModifiedTime() {
									return this.modifiedTime;
								}

								public void setModifiedTime(String modifiedTime) {
									this.modifiedTime = modifiedTime;
								}
							}
						}
					}

					public static class ErrorCode {

						private String exceptionCode;

						private String level;

						private String prefix;

						private String scene;

						private String type;

						private String version;

						public String getExceptionCode() {
							return this.exceptionCode;
						}

						public void setExceptionCode(String exceptionCode) {
							this.exceptionCode = exceptionCode;
						}

						public String getLevel() {
							return this.level;
						}

						public void setLevel(String level) {
							this.level = level;
						}

						public String getPrefix() {
							return this.prefix;
						}

						public void setPrefix(String prefix) {
							this.prefix = prefix;
						}

						public String getScene() {
							return this.scene;
						}

						public void setScene(String scene) {
							this.scene = scene;
						}

						public String getType() {
							return this.type;
						}

						public void setType(String type) {
							this.type = type;
						}

						public String getVersion() {
							return this.version;
						}

						public void setVersion(String version) {
							this.version = version;
						}
					}
				}
			}
		}
	}

	@Override
	public RetryAKSOpsTaskResponse getInstance(UnmarshallerContext context) {
		return	RetryAKSOpsTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
