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

package io.hexaforce.models

import io.hexaforce.models.Category
import io.hexaforce.models.Tag

import com.squareup.moshi.Json

/**
 * 
 *
 * @param name 
 * @param photoUrls 
 * @param id 
 * @param category 
 * @param tags 
 * @param status pet status in the store
 */

data class Pet (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "photoUrls")
    val photoUrls: kotlin.collections.List<kotlin.String>,

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "category")
    val category: Category? = null,

    @Json(name = "tags")
    val tags: kotlin.collections.List<Tag>? = null,

    /* pet status in the store */
    @Json(name = "status")
    val status: Pet.Status? = null

) {

    /**
     * pet status in the store
     *
     * Values: available,pending,sold
     */
    enum class Status(val value: kotlin.String) {
        @Json(name = "available") available("available"),
        @Json(name = "pending") pending("pending"),
        @Json(name = "sold") sold("sold");
    }
}

