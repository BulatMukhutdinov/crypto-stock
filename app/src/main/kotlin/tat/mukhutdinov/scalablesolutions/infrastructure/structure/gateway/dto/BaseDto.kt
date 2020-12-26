package tat.mukhutdinov.scalablesolutions.infrastructure.structure.gateway.dto

import com.google.gson.annotations.SerializedName

class BaseDto<T>(
    @SerializedName("data")
    val data: T?,
    @SerializedName("error_code")
    val errorCode: Int
)