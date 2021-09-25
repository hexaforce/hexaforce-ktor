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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param name 
 */

data class Category (

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "name")
    val name: kotlin.String? = null

)
