package model

import Adapter.StudentAdapter
import FRagment.ViewFragment

val listStudent: ArrayList<Students> =  ArrayList()
val adapter = StudentAdapter(listStudent, ViewFragment())

fun add(){ listStudent.add(Students("Abidit Shrestha",
        20,
        "Kapan",
        "Male",
        "https://cdn.onlinewebfonts.com/svg/img_504768.png"))
    listStudent.add(Students(
            "Issa STH",
            21,"Airport",
            "Female",
            "https://www.pngitem.com/pimgs/m/110-1104775_user-woman-business-woman-png-icon-transparent-png.png"))
    listStudent.add(Students("Abijeet STH",
            22,
            "Boudha",
            "male",
            "https://img.icons8.com/cotton/2x/gender.png"))}

