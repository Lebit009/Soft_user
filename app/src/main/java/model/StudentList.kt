package model

import Adapter.StudentAdapter
import FRagment.ViewFragment

val listStudent: ArrayList<Students> =  ArrayList()
val adapter = StudentAdapter(listStudent, ViewFragment())

fun add(){ listStudent.add(Students("Basanta Thapa",
        20,
        "Manamiaiju",
        "Male",
        "https://cdn.onlinewebfonts.com/svg/img_504768.png"))
    listStudent.add(Students(
            "Lebina Magar",
            17,"Baniyatar",
            "Female",
            "https://www.pngitem.com/pimgs/m/110-1104775_user-woman-business-woman-png-icon-transparent-png.png"))
    listStudent.add(Students("Ram",
            26,
            "others",
            "Buspark",
            "https://img.icons8.com/cotton/2x/gender.png"))}

