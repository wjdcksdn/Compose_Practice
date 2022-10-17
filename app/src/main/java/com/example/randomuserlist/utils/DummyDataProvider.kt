package com.example.randomuserlist.utils

data class RandomUser(
    val name : String = "GSM학생",
    val description : String = "오늘도 화이팅",
    val profileImage : String = "https://randomuser.me/api/portraits/men/34.jpg"
)

object DummyDataProvider {

    val userList = List<RandomUser>(200){ RandomUser() }

}