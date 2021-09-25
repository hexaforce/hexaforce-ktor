/**
* Swagger Petstore
* This is a sample server Petstore server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.
*
* The version of the OpenAPI document: 1.0.0
* Contact: apiteam@swagger.io
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package io.hexaforce.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * 
 * @param code 
 * @param type 
 * @param message 
 */
object ApiResponses : BaseTable<ApiResponse>("ApiResponse") {
    val code = int("code") /* null */
    val type = text("type") /* null */
    val message = text("message") /* null */

    /**
     * Create an entity of type ApiResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ApiResponse(
        code = row[code]  /* kotlin.Int? */,
        type = row[type]  /* kotlin.String? */,
        message = row[message]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type ApiResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ApiResponse()
    * database.update(ApiResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ApiResponse) {
        this.apply {
            set(ApiResponses.code, entity.code)
            set(ApiResponses.type, entity.type)
            set(ApiResponses.message, entity.message)
        }
    }

}


