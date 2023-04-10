package com.example.apicalldemo

data class ResponseData(
    val message: String,
    val user_id: Int,
    val name: String,
    val profile_details: ProfileDetails,
    val data_list: List<DataListDetails>
)

data class ProfileDetails(
    val is_profile_details: Boolean,
    val rating: Double
)

data class DataListDetails(
    val id: Int,
    val value: String
)
