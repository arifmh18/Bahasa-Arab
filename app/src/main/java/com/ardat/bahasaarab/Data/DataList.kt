package com.ardat.bahasaarab.Data

object DataList {
    private val listBab = arrayListOf(
        "الوحدة ١",
        "الوحدة ٢",
        "الوحدة ٣",
        "الوحدة ٤",
        "الوحدة ٥",
        "الوحدة ٦",
        "الوحدة ٧",
        "الوحدة ٨",
        "الوحدة ٩",
        "الوحدة ١٠",
        "الوحدة ١١"
    )
    private val listTitle = arrayListOf(
        "العناية بالصحة",
        "الترويح عن النفس",
        "الترويح عن النفس",
        "الحياة في المدينة",
        "العلم والتعلم",
        "المهن",
        "اللغة العربية",
        "العالم قرية صغيرة",
        "النظافة",
        "الإسلام",
        "الشباب",
        "العالم الإسلامي"
    )

    val listData : ArrayList<ModelData>
    get() {
        val list = arrayListOf<ModelData>()
        for (position in listBab.indices){
            val data = ModelData()
            data.bab = listBab[position]
            data.title = listTitle[position]
            list.add(data)
        }
        return list
    }
}