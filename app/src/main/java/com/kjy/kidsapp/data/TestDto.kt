package com.kjy.kidsapp.data

import com.google.gson.annotations.SerializedName


data class TestDto(
  @SerializedName("slip")
  val slip: SlipData? = null
)

data class SlipData(
    @SerializedName("id")
    val slipId: Int? = null,
    @SerializedName("advice")
    val advice: String? = null
)