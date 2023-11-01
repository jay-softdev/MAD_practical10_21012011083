package com.example.mad_practical10_21012011083

import org.json.JSONObject
import java.io.Serializable

class contect(val id:String,val name: String,val emailid: String,
    val phonenumber: String, val address: String,val latitude:Double,val longitude:Double):Serializable {
    /*
* [
* {"_id":"5f8d677c68d8ae7ceab6a732",
* "name":{"first":"Lloyd","last":"York"},
* "email":"lloyd.york@undefined.net",
* "phone":"+1 (817) 545-3660",
* "address":"311 Livonia Avenue, Belva, Ohio, 6019"}*/
    constructor(jsonObject: JSONObject):this("","","","","",0.0,0.0) {
        id = jsonObject.getString("id")
        emailid = jsonObject.getString("email")
        phonenumber = jsonObject.getString("phone")
        val profileJson = jsonObject.getJSONObject("profile")
        name = profileJson.getString("name")
        address = profileJson.getString("address")
        val locationJson = profileJson.getJSONObject("location")
        latitude = locationJson.getDouble("lat")
        longitude = locationJson.getDouble("long")
    }

}