/**
 * Swagger Petstore
 *
 * This is a sample server Petstore server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.hexaforce.client

import io.hexaforce.models.ApiResponse
import io.hexaforce.models.Pet

import io.hexaforce.infrastructure.ApiClient
import io.hexaforce.infrastructure.ClientException
import io.hexaforce.infrastructure.ClientError
import io.hexaforce.infrastructure.ServerException
import io.hexaforce.infrastructure.ServerError
import io.hexaforce.infrastructure.MultiValueMap
import io.hexaforce.infrastructure.RequestConfig
import io.hexaforce.infrastructure.RequestMethod
import io.hexaforce.infrastructure.ResponseType
import io.hexaforce.infrastructure.Success
import io.hexaforce.infrastructure.toMultiValue

class PetApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("io.hexaforce.baseUrl", "https://petstore.swagger.io/v2")
        }
    }

    /**
    * Add a new pet to the store
    * 
    * @param body Pet object that needs to be added to the store 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun addPet(body: Pet) : Unit {
        val localVariableConfig = addPetRequestConfig(body = body)

        val localVarResponse = request<Pet, Unit>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation addPet
    *
    * @param body Pet object that needs to be added to the store 
    * @return RequestConfig
    */
    fun addPetRequestConfig(body: Pet) : RequestConfig<Pet> {
        val localVariableBody = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/pet",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Deletes a pet
    * 
    * @param petId Pet id to delete 
    * @param apiKey  (optional)
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun deletePet(petId: kotlin.Long, apiKey: kotlin.String?) : Unit {
        val localVariableConfig = deletePetRequestConfig(petId = petId, apiKey = apiKey)

        val localVarResponse = request<Unit, Unit>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation deletePet
    *
    * @param petId Pet id to delete 
    * @param apiKey  (optional)
    * @return RequestConfig
    */
    fun deletePetRequestConfig(petId: kotlin.Long, apiKey: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        apiKey?.apply { localVariableHeaders["api_key"] = this.toString() }

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/pet/{petId}".replace("{"+"petId"+"}", "$petId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Finds Pets by status
    * Multiple status values can be provided with comma separated strings
    * @param status Status values that need to be considered for filter 
    * @return kotlin.collections.List<Pet>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun findPetsByStatus(status: kotlin.collections.List<kotlin.String>) : kotlin.collections.List<Pet> {
        val localVariableConfig = findPetsByStatusRequestConfig(status = status)

        val localVarResponse = request<Unit, kotlin.collections.List<Pet>>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<Pet>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation findPetsByStatus
    *
    * @param status Status values that need to be considered for filter 
    * @return RequestConfig
    */
    fun findPetsByStatusRequestConfig(status: kotlin.collections.List<kotlin.String>) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("status", toMultiValue(status.toList(), "multi"))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/pet/findByStatus",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Finds Pets by tags
    * Muliple tags can be provided with comma separated strings. Use         tag1, tag2, tag3 for testing.
    * @param tags Tags to filter by 
    * @return kotlin.collections.List<Pet>
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun findPetsByTags(tags: kotlin.collections.List<kotlin.String>) : kotlin.collections.List<Pet> {
        @Suppress("DEPRECATION")
        val localVariableConfig = findPetsByTagsRequestConfig(tags = tags)

        val localVarResponse = request<Unit, kotlin.collections.List<Pet>>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.collections.List<Pet>
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation findPetsByTags
    *
    * @param tags Tags to filter by 
    * @return RequestConfig
    */
    @Deprecated(message = "This operation is deprecated.")
    fun findPetsByTagsRequestConfig(tags: kotlin.collections.List<kotlin.String>) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                put("tags", toMultiValue(tags.toList(), "multi"))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/pet/findByTags",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Find pet by ID
    * Returns a single pet
    * @param petId ID of pet to return 
    * @return Pet
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getPetById(petId: kotlin.Long) : Pet {
        val localVariableConfig = getPetByIdRequestConfig(petId = petId)

        val localVarResponse = request<Unit, Pet>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as Pet
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation getPetById
    *
    * @param petId ID of pet to return 
    * @return RequestConfig
    */
    fun getPetByIdRequestConfig(petId: kotlin.Long) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/pet/{petId}".replace("{"+"petId"+"}", "$petId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Update an existing pet
    * 
    * @param body Pet object that needs to be added to the store 
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updatePet(body: Pet) : Unit {
        val localVariableConfig = updatePetRequestConfig(body = body)

        val localVarResponse = request<Pet, Unit>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation updatePet
    *
    * @param body Pet object that needs to be added to the store 
    * @return RequestConfig
    */
    fun updatePetRequestConfig(body: Pet) : RequestConfig<Pet> {
        val localVariableBody = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/pet",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Updates a pet in the store with form data
    * 
    * @param petId ID of pet that needs to be updated 
    * @param name Updated name of the pet (optional)
    * @param status Updated status of the pet (optional)
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun updatePetWithForm(petId: kotlin.Long, name: kotlin.String?, status: kotlin.String?) : Unit {
        val localVariableConfig = updatePetWithFormRequestConfig(petId = petId, name = name, status = status)

        val localVarResponse = request<Map<String, Any?>, Unit>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation updatePetWithForm
    *
    * @param petId ID of pet that needs to be updated 
    * @param name Updated name of the pet (optional)
    * @param status Updated status of the pet (optional)
    * @return RequestConfig
    */
    fun updatePetWithFormRequestConfig(petId: kotlin.Long, name: kotlin.String?, status: kotlin.String?) : RequestConfig<Map<String, Any?>> {
        val localVariableBody = mapOf("name" to name, "status" to status)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "application/x-www-form-urlencoded")

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/pet/{petId}".replace("{"+"petId"+"}", "$petId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * uploads an image
    * 
    * @param petId ID of pet to update 
    * @param additionalMetadata Additional data to pass to server (optional)
    * @param file file to upload (optional)
    * @return ApiResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun uploadFile(petId: kotlin.Long, additionalMetadata: kotlin.String?, file: java.io.File?) : ApiResponse {
        val localVariableConfig = uploadFileRequestConfig(petId = petId, additionalMetadata = additionalMetadata, file = file)

        val localVarResponse = request<Map<String, Any?>, ApiResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApiResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation uploadFile
    *
    * @param petId ID of pet to update 
    * @param additionalMetadata Additional data to pass to server (optional)
    * @param file file to upload (optional)
    * @return RequestConfig
    */
    fun uploadFileRequestConfig(petId: kotlin.Long, additionalMetadata: kotlin.String?, file: java.io.File?) : RequestConfig<Map<String, Any?>> {
        val localVariableBody = mapOf("additionalMetadata" to additionalMetadata, "file" to file)
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf("Content-Type" to "multipart/form-data")

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/pet/{petId}/uploadImage".replace("{"+"petId"+"}", "$petId"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
