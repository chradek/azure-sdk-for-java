/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in WorkflowTriggerHistories.
 */
public class WorkflowTriggerHistoriesInner {
    /** The Retrofit service to perform REST calls. */
    private WorkflowTriggerHistoriesService service;
    /** The service client containing this operation class. */
    private LogicManagementClientImpl client;

    /**
     * Initializes an instance of WorkflowTriggerHistoriesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public WorkflowTriggerHistoriesInner(Retrofit retrofit, LogicManagementClientImpl client) {
        this.service = retrofit.create(WorkflowTriggerHistoriesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for WorkflowTriggerHistories to be
     * used by Retrofit to perform actually REST calls.
     */
    interface WorkflowTriggerHistoriesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerHistories list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName}/triggers/{triggerName}/histories")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workflowName") String workflowName, @Path("triggerName") String triggerName, @Query("api-version") String apiVersion, @Query("$top") Integer top, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerHistories get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName}/triggers/{triggerName}/histories/{historyName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workflowName") String workflowName, @Path("triggerName") String triggerName, @Path("historyName") String historyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerHistories resubmit" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Logic/workflows/{workflowName}/triggers/{triggerName}/histories/{historyName}/resubmit")
        Observable<Response<ResponseBody>> resubmit(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workflowName") String workflowName, @Path("triggerName") String triggerName, @Path("historyName") String historyName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.logic.v2016_06_01.WorkflowTriggerHistories listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;WorkflowTriggerHistoryInner&gt; object if successful.
     */
    public PagedList<WorkflowTriggerHistoryInner> list(final String resourceGroupName, final String workflowName, final String triggerName) {
        ServiceResponse<Page<WorkflowTriggerHistoryInner>> response = listSinglePageAsync(resourceGroupName, workflowName, triggerName).toBlocking().single();
        return new PagedList<WorkflowTriggerHistoryInner>(response.body()) {
            @Override
            public Page<WorkflowTriggerHistoryInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkflowTriggerHistoryInner>> listAsync(final String resourceGroupName, final String workflowName, final String triggerName, final ListOperationCallback<WorkflowTriggerHistoryInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, workflowName, triggerName),
            new Func1<String, Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkflowTriggerHistoryInner&gt; object
     */
    public Observable<Page<WorkflowTriggerHistoryInner>> listAsync(final String resourceGroupName, final String workflowName, final String triggerName) {
        return listWithServiceResponseAsync(resourceGroupName, workflowName, triggerName)
            .map(new Func1<ServiceResponse<Page<WorkflowTriggerHistoryInner>>, Page<WorkflowTriggerHistoryInner>>() {
                @Override
                public Page<WorkflowTriggerHistoryInner> call(ServiceResponse<Page<WorkflowTriggerHistoryInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkflowTriggerHistoryInner&gt; object
     */
    public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String workflowName, final String triggerName) {
        return listSinglePageAsync(resourceGroupName, workflowName, triggerName)
            .concatMap(new Func1<ServiceResponse<Page<WorkflowTriggerHistoryInner>>, Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> call(ServiceResponse<Page<WorkflowTriggerHistoryInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;WorkflowTriggerHistoryInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> listSinglePageAsync(final String resourceGroupName, final String workflowName, final String triggerName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workflowName == null) {
            throw new IllegalArgumentException("Parameter workflowName is required and cannot be null.");
        }
        if (triggerName == null) {
            throw new IllegalArgumentException("Parameter triggerName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final Integer top = null;
        final String filter = null;
        return service.list(this.client.subscriptionId(), resourceGroupName, workflowName, triggerName, this.client.apiVersion(), top, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<WorkflowTriggerHistoryInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<WorkflowTriggerHistoryInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: Status, StartTime, and ClientTrackingId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;WorkflowTriggerHistoryInner&gt; object if successful.
     */
    public PagedList<WorkflowTriggerHistoryInner> list(final String resourceGroupName, final String workflowName, final String triggerName, final Integer top, final String filter) {
        ServiceResponse<Page<WorkflowTriggerHistoryInner>> response = listSinglePageAsync(resourceGroupName, workflowName, triggerName, top, filter).toBlocking().single();
        return new PagedList<WorkflowTriggerHistoryInner>(response.body()) {
            @Override
            public Page<WorkflowTriggerHistoryInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: Status, StartTime, and ClientTrackingId.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkflowTriggerHistoryInner>> listAsync(final String resourceGroupName, final String workflowName, final String triggerName, final Integer top, final String filter, final ListOperationCallback<WorkflowTriggerHistoryInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, workflowName, triggerName, top, filter),
            new Func1<String, Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: Status, StartTime, and ClientTrackingId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkflowTriggerHistoryInner&gt; object
     */
    public Observable<Page<WorkflowTriggerHistoryInner>> listAsync(final String resourceGroupName, final String workflowName, final String triggerName, final Integer top, final String filter) {
        return listWithServiceResponseAsync(resourceGroupName, workflowName, triggerName, top, filter)
            .map(new Func1<ServiceResponse<Page<WorkflowTriggerHistoryInner>>, Page<WorkflowTriggerHistoryInner>>() {
                @Override
                public Page<WorkflowTriggerHistoryInner> call(ServiceResponse<Page<WorkflowTriggerHistoryInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param top The number of items to be included in the result.
     * @param filter The filter to apply on the operation. Options for filters include: Status, StartTime, and ClientTrackingId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkflowTriggerHistoryInner&gt; object
     */
    public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String workflowName, final String triggerName, final Integer top, final String filter) {
        return listSinglePageAsync(resourceGroupName, workflowName, triggerName, top, filter)
            .concatMap(new Func1<ServiceResponse<Page<WorkflowTriggerHistoryInner>>, Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> call(ServiceResponse<Page<WorkflowTriggerHistoryInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of workflow trigger histories.
     *
    ServiceResponse<PageImpl<WorkflowTriggerHistoryInner>> * @param resourceGroupName The resource group name.
    ServiceResponse<PageImpl<WorkflowTriggerHistoryInner>> * @param workflowName The workflow name.
    ServiceResponse<PageImpl<WorkflowTriggerHistoryInner>> * @param triggerName The workflow trigger name.
    ServiceResponse<PageImpl<WorkflowTriggerHistoryInner>> * @param top The number of items to be included in the result.
    ServiceResponse<PageImpl<WorkflowTriggerHistoryInner>> * @param filter The filter to apply on the operation. Options for filters include: Status, StartTime, and ClientTrackingId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;WorkflowTriggerHistoryInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> listSinglePageAsync(final String resourceGroupName, final String workflowName, final String triggerName, final Integer top, final String filter) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workflowName == null) {
            throw new IllegalArgumentException("Parameter workflowName is required and cannot be null.");
        }
        if (triggerName == null) {
            throw new IllegalArgumentException("Parameter triggerName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, workflowName, triggerName, this.client.apiVersion(), top, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<WorkflowTriggerHistoryInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<WorkflowTriggerHistoryInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<WorkflowTriggerHistoryInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<WorkflowTriggerHistoryInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<WorkflowTriggerHistoryInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a workflow trigger history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a run.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WorkflowTriggerHistoryInner object if successful.
     */
    public WorkflowTriggerHistoryInner get(String resourceGroupName, String workflowName, String triggerName, String historyName) {
        return getWithServiceResponseAsync(resourceGroupName, workflowName, triggerName, historyName).toBlocking().single().body();
    }

    /**
     * Gets a workflow trigger history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a run.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WorkflowTriggerHistoryInner> getAsync(String resourceGroupName, String workflowName, String triggerName, String historyName, final ServiceCallback<WorkflowTriggerHistoryInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workflowName, triggerName, historyName), serviceCallback);
    }

    /**
     * Gets a workflow trigger history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a run.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkflowTriggerHistoryInner object
     */
    public Observable<WorkflowTriggerHistoryInner> getAsync(String resourceGroupName, String workflowName, String triggerName, String historyName) {
        return getWithServiceResponseAsync(resourceGroupName, workflowName, triggerName, historyName).map(new Func1<ServiceResponse<WorkflowTriggerHistoryInner>, WorkflowTriggerHistoryInner>() {
            @Override
            public WorkflowTriggerHistoryInner call(ServiceResponse<WorkflowTriggerHistoryInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a workflow trigger history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a run.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkflowTriggerHistoryInner object
     */
    public Observable<ServiceResponse<WorkflowTriggerHistoryInner>> getWithServiceResponseAsync(String resourceGroupName, String workflowName, String triggerName, String historyName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workflowName == null) {
            throw new IllegalArgumentException("Parameter workflowName is required and cannot be null.");
        }
        if (triggerName == null) {
            throw new IllegalArgumentException("Parameter triggerName is required and cannot be null.");
        }
        if (historyName == null) {
            throw new IllegalArgumentException("Parameter historyName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, workflowName, triggerName, historyName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WorkflowTriggerHistoryInner>>>() {
                @Override
                public Observable<ServiceResponse<WorkflowTriggerHistoryInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WorkflowTriggerHistoryInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WorkflowTriggerHistoryInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WorkflowTriggerHistoryInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WorkflowTriggerHistoryInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Resubmits a workflow run based on the trigger history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a run.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void resubmit(String resourceGroupName, String workflowName, String triggerName, String historyName) {
        resubmitWithServiceResponseAsync(resourceGroupName, workflowName, triggerName, historyName).toBlocking().single().body();
    }

    /**
     * Resubmits a workflow run based on the trigger history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a run.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> resubmitAsync(String resourceGroupName, String workflowName, String triggerName, String historyName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(resubmitWithServiceResponseAsync(resourceGroupName, workflowName, triggerName, historyName), serviceCallback);
    }

    /**
     * Resubmits a workflow run based on the trigger history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a run.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> resubmitAsync(String resourceGroupName, String workflowName, String triggerName, String historyName) {
        return resubmitWithServiceResponseAsync(resourceGroupName, workflowName, triggerName, historyName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Resubmits a workflow run based on the trigger history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a run.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> resubmitWithServiceResponseAsync(String resourceGroupName, String workflowName, String triggerName, String historyName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workflowName == null) {
            throw new IllegalArgumentException("Parameter workflowName is required and cannot be null.");
        }
        if (triggerName == null) {
            throw new IllegalArgumentException("Parameter triggerName is required and cannot be null.");
        }
        if (historyName == null) {
            throw new IllegalArgumentException("Parameter historyName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.resubmit(this.client.subscriptionId(), resourceGroupName, workflowName, triggerName, historyName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = resubmitDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> resubmitDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;WorkflowTriggerHistoryInner&gt; object if successful.
     */
    public PagedList<WorkflowTriggerHistoryInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<WorkflowTriggerHistoryInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<WorkflowTriggerHistoryInner>(response.body()) {
            @Override
            public Page<WorkflowTriggerHistoryInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkflowTriggerHistoryInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<WorkflowTriggerHistoryInner>> serviceFuture, final ListOperationCallback<WorkflowTriggerHistoryInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkflowTriggerHistoryInner&gt; object
     */
    public Observable<Page<WorkflowTriggerHistoryInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<WorkflowTriggerHistoryInner>>, Page<WorkflowTriggerHistoryInner>>() {
                @Override
                public Page<WorkflowTriggerHistoryInner> call(ServiceResponse<Page<WorkflowTriggerHistoryInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;WorkflowTriggerHistoryInner&gt; object
     */
    public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<WorkflowTriggerHistoryInner>>, Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> call(ServiceResponse<Page<WorkflowTriggerHistoryInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of workflow trigger histories.
     *
    ServiceResponse<PageImpl<WorkflowTriggerHistoryInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;WorkflowTriggerHistoryInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<WorkflowTriggerHistoryInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<WorkflowTriggerHistoryInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<WorkflowTriggerHistoryInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<WorkflowTriggerHistoryInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<WorkflowTriggerHistoryInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<WorkflowTriggerHistoryInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
